package cn.panda.dubbo.springboot.provider.service.impl;

import cn.panda.dubbo.springboot.api.param.LoginParam;
import cn.panda.dubbo.springboot.api.service.LoginService;
import cn.panda.dubbo.springboot.api.vo.LoginVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${service.login.version}")
public class LoginServiceImpl implements LoginService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public LoginVo login(LoginParam param) {
        LoginVo loginVo = new LoginVo();
        loginVo.setCode("SUCCESS");
        loginVo.setDesc("成功");
        loginVo.setContent(param.getUsername() + ":" + param.getPassword());
        loginVo.setServerHostname(applicationName);
        return loginVo;
    }

    @Override
    public LoginVo logout(LoginParam param) {
        LoginVo loginVo = new LoginVo();
        loginVo.setCode("SUCCESS");
        loginVo.setDesc("成功");
        loginVo.setContent(param.getUsername());
        loginVo.setServerHostname(applicationName);
        return loginVo;
    }
}
