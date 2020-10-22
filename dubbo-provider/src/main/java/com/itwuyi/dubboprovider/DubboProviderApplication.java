package com.itwuyi.dubboprovider;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDubbo  //会扫描所有的包，从中找出dubbo的@Service标注的类
// @DubboComponentScan(basePackages = "com.itwuyi.dubboprovider.service")  //只扫描指定的包
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
