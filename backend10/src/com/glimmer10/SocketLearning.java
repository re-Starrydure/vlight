package com.glimmer10;

import java.io.*;
import java.net.Socket;


public class SocketLearning {
    public static void main(String[] args) {
        try {Socket socket = new Socket("127.0.0.1", 1145);//新建一个socket指定IP和端口
            OutputStream outputStream = socket.getOutputStream();//建立自socket连接服务端从而构建的输出流
            InputStream inputStream = socket.getInputStream();//建立自socket连接服务端从而构建的输入流
            PrintWriter printWriter = new PrintWriter(outputStream);//调用PrintWriter指定此输出流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));//将BufferReader串联到inputStream
            printWriter.println("message to send");
            printWriter.print("another message");//输出了两条信息
            String message = bufferedReader.readLine();//用message接受收到的信息
        } catch (Exception exception) {//catch一下可能出现的异常
            exception.printStackTrace();
        }
    }
}