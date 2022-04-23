package com.geek.coupon.calculation.template;

import com.geek.coupon.calculation.api.ShoppingCart;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:com.geek.coupon.calculation.template
 * @version:1.0
 */
public interface RuleTemplate {

    //计算优惠券
    ShoppingCart calculate(ShoppingCart settlement);
}
