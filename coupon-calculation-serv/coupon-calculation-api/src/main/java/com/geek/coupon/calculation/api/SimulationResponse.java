package com.geek.coupon.calculation.api;

import com.google.common.collect.Maps;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Map;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:com.geek.coupon.calculation.api
 * @version:1.0计算试算结果，可以看出哪个优惠券的优惠力度最大
 */
@Data
@AllArgsConstructor
public class SimulationResponse {
    //最省钱的coupon
    private Long bestCouponId;

    //每一个coupon对应的order价格
    private Map<Long,Long> couponToOrderPrice = Maps.newHashMap();
}
