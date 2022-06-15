// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion.strategy;

import com.example.demo.other.promotion.context.PromotionStrategyContext;
import com.example.demo.other.promotion.enums.PromotionStrategyTypeEnum;
import com.example.demo.other.promotion.PromotionStrategyProcessorAbstract;
import org.springframework.stereotype.Component;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:24
 **/
@Component
public class PromotionPreBookStrategyProcessor extends PromotionStrategyProcessorAbstract {
    @Override
    public void handle(PromotionStrategyContext context) {
        // todo
    }

    @Override
    public Integer getStrategyType() {
        return PromotionStrategyTypeEnum.PROMOTION_PRE_BOOK.getCode();
    }
}
