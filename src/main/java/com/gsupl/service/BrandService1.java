package com.gsupl.service;

import com.gsupl.pojo.Brand;
import com.gsupl.pojo.PageBean;

/**
 * @Author LGH
 * @Date 2022/6/16 18:10
 * @Version 1.0
 */
public interface BrandService1 {
    /**
     * 分页查询
     * @param currentPage 当前页码
     * @param pageSize 每页展示条数
     * @return
     */
    PageBean<Brand> selectByPage(int currentPage, int pageSize);

}
