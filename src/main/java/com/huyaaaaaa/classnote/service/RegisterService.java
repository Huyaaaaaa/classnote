package com.huyaaaaaa.classnote.service;

import com.huyaaaaaa.classnote.common.GetIPUtil;
import com.huyaaaaaa.classnote.dao.AccountJPA;
import com.huyaaaaaa.classnote.dao.UserJPA;
import com.huyaaaaaa.classnote.entity.AccountEntity;
import com.huyaaaaaa.classnote.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class RegisterService {
    @Autowired
    AccountJPA accountJPA;
    @Autowired
    UserJPA userJPA;

    /*
    * 注册账号
    *
    */
    public AccountEntity registerAccount(AccountEntity a, HttpServletRequest request) {

        //获取真实ip地址塞入account信息

        System.out.println("header信息为");
        String ip = GetIPUtil.GetIp(request);
        System.out.println("现在的ip为"+ip);
        a.setAccountLastIp(ip);
        UserEntity userEntity = new UserEntity();
        UserEntity save = userJPA.save(userEntity);
        System.out.println(save.getUserId());
        return null;
    }
}
