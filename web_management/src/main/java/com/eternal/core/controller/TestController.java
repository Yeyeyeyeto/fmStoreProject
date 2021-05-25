package com.eternal.core.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eternal.core.pojo.good.Brand;
import com.eternal.core.service.TestInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Auther Eternal
 * @Date 2021/5/24
 */
@RestController
public class TestController {

    @Reference
    private TestInterface testInterface;

    @RequestMapping("getName")
    public String getName() {
        return testInterface.getName();
    }

    @RequestMapping("getBrandName")
    public List<Brand> getBrandName() {
        return testInterface.getBrandName();
    }
}
