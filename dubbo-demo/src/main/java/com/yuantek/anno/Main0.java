package com.yuantek.anno;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main0 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
        context.start();
        final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
        String hello = annotationAction.doSayHello("world");
        System.out.println(hello);
    }
}
