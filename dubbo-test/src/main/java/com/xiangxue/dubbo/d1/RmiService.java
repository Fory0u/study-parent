package com.xiangxue.dubbo.d1;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * @Description RmiService
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-23 15:27
 * @Version 1.0.0
 */
public class RmiService {

    public static void main(String[] args) {
        try {
            InfoService infoService = new InfoServiceImpl();


            LocateRegistry.createRegistry(InfoService.PORT);
            Naming.bind(InfoService.RIM_URL,infoService);
            System.out.println("初始化绑定");


        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
    }


}
