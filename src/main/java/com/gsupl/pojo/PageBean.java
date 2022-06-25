package com.gsupl.pojo;

import java.util.List;

/**
 * @Author LGH
 * @Date 2022/6/16 17:34
 * @Version 1.0
 */
//分页查询的javaBean
public class PageBean<T> {
    // 总记录数
    private int totalCount;
    // 当前页数据
    private List<T> rows;
    public int getTotalCount() {
        return totalCount;
    }
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    public List<T> getRows() {
        return rows;
    }
    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}

