package com.foodapp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.foodapp");
        OrderService order=context.getBean(OrderService.class);
        order.place();
    }

}
