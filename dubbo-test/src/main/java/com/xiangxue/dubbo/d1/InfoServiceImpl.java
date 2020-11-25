package com.xiangxue.dubbo.d1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Map;

/**
 * @Description InfoServiceImpl
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-23 15:50
 * @Version 1.0.0
 */
public class InfoServiceImpl extends UnicastRemoteObject implements InfoService{
    protected InfoServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public Object sayHello(String name) throws RemoteException {

        return name + " nb！";
    }

    @Override
    public Object passInfo(Map<String,Object> map) throws RemoteException {
        return map;
    }
}
