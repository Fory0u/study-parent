package com.xiangxue.test.test;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
/**
 * RedPackTest：
 *
 * @Description RedPackTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020/9/18 8:48
 * @Version 1.0.0
 */
public class RedPackTest {


        /**
         * amount 元随机生成 n 个红包
         *
         * @param amount 红包总额
         * @param count  红包数量
         * @return 返回红包的 list
         */
        public static List<Double> createRedEnvelopes(double amount, int count) {
            // 使用线段切割法生成红包:
            // 1. 把 [0, amount] 随机分成 count 段 (共需要 count+1 个数, 上下边界为 0 和 amount)，每段长度为红包的金额
            //    在区间 (0, amount) 中生成 count-1 个不重复的随机数 (即段的位置)，保存到 segments
            // 2. 把 segments 小到大排序，使用了 TreeSet
            // 3. 遍历 segments，每个段的长度 segments[i]-segments[i-1] 则为红包的金额 (保留 2 位小数)
            // 4. 确保红包的总额为 amount

            Set<Double> segments = new TreeSet<>();

            // [1] 把 [0, amount] 随机分成 count 段，每段长度为红包的金额，加上边际 0 和 amount，共需要 count 个数
            //    在区间 (0, amount) 中生成 count-1 个不重复的随机数 (即段的位置)，保存到 segments
            // [2] 把 segments 小到大排序，使用了 TreeSet
            Random random = new Random();
            segments.add(0.0);
            segments.add(amount);
            while (segments.size() < count-1) {
                double rr = random.nextDouble();
                System.out.println(rr);
                double t = rr * amount;
                segments.add(t);
            }

            // [3] 遍历 segments，每个段的长度 segments[i]-segments[i-1] 则为红包的金额 (保留 2 位小数)
            List<Double> redEnvelopes = new LinkedList<>();

            Double[] temp = segments.toArray(new Double[0]);
            for (int i = 1; i < temp.length; ++i) {
                redEnvelopes.add(toFixed(temp[i]-temp[i-1], 2));
            }

            // [4] 确保红包的总额为 amount
            double sum = redEnvelopes.stream().mapToDouble(a->a).sum();
            redEnvelopes.set(0, toFixed(redEnvelopes.get(0) + amount - sum, 2));

            return redEnvelopes;
        }

        /**
         * 浮点数保留 scale 位小数位
         *
         * @param value 浮点数
         * @param scale 小数位
         * @return 返回小数位为 scale 位的浮点数
         */
        public static double toFixed(double value, int scale) {
            return BigDecimal.valueOf(value).setScale(scale, RoundingMode.HALF_UP).doubleValue();
        }

        public static void main(String[] args) throws Exception {
            List<Double> redEnvelopes = createRedEnvelopes(100, 19);
            System.out.println(redEnvelopes);
            System.out.println(redEnvelopes.stream().mapToDouble(a->a).sum()); // 红包总额
        }
}
