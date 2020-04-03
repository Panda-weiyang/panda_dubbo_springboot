package cn.panda.dubbo.springboot.provider.service.impl;

import cn.panda.dubbo.springboot.api.service.OrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "${service.order.version}")
public class OrderServiceImpl implements OrderService {
}
