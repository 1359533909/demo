// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.other.promotion;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:23
 **/
public abstract class PromotionStrategyProcessorAbstract implements IPromotionStrategyProcessor{
    // discount 9000   oldPrice 8000
    public Integer cal(Integer oldPrice, Integer discount) {
        return (oldPrice*discount)/10000;
    }
}
