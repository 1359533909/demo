// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion.facade;

import com.example.demo.other.promotion.context.PromotionStrategyContext;
import com.example.demo.other.promotion.service.PromotionStrategyService;
import com.example.demo.interfaces.web.param.CalculateLongOrderParam;
import com.example.demo.other.promotion.IPromotionStrategyProcessor;
import com.example.demo.other.promotion.PromotionStrategyProcessorRegistry;
import com.example.demo.interfaces.web.result.CalculateLongOrderResult;
import com.moxiaolin.aop.annotations.ExHandler;
import com.moxiaolin.aop.annotations.Validate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:49
 * 如果使用spring原生的校验  需要@Validated 和@Valid 一起使用
 **/
@Component
@ExHandler
public class PromotionStrategyFacade {
    @Autowired
    private PromotionStrategyProcessorRegistry promotionStrategyProcessorRegistry;
    @Autowired
    private PromotionStrategyService strategyService;


    @Validate
    public CalculateLongOrderResult calculateLongOrder(CalculateLongOrderParam param) {
        CalculateLongOrderResult result = new CalculateLongOrderResult();
        result.setDiscount(param.getDiscount());
        result.setOldPrice(param.getOldPrice());
        result.setStrategyType(param.getStrategyType());
        if (param!=null && param.getStrategyType() != null){
            IPromotionStrategyProcessor promotionStrategyProcessorByStrategyType = promotionStrategyProcessorRegistry
                    .getPromotionStrategyProcessorByStrategyType(param.getStrategyType());
            PromotionStrategyContext promotionStrategyContext = new PromotionStrategyContext();
            promotionStrategyContext.setDiscount(param.getDiscount());
            promotionStrategyContext.setOldPrice(param.getOldPrice());
            promotionStrategyProcessorByStrategyType.handle(promotionStrategyContext);
            result.setDiscountPrice(promotionStrategyContext.getDiscountPrice());
        }
        return result;
    }

    public CalculateLongOrderResult test(){
        return new CalculateLongOrderResult();
    }
}
