# <center>微光后端第十题</center>

## 1.要建立一个连接，需要知道服务器的两个信息：它在哪里（IP地址），它在哪个端口运行（端口号）。这里提供教程来了解一下什么是**IP**和**TCP**

- **IP：**IP为互联网对通信的一种协议，会对连入互联网的设备进行编号，从而使设备信息被识别，同时路由器也借助IP传输信息。分为IPv4（逐渐不足）和IPv6（地址远多于前者）
- **TCP：**是一种客户端与服务端之间的传输控制协议，具有可靠性，会保证数据传输的完整性。其连接需要“三次握手”，即信息需要发送三次，以确保服务端与客户端的输出与响应均正常。同样，结束断开时需四次以保证文件传输完成。一般用于不可丢数据的传输，如邮件等。
- **TCP/IP：**互联网信息通信的国际标准，包含其上两条

> 与TCP相近的有UDP，特点是不保证数据传输的完整性，可用于直播，游戏等方向；除此之外还有一些浏览器与客户端的协议，以及特殊数据类型的协议

## 2. 但其实我们还有许多的建立远程连接和读写远程服务器的不同方法，可以了解一下什么是**URL**以及如何运用**URL**

- **URL：**当我在输入框打入“URL”时，输入法的另一个答案已经揭示了他的含义——统一资源定位器，或者说网页网址。由协议，主机名，端口号（HTTP默认80，HTTPS默认443），路径，字符串，片段
- URL是用来定位相应网页的地址，由于不同的IP不但多，而且复杂而难记，URL就是为网页对应的IP进行修饰，使其可读性增强，当用户输入URL时，服务器会通过定位器储存的路径转向原本的地址。
- 可以通过Java的net接口实现处理URL的功能，实现对网页的浏览，链接，请求，传输，下载等

## 3.**任务**： 改写上面的读写文件代码，采用**Socket**编程的方式进行远程连接的建立并读写远程服务器

- 代码如下

```java
public class SocketLearning {
    public static void main(String[] args) {
        try {Socket socket = new Socket("127.0.0.1", 1145);//新建一个socket指定IP和端口
            OutputStream outputStream = socket.getOutputStream();//建立自socket连接服务端从而构建的输出流
            InputStream inputStream = socket.getInputStream();//建立自socket连接服务端从而构建的输入流
            PrintWriter printWriter = new PrintWriter(outputStream);//调用PrintWriter指定此输出流
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
             //将BufferReader串联到inputStream
            printWriter.println("message to send");
            printWriter.print("another message");//输出了两条信息
            String message = bufferedReader.readLine();//用message接受收到的信息
        } catch (Exception exception) {//catch一下可能出现的异常
            exception.printStackTrace();
        }
    }
}
```

- socket近似为通信时通道两端使用的端点，包含着设备的IP地址与传输使用的应用使用的端口。

# PS：

- 如果答案实在有问题的话，可以给点提示和建议吗 qq：1187477643 多谢大佬（没时间也没关系）

### 参考网址：

[TCP/IP 介绍 | 菜鸟教程](https://www.runoob.com/tcpip/tcpip-intro.html)

[Java 实例 – ServerSocket 和 Socket 通信实例 | 菜鸟教程](https://www.runoob.com/java/net-serversocket-socket.html)

[Java URL 处理 | 菜鸟教程](https://www.runoob.com/java/java-url-processing.html)

[Uestc studio题目大全-最新的题目满分方案|菜鸟教程]([Java - 10 | 2024招新](https://advanced.www.glimmer.org.cn/md/后端/Java10-网络编程.html#任务))

[【网络编程知识】什么是Socket？概念及原理分析_network socket数量表示什么-CSDN博客](https://blog.csdn.net/zhangay1998/article/details/123504421)