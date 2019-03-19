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
        if (null!=ip && ip!="0:0:0:0:0:0:0:1"){
            a.setAccountCreateip(ip);
        }
        System.out.println("现在的ip为"+ip);

        UserEntity userEntity = new UserEntity();
        //需要保存后才能生成uuid所以需要保存一个空的user角色
        //然后将返回值即id填入account
        UserEntity save = userJPA.save(userEntity);
        String userId = save.getUserId();
        System.out.println("现在的userID为："+userId);
       //将关联的userid写入账户
        a.setAccountUserId(userId);
        //保存账户
        accountJPA.save(a);
        return a;
    }
}
