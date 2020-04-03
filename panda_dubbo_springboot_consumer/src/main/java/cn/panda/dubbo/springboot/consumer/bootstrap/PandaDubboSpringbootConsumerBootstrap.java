package cn.panda.dubbo.springboot.consumer.bootstrap;

import cn.panda.dubbo.springboot.api.param.LoginParam;
import cn.panda.dubbo.springboot.api.param.SystemParam;
import cn.panda.dubbo.springboot.api.service.LoginService;
import cn.panda.dubbo.springboot.api.service.SystemService;
import cn.panda.dubbo.springboot.api.vo.LoginVo;
import cn.panda.dubbo.springboot.api.vo.SystemVo;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.TimeUnit;

@EnableAutoConfiguration
public class PandaDubboSpringbootConsumerBootstrap {

    @Reference(version = "${service.system.version}")
    private SystemService systemService;

    @Reference(version = "${service.login.version}")
    private LoginService loginService;

    @Bean
    public ApplicationRunner applicationRunner1() {
        return args -> {
            for (int i = 0; i < 1000000; i++) {
                long begin = System.currentTimeMillis();
                SystemParam systemParam = new SystemParam();
                systemParam.setPhone("1861" + i);
                systemParam.setType("LOGIN");
                SystemVo systemVo = this.systemService.sendCode(systemParam);
                long end = System.currentTimeMillis();
                System.out.println("server:" + systemVo.getServerHostname() + " times:" + (end - begin) + " code:" + systemVo.getCode() + " desc:" + systemVo.getDesc());
                TimeUnit.MILLISECONDS.sleep(200);
            }
        };
    }

    @Bean
    public ApplicationRunner applicationRunner2() {
        return args -> {
            for (int i = 0; i < 1000000; i++) {
                long begin = System.currentTimeMillis();
                SystemParam systemParam = new SystemParam();
                systemParam.setVersion("19.9.6." + i);
                SystemVo systemVo = this.systemService.version(systemParam);
                long end = System.currentTimeMillis();
                System.out.println("server:" + systemVo.getServerHostname() + " times:" + (end - begin) + " code:" + systemVo.getCode() + " desc:" + systemVo.getDesc() + " version:" + systemVo.getVersion());
                TimeUnit.MILLISECONDS.sleep(400);
            }
        };
    }

    @Bean
    public ApplicationRunner applicationRunner3() {
        return args -> {
            for (int i = 0; i < 1000000; i++) {
                long begin = System.currentTimeMillis();
                LoginParam loginParam = new LoginParam();
                loginParam.setUsername("panda" + i);
                loginParam.setPassword("dalingzi" + i);
                LoginVo loginVo = this.loginService.login(loginParam);
                long end = System.currentTimeMillis();
                System.out.println("server:" + loginVo.getServerHostname() + " times:" + (end - begin) + " code:" + loginVo.getCode() + " desc:" + loginVo.getDesc() + " content:" + loginVo.getContent());
                TimeUnit.MILLISECONDS.sleep(600);
            }
        };
    }

    @Bean
    public ApplicationRunner applicationRunner4() {
        return args -> {
            for (int i = 0; i < 1000000; i++) {
                long begin = System.currentTimeMillis();
                LoginParam loginParam = new LoginParam();
                loginParam.setUsername("panda" + i);
                LoginVo loginVo = this.loginService.logout(loginParam);
                long end = System.currentTimeMillis();
                System.out.println("server:" + loginVo.getServerHostname() + " times:" + (end - begin) + " code:" + loginVo.getCode() + " desc:" + loginVo.getDesc() + " content:" + loginVo.getContent());
                TimeUnit.MILLISECONDS.sleep(800);
            }
        };
    }

    public static void main(String[] args) {
        SpringApplication.run(PandaDubboSpringbootConsumerBootstrap.class, args);
    }
}
