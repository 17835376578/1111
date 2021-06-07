package com.usian.feign;

import com.usian.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//获取eureka-provider的调用地址，且具有负载均衡的能力
@FeignClient(value="eureka-provider")
public interface UserFeign {

    @RequestMapping(value="/user")
    public User getUser();
}
