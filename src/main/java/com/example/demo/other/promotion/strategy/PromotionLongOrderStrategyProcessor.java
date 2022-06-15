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
 * 2021/2/28 下午4:25
 **/
@Component
public class PromotionLongOrderStrategyProcessor extends PromotionStrategyProcessorAbstract {
    // 7天 9折
    @Override
    public void handle(PromotionStrategyContext context) {
        // todo
        if (context == null){
            return;
        }
        if (context.getOldPrice() != null && context.getDiscount() != null){
            context.setDiscountPrice(cal(context.getOldPrice(), context.getDiscount()));
        }
    }

    @Override
    public Integer getStrategyType() {
        return PromotionStrategyTypeEnum.PROMOTION_LONG_ORDER.getCode();
    }
}
