package com.geek.coupon.template.service.intf;

import com.geek.coupon.templeta.api.beans.CouponTemplateInfo;
import com.geek.coupon.templeta.api.beans.PagedCouponTemplateInfo;
import com.geek.coupon.templeta.api.beans.TemplateSearchParams;

import java.util.Collection;
import java.util.Map;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.template.service.intf
 * @version:1.0
 */
public interface CouponTemplateService {

    //创建优惠券模板
    CouponTemplateInfo createTemplate(CouponTemplateInfo request);

    CouponTemplateInfo cloneTemplate(Long templateId);

    //模板查询（分页）
    PagedCouponTemplateInfo search(TemplateSearchParams request);

    //通过模板ID查询优惠券模板
    CouponTemplateInfo loadTemplateInfo(Long id);

    //让优惠券模板无效
    void deleteTemplate(Long id);

    //批量查询
    //Map是模板ID，key是模板详情
    Map<Long, CouponTemplateInfo> getTemplateInfoMap(Collection<Long> ids);
}
