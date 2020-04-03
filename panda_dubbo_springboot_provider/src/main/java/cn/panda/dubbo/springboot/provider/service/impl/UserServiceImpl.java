package cn.panda.dubbo.springboot.provider.service.impl;

import cn.panda.dubbo.springboot.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${service.user.version}")
public class UserServiceImpl implements UserService {
}
