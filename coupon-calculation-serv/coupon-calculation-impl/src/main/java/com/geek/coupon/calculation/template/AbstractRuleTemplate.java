package com.geek.coupon.calculation.template;

import com.geek.coupon.calculation.api.Product;
import com.geek.coupon.calculation.api.ShoppingCart;

import java.util.List;
import java.util.Map;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:com.geek.coupon.calculation.template
 * @version:1.0
 */
public class AbstractRuleTemplate implements RuleTemplate{
    @Override
    public ShoppingCart calculate(ShoppingCart order) {
        //获取订单总价
        Long orderTotalAmount = getTotalPrice(order.getProducts());
        //获取以shopId为维度的价格统计
        Map<Long,Long> sumAmount = this.getTotalPriceGroupByShop(order.getProducts());

        return null;
    }

    private Map<Long, Long> getTotalPriceGroupByShop(List<Product> products) {
    }

    //计算订单总价
    protected long getTotalPrice(List<Product> products){
        return products.stream()
                .mapToLong(product -> product.getPrice() * product.getCount())
                .sum();
    }
}
