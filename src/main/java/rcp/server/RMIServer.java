/**
 * 功能：
 * 作者：JInli
 * 日期： 2024/4/21 10:42
 */
package org.example.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMIServer {
    public static void main(String[] args) throws RemoteException, AlreadyBoundException {
        IRemoteObj remoteObj = new RemoteObjimpl();
        Registry r = LocateRegistry.createRegistry(1099);
        r.bind("remoteObj", remoteObj);
    }
}
