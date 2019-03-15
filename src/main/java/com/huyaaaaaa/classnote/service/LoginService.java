package com.huyaaaaaa.classnote.service;


import com.huyaaaaaa.classnote.dao.AccountJPA;
import com.huyaaaaaa.classnote.dao.UserJPA;
import com.huyaaaaaa.classnote.entity.AccountEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginService {
    @Autowired
    AccountJPA accountJPA;
    @Autowired
    UserJPA userJPA;

    public AccountEntity login(AccountEntity accountEntity){
        List<AccountEntity>  list= accountJPA.findByAccountAcc(accountEntity.getAccountAcc());
        System.out.println("长度："+list.size());

        if (list.size()>=1){

            AccountEntity ae=list.get(0);
            System.out.println("账号是："+ae.getAccountAcc());
            String pwd = ae.getAccountPwd();
            if (!pwd.equals(accountEntity.getAccountPwd())){
                return null;
            }else{
                return list.get(0);
            }
        }
        return null;
    }
}
