package com.hdl.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.hdl.common.security.annotation.EnableCustomConfig;
import com.hdl.common.security.annotation.EnableRyFeignClients;

/**
 * 定时任务
 * 
 * @author hdl
 */
@EnableCustomConfig
@EnableRyFeignClients   
@SpringBootApplication
public class hdlJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(hdlJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                " .-------.       ____     __        \n" +
                " |  _ _   \\      \\   \\   /  /    \n" +
                " | ( ' )  |       \\  _. /  '       \n" +
                " |(_ o _) /        _( )_ .'         \n" +
                " | (_,_).' __  ___(_ o _)'          \n" +
                " |  |\\ \\  |  ||   |(_,_)'         \n" +
                " |  | \\ `'   /|   `-'  /           \n" +
                " |  |  \\    /  \\      /           \n" +
                " ''-'   `'-'    `-..-'              ");
    }
}
