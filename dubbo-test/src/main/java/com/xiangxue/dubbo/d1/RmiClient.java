package com.xiangxue.dubbo.d1;

import com.alibaba.fastjson.JSON;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Description RmiClient
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-23 15:39
 * @Version 1.0.0
 */
public class RmiClient {


    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {


        InfoService infoService = (InfoService) Naming.lookup(InfoService.RIM_URL);

        Object rs = infoService.sayHello("gxd");

        System.out.println("客户端调用结果===>" + JSON.toJSONString(rs));







    }
}
