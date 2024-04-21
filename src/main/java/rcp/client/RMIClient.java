/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/21 10:45
 */
package org.example.client;

import org.example.server.IRemoteObj;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class RMIClient {
    public static void main(String[] args) throws RemoteException, NotBoundException, UnknownHostException {
        Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1099);
        IRemoteObj remoteObj = (IRemoteObj) registry.lookup("remoteObj");
        // 从控制台输入卡号和金额
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入卡号：");
        String id = scanner.nextLine();
        System.out.print("请输入金额：");
        int money = scanner.nextInt();

        // 调用服务端方法，传递卡号、金额以及客户端IP地址
        String clientIP = java.net.InetAddress.getLocalHost().getHostAddress();
        remoteObj.msg(id, money, clientIP);

        String returnValue = remoteObj.getReturnValue(id);
        System.out.println("服务端返回的信息: " + returnValue);
    }
}
