package com.eternal.core.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.eternal.core.dao.good.BrandDao;
import com.eternal.core.pojo.good.Brand;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Auther Eternal
 * @Date 2021/5/24
 */
@Service
public class TestInterfaceImpl implements TestInterface {

    @Autowired
    private BrandDao brandDao;

    @Override
    public String getName() {
        return "TestInterfaceImpl";
    }

    @Override
    public List<Brand> getBrandName() {
        // 从数据库当中取数据
        List<Brand> brands = brandDao.selectByExample(null);
        return brands;
    }

}
