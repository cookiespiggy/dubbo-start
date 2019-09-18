package com.yuantek.anno;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;

@Component("annotationAction")
public class AnnotationAction {
    @Reference
    private AnnotationService annotationService;

    public String doSayHello(String name) {
        return annotationService.sayHello(name);
    }
}
