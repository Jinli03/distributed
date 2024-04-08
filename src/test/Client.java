/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/3/12 21:00
 */
package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        InetAddress localHost = InetAddress.getLocalHost();

        Socket socket = new Socket(localHost,5000);
        System.out.println("服务器已连接");

        OutputStream outputStream = socket.getOutputStream();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入发送的数据");
//        String input = sc.next();
//        outputStream.write(input.getBytes());

        System.out.println("读取数据:");
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1){
            System.out.println(new String(buf, 0, readLen));
        }

        socket.close();
        inputStream.close();
        outputStream.close();
        System.out.println("客户端已关闭");
    }
}
