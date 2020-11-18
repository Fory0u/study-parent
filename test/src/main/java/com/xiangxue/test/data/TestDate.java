package com.xiangxue.test.data;

import java.text.MessageFormat;

/**
 * test：
 *
 * @Description test
 * @Author: gxd0311@gmail.com
 * @Date: 2020/7/24 15:53
 * @Version 1.0
 */
public class TestDate {

    /**
     * 日期
     */
    public static String DATE_REGEX = "^([1-9]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[1-2][0-9]|3[0-1]))|(长期)$";
    public static void main(String[] args) {


        //收集日期处理 默认7月20号
//        String quotedPriceTime = "2020-07-20";
        String quotedPriceTime = "2020/07/20";
        if (quotedPriceTime == null) {
            System.out.println("quotedPriceTime是空");
        } else if (quotedPriceTime.contains("/")) {
            quotedPriceTime = quotedPriceTime.replace("/", "-");
        }

        //校验日期格式
        if (!quotedPriceTime.matches(DATE_REGEX)) {

            System.out.println("quotedPriceTime 不能匹配");
        }else{
            System.out.println("quotedPriceTime 正常 匹配");
        }

    }
}
