package com.couglas.lanucher;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author zhenxingchen4
 * @since 2025/5/23
 */
@EnableDubbo
@SpringBootApplication(scanBasePackages = "com.couglas")
@MapperScan("com.couglas.dao.mapper")
public class LauncherApplication {
    public static void main(String[] args) {
        SpringApplication.run(LauncherApplication.class, args);
    }

}
