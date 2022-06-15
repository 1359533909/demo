// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion.context;

import lombok.Data;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:26
 **/
@Data
public class PromotionStrategyContext {
    private Integer activityId;
    private String activityName;
    private Integer oldPrice;
    private Integer discount;
    private Integer discountPrice;
}
