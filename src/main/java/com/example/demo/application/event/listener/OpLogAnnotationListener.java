package com.example.demo.application.event.listener;

import com.example.demo.application.event.model.CreateSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class OpLogAnnotationListener {

    @EventListener(classes = {CreateSuccessEvent.class})
    public void createSuccess(CreateSuccessEvent successEvent){
        System.out.println("OpLogAnnotationListener -> successEvent");
    }
}
