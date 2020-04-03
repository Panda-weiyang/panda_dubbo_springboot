package cn.panda.dubbo.springboot.provider.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class PandaDubboSpringbootProviderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(PandaDubboSpringbootProviderBootstrap.class, args);
    }
}
