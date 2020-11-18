package com.xiangxue.test.regex;

/**
 * RegexTest：
 *
 * @Description RegexTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020/8/17 15:14
 * @Version 1.0.0
 */
public class RegexTest {
    /**
     * 两位小数
     */
    public static String TWO_POINT_REGEX = "(^[1-9](\\d+)?(\\.\\d{1,2})?$)|(^0$)|(^\\d\\.\\d{1,2}$)";

    public static void main(String[] args) {
        String[] configValues = {"1.01","12.01","12.013","1.031","0.01","01.01","11111111111101.01","5"};
        for (String configValue : configValues) {


            System.out.println(configValue + " matches is " +configValue.matches(TWO_POINT_REGEX));
        }



    }

}
