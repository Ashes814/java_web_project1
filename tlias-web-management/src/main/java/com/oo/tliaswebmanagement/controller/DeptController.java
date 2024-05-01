package com.oo.tliaswebmanagement.controller;


import com.oo.tliaswebmanagement.pojo.Dept;
import com.oo.tliaswebmanagement.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.oo.tliaswebmanagement.service.DeptService;

import java.util.List;

/**
 * 部门管理Controller
 */
@Slf4j
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

//    private static Logger log = LoggerFactory.getLogger(DeptController.class);

//    @RequestMapping(value = "/depts", method = RequestMethod.GET)
    @GetMapping("/depts")
    public Result list() {

        log.info("Select all dept");

        List<Dept> deptList = deptService.list();
        return Result.success(deptList);
    }

    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id) {
        log.info("Delete Dept by ID");
        // Call service to delete department
        deptService.delete(id);
        return Result.success();

    }

    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept) {
        log.info("add {}", dept);
        deptService.add(dept);

        return Result.success();
    }

}
