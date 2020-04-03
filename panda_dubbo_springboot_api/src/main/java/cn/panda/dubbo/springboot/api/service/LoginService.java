package cn.panda.dubbo.springboot.api.service;

import cn.panda.dubbo.springboot.api.param.LoginParam;
import cn.panda.dubbo.springboot.api.vo.LoginVo;

public interface LoginService {

    LoginVo login(LoginParam param);

    LoginVo logout(LoginParam param);
}
