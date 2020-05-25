package com.example2.demo2.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Stu)实体类
 *
 * @author makejava
 * @since 2020-05-25 17:24:15
 */
public class Stu implements Serializable {
    private static final long serialVersionUID = 165825843731835489L;
    
    private Integer id;
    
    private String account;
    
    private String password;
    
    private String mobile;
    
    private Date regData;
    
    private Date lastLoginData;
    
    private Integer isAllow;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getRegData() {
        return regData;
    }

    public void setRegData(Date regData) {
        this.regData = regData;
    }

    public Date getLastLoginData() {
        return lastLoginData;
    }

    public void setLastLoginData(Date lastLoginData) {
        this.lastLoginData = lastLoginData;
    }

    public Integer getIsAllow() {
        return isAllow;
    }

    public void setIsAllow(Integer isAllow) {
        this.isAllow = isAllow;
    }

}