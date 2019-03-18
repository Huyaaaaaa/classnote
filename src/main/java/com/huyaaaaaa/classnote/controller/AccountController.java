package com.huyaaaaaa.classnote.controller;

import com.huyaaaaaa.classnote.dao.AccountJPA;
import com.huyaaaaaa.classnote.entity.AccountEntity;
import com.huyaaaaaa.classnote.entity.UserEntity;
import com.huyaaaaaa.classnote.service.LoginService;
import com.huyaaaaaa.classnote.service.RegisterService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Type;

@Controller
public class AccountController {
    @Autowired
    RegisterService registerService;
    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String test(Model model){
        AccountEntity acco =new AccountEntity();
        model.addAttribute("acc", acco);
        return "registerh";
    }


    //@ResponseBody
    @RequestMapping(path = "/register" ,method = RequestMethod.POST )
    public String registerAccount(Model model,AccountEntity account,HttpServletRequest request){
        try {
            AccountEntity reaccountEntity = registerService.registerAccount(account,request);
            model.addAttribute("title","success!" );
            model.addAttribute("message", "欢迎你！"+reaccountEntity.getAccountAcc());
            return "index";
        }catch (Exception e){
            return "index";
        }

    }

    @RequestMapping(value = "/login")
    public String login (@RequestParam(value = "acc")String acc,
                         @RequestParam(value = "pwd")String pwd,
                         Model model){
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setAccountPwd(pwd);
        accountEntity.setAccountAcc(acc);
        AccountEntity loginAcc = loginService.login(accountEntity);
        if (null==loginAcc){

            model.addAttribute("title", "登录失败");
            model.addAttribute("message", "此账号未注册");
            return "index";
        }else{
            model.addAttribute("title", "登录成功");
            model.addAttribute("message", "欢迎你\r\n"+loginAcc.getAccountAcc());
            return "index";
        }
    }
}
