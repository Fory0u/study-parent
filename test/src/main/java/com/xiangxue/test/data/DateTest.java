package com.xiangxue.test.data;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * DateTest：
 *
 * @Description DateTest
 * @Author: gxd0311@gmail.com
 * @Date: 2020/8/11 9:39
 * @Version 1.0.0
 */
public class DateTest {



    @Test
    public void test2()
    {

        Date fromDate = new Date(2020,8,11,9,40,0);


        LocalDateTime fromDateTime =LocalDateTime.of(2020, 8, 11, 9, 40);
        LocalDateTime toDateTime = LocalDateTime.now();

        LocalDateTime tempDateTime = LocalDateTime.from( fromDateTime );

        long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS);
        tempDateTime = tempDateTime.plusYears( years );

        long months = tempDateTime.until( toDateTime, ChronoUnit.MONTHS);
        tempDateTime = tempDateTime.plusMonths( months );

        long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS);
        tempDateTime = tempDateTime.plusDays( days );


        long hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS);
        tempDateTime = tempDateTime.plusHours( hours );

        long minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES);
        tempDateTime = tempDateTime.plusMinutes( minutes );

        long seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS);

        System.out.println( years + " 天 " +
                months + " 月 " +
                days + " 天 " +
                hours + " 时 " +
                minutes + " 分 " +
                seconds + " 秒.");
    }
}
