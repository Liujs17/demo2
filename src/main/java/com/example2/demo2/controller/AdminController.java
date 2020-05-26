package com.example2.demo2.controller;

import com.example2.demo2.entity.Admin;
import com.example2.demo2.service.AdminService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Admin)表控制层
 *
 * @author makejava
 * @since 2020-05-26 09:13:48
 */

@Controller
@RequestMapping("admin")
public class AdminController {
    /**
     * 服务对象
     */

    @Resource
    private AdminService adminService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Admin selectOne(Integer id) {
        return this.adminService.queryById(id);
    }
    @GetMapping("getById")
    public Admin getById(Integer id){
        return  this.adminService.queryById(id);
    }
    @PostMapping("login")
    public Admin login(String account,String password){
        return adminService.login(account,password);
    }

    @PostMapping("insert")
    @ResponseBody
   public Admin insert(Admin bean){
        return adminService.insert(bean);

   }
}