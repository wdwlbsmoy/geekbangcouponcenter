package com.geek.coupon.templeta.api.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/16
 * @Description:com.geek.coupon.templeta.api.beans
 * @version:1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TemplateSearchParams {
    private Long id;

    private String name;

    private String type;

    private Long shopId;

    private Boolean available;

    private  int page;

    private int pageSize;
}
