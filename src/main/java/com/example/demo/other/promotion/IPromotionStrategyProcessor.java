// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion;

import com.example.demo.other.promotion.context.PromotionStrategyContext;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:19
 **/
public interface IPromotionStrategyProcessor {
    public void handle(PromotionStrategyContext context);
    public Integer getStrategyType();
}