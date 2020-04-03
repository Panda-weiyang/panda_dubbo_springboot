package cn.panda.dubbo.springboot.api.service;

import cn.panda.dubbo.springboot.api.param.SystemParam;
import cn.panda.dubbo.springboot.api.vo.SystemVo;

public interface SystemService {

    SystemVo sendCode(SystemParam param);

    SystemVo version(SystemParam param);
}
