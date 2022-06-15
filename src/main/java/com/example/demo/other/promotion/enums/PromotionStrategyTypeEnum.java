package com.example.demo.other.promotion.enums;

/**
 * @author mxl
 * @version 1.0
 * @created 2021/2/28.
 */
public enum PromotionStrategyTypeEnum {
    PROMOTION_PRE_BOOK(1, "早鸟特惠"),
    PROMOTION_LONG_ORDER(2, "连住优惠")
    ;
    private Integer code;
    private String message;

    PromotionStrategyTypeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
