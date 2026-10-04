package com.hdl.job;

import com.hdl.common.security.annotation.EnableCustomConfig;
import com.hdl.common.security.annotation.EnableRyFeignClients;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 定时任务
 *
 * @author hdl
 */
@EnableCustomConfig
@EnableRyFeignClients
@SpringBootApplication
public class HdlJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(HdlJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ");
    }
}
