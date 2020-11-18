package com.xiangxue.test.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.Data;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import java.text.ParseException;
import java.util.*;

/**
 * 返回工具集合
 */
public class ResultMap implements java.io.Serializable {

    private Map<String, Object> resultMap = new HashMap<>();

    public static ResultMap getInstance() {
        return new ResultMap();
    }

    public Map<String, Object> ok() {
        resultMap.put("resultCode", "0000");
        resultMap.put("resultMsg", "操作成功！");
        return resultMap;
    }

    public Map<String, Object> ok(String msg) {
        resultMap.put("resultCode", "0000");
        resultMap.put("resultMsg", msg);
        return resultMap;
    }


    public Map<String, Object> toMap() {
        return resultMap;
    }


    public void put(String key, Object value) {
        resultMap.put(key, value);
    }

    public void putObj(Object value) {
        resultMap.putAll(JSON.parseObject(JSON.toJSONString(value, SerializerFeature.WriteMapNullValue)));
    }

    public void putData(Object value) {
        resultMap.put("data", value);
    }

    public static void main(String[] args) {
//        ResultMap resultMap = ResultMap.getInstance();
//        System.out.println(ResultUtil.ok(resultMap.ok()));

        for (int i = 1; i <= 12; i++) {
            System.out.println(autoGenericCode("" + i, 2));
        }
    }

    /**
     * 不够位数的在前面补0，保留num的长度位数字
     *
     * @param code
     * @return
     */
    private static String autoGenericCode(String code, int num) {
        String result = "";
        // 保留num的位数
        // 0 代表前面补充0
        // num 代表长度为4
        // d 代表参数为正数型
        result = String.format("%0" + num + "d", Integer.parseInt(code));

        return result;
    }

    @Test
    public void test1() {
        try {
            Date date = DateUtils.parseDate("2015-12-28 00:00:00", new String[]{"yyyy-MM-dd HH:mm:ss"});

            System.out.println(119 % 10);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2() {
        List<s> dataMapList = new ArrayList<>();
        int i = 0;
        try {
            for (; i < 3; i++) {
                s ss = new s();
                ss.setId(i + "");
                ss.setName("gxd");
                dataMapList.add(ss);
                if (i == 2) {

                    throw new Exception("");

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(i);

        dataMapList.forEach((id) -> {

            System.out.println(id + ":");
        });
        dataMapList.stream().forEach((id) -> {
            System.out.println(id + ":");
        });

        String format = String.format("共有{0}个任务，{1},{2};", 1, 2, 3);
        System.out.println(format);

    }

    @Data
    class s {
        private String id;
        private String name;
    }

    @Test
    public void test3() {
        Date now = new Date();
        System.out.println(now);
        Date date = DateUtils.addDays(now, -Integer.parseInt("3"));
        System.out.println(date);
    }
}
