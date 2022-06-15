// Copyright (C) 2020 Meituan
// All rights reserved
package com.example.demo.other.utils.function.switchifelse.v1;

import com.example.demo.other.utils.function.switchifelse.v1.Inteface.ICountry;
import com.example.demo.other.utils.function.switchifelse.v1.country.BaseCountry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author mxl
 * @version 1.0
 * @created 2020/9/5 下午2:11
 **/
@Service
public class TaxCalculatorV1 {
    @Autowired
    List<ICountry> countryList;
    @Autowired
    BaseCountry baseCountry;
    public void taxCalculator(){
        countryList.forEach(country -> {
            country.calculatorTax();
        });
    }
}
