package com.example.mybatis.mybatisdemo.demo.dao;

import com.example.mybatis.mybatisdemo.demo.domain.Table_name;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description:
 * @author: zuoweichen
 * @date: 2018/12/9
 * @time: 13:00
 * Copyright (C) 2018 MTDP
 * All rights reserved
 */

@Mapper
public interface TestMapper {
    Table_name getMyTable();
}
