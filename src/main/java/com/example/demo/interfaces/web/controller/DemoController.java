// Copyright (C) 2021 Meituan
// All rights reserved
package com.example.demo.interfaces.web.controller;

import com.example.demo.infra.dao.entity.HostOperationTimeInitializationEntity;
import com.example.demo.infra.dao.persistences.HostOperationTimeInitializationPersistence;
import com.example.demo.interfaces.web.param.IdParam;
import com.example.demo.other.promotion.facade.PromotionStrategyFacade;
import com.example.demo.other.promotion.service.PromotionStrategyService;
import com.example.demo.interfaces.web.param.CalculateLongOrderParam;
import com.example.demo.interfaces.web.result.CalculateLongOrderResult;
import com.moxiaolin.bean.SimpleBean;
import exception.APIRuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import resp.APIResult;
import resp.IResponseStatusMsg;

/**
 * @author mxl
 * @version 1.0
 * 2021/1/30 上午10:06
 **/
@Controller
public class DemoController {
    @Autowired
    private PromotionStrategyFacade promotionStrategyFacade;
    @Autowired
    private SimpleBean simpleBean;
    @Autowired
    private PromotionStrategyService strategyService;
    @Autowired
    private HostOperationTimeInitializationPersistence initializationPersistence;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public APIResult demo(){
        System.out.println(simpleBean.getId());
        throw new APIRuntimeException(IResponseStatusMsg.APIEnum.PARAM_ERROR, "请求参数错误");
    }

    @RequestMapping(value = "/calculateLongOrder", method = RequestMethod.POST)
    @ResponseBody
//    @ExHandler
    public APIResult calculateLongOrder(@RequestBody CalculateLongOrderParam param){
        CalculateLongOrderResult calculateLongOrderResult = strategyService.testException();
        CalculateLongOrderResult test = promotionStrategyFacade.test();
        return new APIResult<>();
    }

    @PostMapping(value = "/getById")
    @ResponseBody
    public APIResult<HostOperationTimeInitializationEntity> getById(@RequestBody IdParam param){
        HostOperationTimeInitializationEntity entity = initializationPersistence.getByHostId(param.getId());
        return new APIResult(entity);
    }

}
