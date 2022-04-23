package com.geek.coupon.template.dao.converter;

import com.alibaba.fastjson.JSON;
import com.geek.coupon.templeta.api.beans.rules.TemplateRule;

import javax.persistence.AttributeConverter;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.template.dao.converter
 * @version:1.0
 */
public class RuleConverter implements AttributeConverter<TemplateRule,String> {
    @Override
    public String convertToDatabaseColumn(TemplateRule rule) {
        return JSON.toJSONString(rule);
    }

    @Override
    public TemplateRule convertToEntityAttribute(String rule) {
        return JSON.parseObject(rule,TemplateRule.class);
    }
}
