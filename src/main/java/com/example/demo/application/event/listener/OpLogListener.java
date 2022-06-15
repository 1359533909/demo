package com.example.demo.application.event.listener;

import com.example.demo.application.event.model.CreateSuccessEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class OpLogListener implements ApplicationListener {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof CreateSuccessEvent){
            System.out.println("CreateSuccessEvent");
        }else {
            System.out.println("CreateSuccessEvent -》other event");
        }
    }
}
