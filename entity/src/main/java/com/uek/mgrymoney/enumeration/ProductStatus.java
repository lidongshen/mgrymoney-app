package com.uek.mgrymoney.enumeration;

/**
 * 产品状态
 * @author: LiDongSheng
 * @since JDK 1.8
 * date:2020/1/3 11:32
 */
public enum ProductStatus {
    LOCKED("锁定"),SALINT("销售中"),END("结束");

    private String desc;

    ProductStatus(String desc){
     this.desc=desc;
    }

    public String getDesc(){
        return desc;
    }


}
