package com.geek.coupon.calculation.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:com.geek.coupon.calculation.api
 * @version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    //商品的价格
    private long price;

    //商品在购物车里的数量
    private Integer count;

    //商品销售的门店
    private Long ShopId;
}
