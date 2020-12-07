package com.xiangxue.test.url;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description UrlTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-24 16:03
 * @Version 1.0.0
 */
public class UrlTest {


    private final static Integer QUERY_ONCE_SIZE = 100;

    @Test
    public void test1(){
        Integer totalCount = -10;


        int queryTotal = totalCount % QUERY_ONCE_SIZE == 0 ? totalCount / QUERY_ONCE_SIZE : (totalCount / QUERY_ONCE_SIZE) + 1;
        if (totalCount <= QUERY_ONCE_SIZE) {
            queryTotal = 1;
        }

        System.out.println(queryTotal);
    }


    @Test
    public void test2(){

        Integer[] ints = new Integer[]{1,2,3,4};

        List<Integer> ints1 = new ArrayList<>(Arrays.asList(ints));

        System.out.println("ints1.subList(0,1):"+ints1.subList(0,1));
        System.out.println("ints1.subList(1,1):"+ints1.subList(1,1));
        System.out.println("ints1.subList(1,2):"+ints1.subList(1,2));

        System.out.println("ints1:"+ints1);
    }

}
