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
        System.out.println("(♥◠‿◠)ﾉﾞ  核动力设计所网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" + " .-------.       ____     __        \n" + " |  _ _   \\      \\   \\   /  /    \n" + " | ( ' )  |       \\  _. /  '       \n" + " |(_ o _) /        _( )_ .'         \n" + " | (_,_).' __  ___(_ o _)'          \n" + " |  |\\ \\  |  ||   |(_,_)'         \n" + " |  | \\ `'   /|   `-'  /           \n" + " |  |  \\    /  \\      /           \n" + " ''-'   `'-'    `-..-'              ");
    }
}
