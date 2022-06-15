package com.example.demo.application.event.listener;

import com.example.demo.application.event.model.DeleteSuccessEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if (event instanceof DeleteSuccessEvent){
            System.out.println("DeleteSuccessEvent");
        }else {
            System.out.println("DeleteSuccessEvent -》other ");
        }
    }
}
