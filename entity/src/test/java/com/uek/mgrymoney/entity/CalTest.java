package com.uek.mgrymoney.entity;

import org.junit.Test;

import java.math.BigDecimal;

/**
 * @author: LiDongSheng
 * @since JDK 1.8
 * date:2020/1/3 11:03
 * 单元测试
 */
public class CalTest {
    public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        System.out.println(4.015*100);
        System.out.println(123.3/100);
    }

    @Test
    public void testcal(){
        BigDecimal a = BigDecimal.valueOf(1.0);
        BigDecimal b = BigDecimal.valueOf(0.42);
        System.out.println();

    }

}
