package com.oo.tliaswebmanagement.mapper;

import com.oo.tliaswebmanagement.pojo.Dept;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 部门管理
 */
@Mapper
public interface DeptMapper {

    @Select("SELECT * FROM dept")
    List<Dept> list();


    @Delete("DELETE FROM dept WHERE id = #{id}")
    void deleteById(Integer id);


    @Insert("INSERT INTO dept(name, create_time, update_time) values(#{name}, #{createTime}, #{updateTime})")
    void insert(Dept dept);
}
