package org.example.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface IRemoteObj extends Remote{
    public String msg(String id, int money, String clientIP) throws RemoteException;
    String getReturnValue(String cardId) throws RemoteException;
}