package com.sky.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 封装分页查询结果
 */
@Data // 在编译时自动生成 Get 和 Set 方法
@AllArgsConstructor // 全参数构造器
@NoArgsConstructor  // 无参构造器
public class PageResult implements Serializable {

    private long total; //总记录数

    private List records; //当前页数据集合

}