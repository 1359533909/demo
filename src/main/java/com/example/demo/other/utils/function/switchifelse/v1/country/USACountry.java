// Copyright (C) 2020 Meituan
// All rights reserved
package com.example.demo.other.utils.function.switchifelse.v1.country;

import com.example.demo.other.utils.function.switchifelse.v1.Inteface.ICountry;
import lombok.extern.slf4j.Slf4j;

/**
 * @author mxl
 * @version 1.0
 * @created 2020/9/5 下午2:08
 **/
//@Component
@Slf4j
public class USACountry implements ICountry {

    private String countryName = "USA";
    @Override
    public void calculatorTax() {
        log.info("{}，纳税额计算", countryName);
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
