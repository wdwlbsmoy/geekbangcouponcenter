package com.geek.coupon.templeta.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.stream.Stream;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.templeta.api.enums
 * @version:1.0
 */
@Getter
@AllArgsConstructor
public enum CouponType {
    UNKNOWN("unknown","0"),
    MONEY_OFF("满减券","1"),
    DISCOUNT("打折","2"),
    RANDOM_DISCOUNT("随机减","3"),
    LONELY_NIGHT_MONEY_OFF("晚间双倍优惠券","4");

    private String description;

    private String code;

    public static CouponType convert(String code){
        return Stream.of(values())
                .filter(bean -> bean.code.equalsIgnoreCase(code))
                .findFirst()
                .orElse(UNKNOWN);
    }
}
