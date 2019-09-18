package com.yuantek.anno;

import org.apache.dubbo.config.annotation.Service;

@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
