package com.xiangxue.test.data;

import com.alibaba.fastjson.JSON;
import lombok.Data;

/**
 * TestFastJson：
 *
 * @Description TestFastJson
 * @Author: gxd0311@gmail.com
 * @Date: 2020/7/30 10:04
 * @Version 1.0.0
 */
public class TestFastJson {

    @Data
    private static class ForceUpdateBean {

        /**
         * 版本号
         */
        private String version = "";

        /**
         * 版本说明
         */
        private String versionContent = "";

        /**
         * 是否需要更新
         */
        private String forcedUpdate;

        /**
         * 提示说明
         */
        private String message;


    }
    public static void main(String[] args) {

        ForceUpdateBean forceUpdateBean = new ForceUpdateBean();
        forceUpdateBean.setForcedUpdate("1");
        System.out.println(JSON.toJSONString(forceUpdateBean));
    }
}
