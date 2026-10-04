package com.hdl.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 *
 * @author hdl
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class HdlGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(HdlGatewayApplication.class, args);
    }
}
