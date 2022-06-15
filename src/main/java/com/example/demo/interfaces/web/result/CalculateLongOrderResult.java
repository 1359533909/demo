// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.interfaces.web.result;

import lombok.Data;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:50
 **/
@Data
public class CalculateLongOrderResult {
    private Integer strategyType;
    private Integer oldPrice;
    private Integer discount;
    private Integer discountPrice;
}
