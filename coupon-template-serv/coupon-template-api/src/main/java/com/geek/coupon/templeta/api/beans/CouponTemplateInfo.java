package com.geek.coupon.templeta.api.beans;

import com.geek.coupon.templeta.api.beans.rules.TemplateRule;
import lombok.*;

import javax.validation.constraints.NotNull;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.templeta.api.beans
 * @version:1.0  创建优惠券模板
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {

    private Long id;

    @NotNull
    private String name;

    //优惠券描述
    @NotNull
    private String desc;

    //优惠券类型
    @NotNull
    private String type;

    //适用门店 - 若无则为全店通用
    private Long shopId;

    /**优惠券规则 */
    @NotNull
    private TemplateRule rule;

    private Boolean available;
}
