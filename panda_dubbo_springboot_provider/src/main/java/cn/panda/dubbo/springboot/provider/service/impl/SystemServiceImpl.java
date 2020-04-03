package cn.panda.dubbo.springboot.provider.service.impl;

import cn.panda.dubbo.springboot.api.param.SystemParam;
import cn.panda.dubbo.springboot.api.service.SystemService;
import cn.panda.dubbo.springboot.api.vo.SystemVo;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "${service.system.version}")
public class SystemServiceImpl implements SystemService {

    @Value("${spring.application.name}")
    private String applicationName;

    @Override
    public SystemVo sendCode(SystemParam param) {
        SystemVo systemVo = new SystemVo();
        systemVo.setCode("SUCCESS");
        systemVo.setDesc(param.getPhone() + ":" + param.getType());
        systemVo.setServerHostname(applicationName);
        return systemVo;
    }

    @Override
    public SystemVo version(SystemParam param) {
        SystemVo systemVo = new SystemVo();
        systemVo.setCode("SUCCESS");
        systemVo.setDesc("成功");
        systemVo.setVersion(param.getVersion());
        systemVo.setServerHostname(applicationName);
        return systemVo;
    }
}
