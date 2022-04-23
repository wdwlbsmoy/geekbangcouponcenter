package com.geek.coupon.calculation.api;

import com.geek.coupon.templeta.api.beans.CouponInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:com.geek.coupon.calculation.api
 * @version:1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingCart {
    //订单的商品列表
    @NotEmpty
    private List<Product> products;

    //封装了优惠券信息，目前计算服务只支持单张优惠券
    //为了考虑到以后多券的扩展性，所以定义成了List
    private Long couponId;
    private List<CouponInfo> couponInfos;

    //订单的最终价格
    private long cost;

    //用户ID
    @NotNull
    private Long userId;
}
