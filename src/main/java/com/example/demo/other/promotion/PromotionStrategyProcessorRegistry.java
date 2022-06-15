// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:27
 **/
@Component
public class PromotionStrategyProcessorRegistry implements ApplicationContextAware {
    private Map<Integer, IPromotionStrategyProcessor> processorMap = new HashMap<Integer, IPromotionStrategyProcessor>();

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IPromotionStrategyProcessor> beans = applicationContext
                .getBeansOfType(IPromotionStrategyProcessor.class);
        if (!beans.isEmpty()){
            for (IPromotionStrategyProcessor value : beans.values()) {
                processorMap.put(value.getStrategyType(), value);
            }
        }
    }

    public IPromotionStrategyProcessor getPromotionStrategyProcessorByStrategyType(Integer strategyType){
        return processorMap.get(strategyType);
    }
}
// 初始化bean -》 setApplicationContext