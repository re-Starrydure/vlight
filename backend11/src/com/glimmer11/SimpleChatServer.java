package com.glimmer11;

import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;


public class SimpleChatServer {
    public static void main(String[] args) {
        new SimpleChatServer().go();
    }
    public void go() {
        try {
            ServerSocketChannel serverChannel = ServerSocketChannel.open();
            serverChannel.bind(new InetSocketAddress(5000));//绑定端口
            while (true) {//循环接受连接
                SocketChannel clientChannel = serverChannel.accept();
                System.out.println("已连接");
                Thread t = new Thread(new ClientHandler(clientChannel));//多线程
                t.start();
                Thread t2 = new Thread(new Sent(clientChannel));
                t2.start();
            }
        } catch (IOException e) {
            System.out.println("错了");
        }
    }

    private void tellEveryone(String message) {
        System.out.println(message);//在服务器上输出信息
    }


    public class ClientHandler implements Runnable {
    private SocketChannel socketChannel;

    public ClientHandler(SocketChannel socketChannel) {
        this.socketChannel = socketChannel;//构造有参构造器，以便引入socketchannel
    }

    @Override
    public void run() {//方法重写
        try {
            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String message;
            while ((message = bufferedReader.readLine()) != null) {//当接受的信息不为0时
                tellEveryone(message);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

    public class Sent implements Runnable {//此类用于输出信息
        private SocketChannel socketChannel;

        public Sent(SocketChannel socketChannel) {
            this.socketChannel = socketChannel;
        }

        @Override
        public void run() {
            Scanner scanner = new Scanner(System.in);
            try {
                Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer);
                while (true) {
                    String message = scanner.nextLine();
                    if ("退出".equals(message)) {
                        break;
                    }
                    printWriter.println(message);
                    printWriter.flush();
                }
            } catch (Exception e) {
                System.out.println("又错了");
            }
        }
    }
}


