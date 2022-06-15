package com.example.demo.application.event.model;

import org.springframework.context.ApplicationEvent;

public class DeleteSuccessEvent extends ApplicationEvent {

    public DeleteSuccessEvent(Object source) {
        super(source);
    }
}
