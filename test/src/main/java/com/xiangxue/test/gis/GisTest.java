package com.xiangxue.test.gis;

import com.alibaba.fastjson.JSON;

import java.util.*;

/**
 * @Description GisTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020-11-13 15:09
 * @Version 1.0.0
 */
public class GisTest {


    public static void main(String[] args) {


        Set<GisVo> voSet = new HashSet<>();

        double[] X = {118.780754,
                118.782265,
                118.780846,
                118.78225,
                118.780716,
                118.782265,
                118.78226,
                118.78211,
                118.78091,
                118.78216,
                118.78074,
                118.78218,
                118.78203,
                118.78204,
                118.781105,
                118.78228,
                118.78086,
                118.78224,
                118.78219,
                118.78172,
                118.78217,
                118.780716,
                118.78227,
                118.78217,
                118.78223,
                118.78074,
                118.78226,
                118.78212,
                118.782135,
                118.78107,
                118.78225,
                118.78096,
                118.78224,
                118.78091,
                118.78227,
                118.78072,
                118.782265,
                118.78076
        };


        double[] Y = new double[]{
                32.095734,
                32.095673,
                32.095886,
                32.095737,
                32.095715,
                32.095703,
                32.09581,
                32.09603,
                32.09615,
                32.09614,
                32.095726,
                32.09578,
                32.096275,
                32.09589,
                32.09594,
                32.0958,
                32.096653,
                32.095795,
                32.09607,
                32.09638,
                32.09607,
                32.09603,
                32.09568,
                32.095833,
                32.09589,
                32.095688,
                32.09589,
                32.09638,
                32.095745,
                32.095665,
                32.09602,
                32.09613,
                32.0958,
                32.095776,
                32.095768,
                32.095695,
                32.0958,
                32.095745,

        };
        for (int i = 0; i < Y.length; i++) {
            GisVo gisVo = new GisVo(X[i], Y[i]);
            voSet.add(gisVo);
        }
        System.out.println(String.format("X.length ===> %d", X.length));
        System.out.println(String.format("Y.length ===> %d", Y.length));
        System.out.println(String.format("{X,Y}length ===> %d", voSet.size()));
        System.out.println(JSON.toJSONString(voSet));

    }
}
