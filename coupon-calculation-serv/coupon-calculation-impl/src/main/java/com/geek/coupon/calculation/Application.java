package com.geek.coupon.calculation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Auther:xueruiheng
 * @Date:2022/4/23
 * @Description:PACKAGE_NAME
 * @version:1.0
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.geek"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
