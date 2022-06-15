package com.example.demo.interfaces.main;

import com.example.demo.DemoApplication;
import com.example.demo.application.event.listener.UserListener;
import com.example.demo.application.event.model.CreateSuccessEvent;
import com.example.demo.infra.dao.entity.MockConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(DemoApplication.class);
//        context.register(UserListener.class);
//        context.refresh();
//
//
//        CreateSuccessEvent createSuccessEvent = new CreateSuccessEvent("CreateSuccessEvent", "你好");
//        context.publishEvent(createSuccessEvent);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MockConfig.class);
        context.refresh();

        MockConfig mockConfig = context.getBean(MockConfig.class);
        System.out.println(mockConfig.toString());
    }
}
