package com.example.demo.application.event.model;

import lombok.Data;
import org.springframework.context.ApplicationEvent;

public class CreateSuccessEvent extends ApplicationEvent {
    private String msg;
    public CreateSuccessEvent(Object source) {
        super(source);
    }

    public CreateSuccessEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
