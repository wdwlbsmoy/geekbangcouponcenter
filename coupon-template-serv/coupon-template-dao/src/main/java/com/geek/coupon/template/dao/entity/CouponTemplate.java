package com.geek.coupon.template.dao.entity;

import com.geek.coupon.template.dao.converter.CouponTypeConverter;
import com.geek.coupon.template.dao.converter.RuleConverter;
import com.geek.coupon.templeta.api.beans.rules.TemplateRule;
import com.geek.coupon.templeta.api.enums.CouponType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.template.dao.entity
 * @version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@EntityListeners(AuditingEntityListener.class)
@Table(name = "coupon_template")
public class CouponTemplate implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private Long id;

    //状态是否可用
    @Column(name = "available",nullable = false)
    private Boolean available;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "description",nullable = false)
    private String description;

    //适用门店-如果为空，则全店满减券
    @Column(name = "ship_id")
    private Long shopId;

    //优惠券类型
    @Column(name = "type",nullable = false)
    @Convert(converter = CouponTypeConverter.class)
    private CouponType category;

    //创建时间，通过@CreateDate注解自动填值（需要配合@JpaAuditing注解在启动类上生效）
    @CreatedDate
    @Column(name = "create_time",nullable = false)
    private Date createTime;

    //优惠券核算规则，平铺成JSON字段
    @Column(name = "rule",nullable = false)
    @Convert(converter = RuleConverter.class)
    private TemplateRule rule;
}
