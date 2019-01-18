package com.dareway.service;

import com.dareway.dao.SysUserDao;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {

    private SysUserDao sysUserDao;

    public void login(){
        System.out.println("haha");
    }
}

