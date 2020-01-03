package com.uek.mgrymoney.entity;

import com.uek.mgrymoney.enumeration.ProductStatus;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;


/**
 * @author: LiDongSheng
 * @since JDK 1.8
 * date:2020/1/3 11:23
 * 实体类测试
 */
public class ProductTest {

    //日志
    private static Logger logger = Logger.getLogger(ProductTest.class);

    @Test
    public void createProduct(){
        Product p = new Product();
        p.setId("001");
        p.setName("月光袋");
        p.setStartAmount(BigDecimal.valueOf(1000));
        p.setStatus(ProductStatus.SALINT);
        p.setCreateAt(new Date());
        p.setCreateUser("ls");
        logger.info(p);
    }

}
