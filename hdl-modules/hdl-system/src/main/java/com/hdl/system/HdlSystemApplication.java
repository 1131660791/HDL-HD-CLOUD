package com.hdl.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hdl.common.security.annotation.EnableCustomConfig;
import com.hdl.common.security.annotation.EnableRyFeignClients;

/**
 * 系统模块
 *
 * @author hdl
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class HdlSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(HdlSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
