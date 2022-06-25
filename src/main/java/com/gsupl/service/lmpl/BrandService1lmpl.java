package com.gsupl.service.lmpl;

import com.gsupl.mapper.BrandMapper;
import com.gsupl.pojo.Brand;
import com.gsupl.pojo.PageBean;
import com.gsupl.service.BrandService1;
import com.gsupl.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author LGH
 * @Date 2022/6/16 18:13
 * @Version 1.0
 */
public class BrandService1lmpl implements BrandService1 {
    //1. 创建SqlSessionFactory 工厂对象
    SqlSessionFactory factory = SqlSessionFactoryUtils.getSqlSessionFactory();
    @Override
    public PageBean<Brand> selectByPage(int currentPage, int pageSize) {
        //2. 获取SqlSession对象
        SqlSession sqlSession = factory.openSession();
//3. 获取BrandMapper

        BrandMapper mapper = sqlSession.getMapper(BrandMapper.class);
//4. 计算开始索引
        int begin = (currentPage - 1) * pageSize;
// 计算查询条目数
        int size = pageSize;
//5. 查询当前页数据
        List<Brand> rows = mapper.selectByPage(begin, size);
//6. 查询总记录数
        int totalCount = mapper.selectTotalCount();
//7. 封装PageBean对象
        PageBean<Brand> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);
//8. 释放资源
        sqlSession.close();
        return pageBean;

    }
}
