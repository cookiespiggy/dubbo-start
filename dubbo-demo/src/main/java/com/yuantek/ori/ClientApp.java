package com.yuantek.ori;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;

public class ClientApp {
    public static void main(String[] args) {
        ReferenceConfig<GreetingsService> reference = new ReferenceConfig<>(); // #1
        reference.setApplication(new ApplicationConfig("first-dubbo-client")); // #2
        reference.setRegistry(new RegistryConfig("zookeeper://192.168.211.136:2181")); // #3
        reference.setInterface(GreetingsService.class); // #4
        GreetingsService greetingsService = reference.get(); // #5
        String message = greetingsService.sayHi("dubbo"); // #6
        System.out.println(message); // #7
    }
}
