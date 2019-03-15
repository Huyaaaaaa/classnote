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
        String ip = GetIPUtil.GetIp(request);
        a.setAccountLastIp(ip);
        System.out.println(ip);
        System.out.println("$$$$$$$$");
        UserEntity userEntity = new UserEntity();
        UserEntity save = userJPA.save(userEntity);
        System.out.println(save.getUserId());
        return null;
    }
}
