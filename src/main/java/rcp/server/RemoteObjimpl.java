/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/21 10:38
 */
package org.example.server;

import lombok.Data;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

public class RemoteObjimpl extends UnicastRemoteObject implements IRemoteObj {
    private String returnValue;
    private Map<String, Integer> cardMap;

    public RemoteObjimpl() throws RemoteException {
        super();
        this.cardMap = new HashMap<>();
    }

    @Override
    public String msg(String id, int money, String clientIP) throws RemoteException {
        int currentMoney = cardMap.getOrDefault(id, 0); // 获取原来的金额，如果卡号不存在则默认为0
        int newMoney = currentMoney + money; // 在原来的金额上进行充值
        cardMap.put(id, newMoney); // 更新卡号对应的金额

        System.out.println("客户端连接到服务端IP地址：" + clientIP);
        return "卡号为" + id + "的金额已设置为" + money;
    }

    @Override
    public String getReturnValue(String cardId) throws RemoteException {
        // 获取指定卡号对应的金额
        Integer money = cardMap.get(cardId);

        // 构建返回字符串
        if (money != null) {
            return "卡号为 " + cardId + "，金额为 " + money;
        } else {
            return "未找到卡号为 " + cardId + " 的信息";
        }
    }

}

