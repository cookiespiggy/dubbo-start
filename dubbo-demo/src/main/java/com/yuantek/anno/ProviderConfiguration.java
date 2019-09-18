package com.yuantek.anno;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:dubbo-provider.properties")
@EnableDubbo(scanBasePackages = "com.yuantek.anno")
public class ProviderConfiguration {
}
