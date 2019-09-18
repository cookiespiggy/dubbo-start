package com.yuantek.ori;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.alibaba.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * ref:http://dubbo.apache.org/zh-cn/blog/dubbo-101.html
 */
public class ProviderApp {

    public static void main(String[] args) throws IOException {
        ServiceConfig<GreetingsService> service = new ServiceConfig<>(); // #1
        service.setApplication(new ApplicationConfig("first-dubbo-provider")); // #2
        service.setRegistry(new RegistryConfig("zookeeper://192.168.211.136:2181")); // #3
        service.setInterface(GreetingsService.class); // #4
        service.setRef(new GreetingsServiceImpl()); // #5
        service.export(); // #6
        System.in.read(); // #7 just block jvm running
    }
}
