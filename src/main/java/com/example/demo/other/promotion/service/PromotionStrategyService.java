package com.example.demo.other.promotion.service;

import com.example.demo.interfaces.web.result.CalculateLongOrderResult;
import com.moxiaolin.aop.annotations.ExHandler;
import exception.APIRuntimeException;
import org.springframework.stereotype.Service;
import resp.IResponseStatusMsg;

@Service
public class PromotionStrategyService {

    @ExHandler
    public CalculateLongOrderResult testException() {
        throw new APIRuntimeException(IResponseStatusMsg.APIEnum.CONTENT_UNEXPECTED);
    }
}
