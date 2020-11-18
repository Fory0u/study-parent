package com.xiangxue.test.json;//package com.zczy.gxd.json;
//
//import org.junit.Test;
//
//import java.io.Serializable;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * JSONTest：
// *
// * @Description JSONTest
// * @Author: gxd0311@gmail.com
// * @Date: 2020/9/25 10:01
// * @Version 1.0.0
// */
//public class JSONTest {
//
//
//    @Test
//    public void test(){
//
//        String res = "{\"code\":\"200\",\"msg\":\"操作成功\",\"result\":{\"resultCode\":\"0000\",\"rootArray\":[{\"creditScore\":0,\"creditGrade\":\"信用一般\",\"userId\":1318492013905052669}],\"resultMsg\":\"查询成功\"}}";
//
////        GenericResult genericResult =
//
////        Map result = (HashMap) genericResult.getResult();
//
//
//
//
//
//    }
//    public class GenericResult<T> extends CommonResult {
//        private static final long serialVersionUID = -932960498827627666L;
//        protected T result;
//
//        public GenericResult() {
//        }
//
//        public GenericResult(T result) {
//            this.result = result;
//        }
//
//        public GenericResult(String code, String msg, T result) {
//            super(code, msg);
//            this.result = result;
//        }
//
//        public T getResult() {
//            return this.result;
//        }
//
//        public void setResult(T result) {
//            this.result = result;
//        }
//
//        public static GenericResult failure(String code, String msg, Object result) {
//            return new GenericResult(code, msg, result);
//        }
//    }
//
//    public class CommonResult implements Serializable {
//        private static final long serialVersionUID = 7563195555124523345L;
//        public static final String FAILURE = "500";
//        public static final String SUCCESS = "200";
//        static final String SUCCESS_MSG = "操作成功";
//        protected String code;
//        protected String msg;
//
//        public CommonResult() {
//            this.code = "200";
//            this.msg = "操作成功";
//        }
//
//        public CommonResult(String code, String msg) {
//            this.code = code;
//            this.msg = msg;
//        }
//
//        public String getCode() {
//            return this.code;
//        }
//
//        public void setCode(String code) {
//            this.code = code;
//        }
//
//        public String getMsg() {
//            return this.msg;
//        }
//
//        public void setMsg(String msg) {
//            this.msg = msg;
//        }
//
//        public void fail(String code, String msg) {
//            this.code = code;
//            this.msg = msg;
//        }
//
//        public boolean hasSuccess() {
//            return "200".equals(this.code);
//        }
//
//        public static CommonResult success() {
//            return new CommonResult();
//        }
//
//        public static CommonResult failure(String code, String msg) {
//            return new CommonResult(code, msg);
//        }
//
//        public static CommonResult failure(String msg) {
//            return new CommonResult("500", msg);
//        }
//
//        public String toString() {
//            return "CommonResult{code='" + this.code + '\'' + ", msg='" + this.msg + '\'' + '}';
//        }
//    }
//}
