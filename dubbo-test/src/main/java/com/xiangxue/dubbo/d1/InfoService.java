package com.xiangxue.dubbo.d1;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Map;

/**
 * @Description InfoService
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-23 15:40
 * @Version 1.0.0
 */
public interface InfoService extends Remote {
    String RIM_URL = "rmi://127.0.0.1:9080/InfoService";

    int PORT = 9080;

    Object sayHello(String name) throws RemoteException;

    Object passInfo(Map<String,Object> map) throws RemoteException;
}
