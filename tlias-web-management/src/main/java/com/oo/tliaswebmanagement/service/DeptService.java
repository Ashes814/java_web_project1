package com.oo.tliaswebmanagement.service;

import com.oo.tliaswebmanagement.pojo.Dept;

import java.util.List;

/**
 * 部门管理
 */
public interface DeptService {
    List<Dept> list();

    void delete(Integer id);

    void add(Dept dept);
}
