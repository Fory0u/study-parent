package com.xiangxue.test.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;

/**
 * ResultUtil：
 *
 * @Description ResultUtil
 * @Author: gxd0311@gmail.com
 * @Date: 2020/8/17 14:44
 * @Version 1.0.0
 */
public class ResultUtil {


    public static Object ok(Object data) {
        if(data==null){
            data=new HashMap();
        }
        JSONObject json= (JSONObject) JSON.toJSON(data);

        if(!json.containsKey("resultCode")) {
            json.put("resultCode", "0000");
        }

        if(!json.containsKey("resultMsg")) {
            json.put("resultMsg", "处理成功！");
        }

        return null;
    }
}
