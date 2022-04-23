package com.geek.coupon.templeta.api.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.templeta.api.beans.rules
 * @version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateRule {

    //可以享受得折扣
    private Discount discount;

    //每个人最多可以领券数量
    private Integer limitation;

    //过期时间
    private Long deadline;
}
