package com.couglas.gateway;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = {"com.couglas"})
public class GatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
//
//    @Bean
//    public CommandLineRunner printAllBeans(ApplicationContext context) {
//        return args -> {
//            String[] beans = context.getBeanDefinitionNames();
//            Arrays.sort(beans);
//            for (String bean : beans) {
//                System.out.println(bean);
//            }
//        };
//    }

}
