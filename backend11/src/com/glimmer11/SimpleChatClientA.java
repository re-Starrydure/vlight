package com.glimmer11;
import java.io.*;
import java.net.InetSocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SimpleChatClientA {
    private SocketChannel socketChannel;

    public void go() {
        setUpNetworking();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            Thread t = new Thread(new ClientHandler(socketChannel));//把接受信息改为另一线程
            t.start();
            String message = scanner.next();
            if ("退出".equals(message)) break;
            else sendMessage(message);
        }
    }

    private void setUpNetworking() {
        try {
            InetSocketAddress serverAddress = new InetSocketAddress("127.0.0.1", 5000);
            socketChannel = SocketChannel.open(serverAddress);
            System.out.println("已连接");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(String message) {
        if (socketChannel != null && socketChannel.isOpen()) {
            try {
                Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);
                PrintWriter printWriter = new PrintWriter(writer);
                printWriter.println(message);
                printWriter.flush();
                }catch (Exception e) {
                System.out.println("错误");
            }
        }
    }

    public static void main(String[] args) {
        SimpleChatClientA simpleChatClientA = new SimpleChatClientA();
        simpleChatClientA.go();

    }

    public class ClientHandler implements Runnable {
        private SocketChannel socketChannel;

        public ClientHandler(SocketChannel socketChannel) {
            this.socketChannel = socketChannel;
        }

        @Override
        public void run() {
            try {
                Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);
                BufferedReader bufferedReader = new BufferedReader(reader);
                String message;
                while ((message = bufferedReader.readLine()) != null) {
                    System.out.println(message);;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}