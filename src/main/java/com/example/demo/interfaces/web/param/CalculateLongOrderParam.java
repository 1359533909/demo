// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.interfaces.web.param;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.groups.Default;

/**
 * @author mxl
 * @version 1.0
 * 2021/2/28 下午4:46
 **/
@Data
public class CalculateLongOrderParam {
    @Valid
    @NotNull(groups = Default.class, message = "策略类型不能为空")
    private Integer strategyType;
    private Integer oldPrice;
    private Integer discount;
}
