package com.example2.demo2.controller;

import com.example2.demo2.entity.Stu;
import com.example2.demo2.service.StuService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Stu)表控制层
 *
 * @author makejava
 * @since 2020-05-25 17:24:20
 */
@RestController
@RequestMapping("stu")
public class StuController {
    /**
     * 服务对象
     */
    @Resource
    private StuService stuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Stu selectOne(Integer id) {
        return this.stuService.queryById(id);
    }

}