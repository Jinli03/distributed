/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/3/12 21:00
 */
package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("等待客户端连接");

        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        System.out.println("正在写入数据到数据通道");
        System.out.println("输入数据传送到客户端");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(input.getBytes());

        serverSocket.close();
        socket.close();
        inputStream.close();
        outputStream.close();
        System.out.println("服务器端已关闭");
    }
}
