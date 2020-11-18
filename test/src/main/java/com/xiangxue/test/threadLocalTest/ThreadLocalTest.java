package com.xiangxue.test.threadLocalTest;

import lombok.Data;

/**
 * ThreadLocalTest：
 *
 * @Description ThreadLocalTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020/9/16 17:14
 * @Version 1.0.0
 */
@Data
public class ThreadLocalTest {


    ThreadLocal<Integer> integerThreadLocal = new ThreadLocal<Integer>(){

        @Override
        protected Integer initialValue() {
            return super.initialValue();
        }
    };




}
