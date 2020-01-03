package com.uek.mgrymoney.entity;

import com.uek.mgrymoney.enumeration.ProductStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author: LiDongSheng
 * @since JDK 1.8
 * date:2020/1/3 10:41
 * 理财产品
 *
 */
@Data
@NoArgsConstructor
public class Product implements Serializable {
    //产品编号
    private String id;
    //产品名称
    private String  name;
    //起投金额
    private BigDecimal startAmount;
    //投资步长
    private BigDecimal stepAmount;
    //锁定期
    private Integer lockupPeriod;
    //收益率
    private BigDecimal earningRate;
    //状态
    private String status;
    //备注
    private String remark;
    //创建时间
    private Date createAt;
    //产品创建者
    private String createUser;
    //产品更新时间
    private Date updateAt;
    //产品更新者
    private String updateUser;

    /**
     * 为了产品的安全考虑，我们使用枚举
     * @param ps
     */
    public void setStatus(ProductStatus ps){
        this.status=ps.name();
    }

}