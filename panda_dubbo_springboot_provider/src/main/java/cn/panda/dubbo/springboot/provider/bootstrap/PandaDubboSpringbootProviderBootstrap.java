package cn.panda.dubbo.springboot.provider.bootstrap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class PandaDubboSpringbootProviderBootstrap {

    private static final Logger logger = LoggerFactory.getLogger(PandaDubboSpringbootProviderBootstrap.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(PandaDubboSpringbootProviderBootstrap.class, args);
    }
}
