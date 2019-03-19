package com.huyaaaaaa.classnote.controller;

import com.huyaaaaaa.classnote.entity.AccountEntity;
import com.huyaaaaaa.classnote.service.LoginService;
import com.huyaaaaaa.classnote.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AccountController {
    @Autowired
    RegisterService registerService;
    @Autowired
    LoginService loginService;

    @RequestMapping(path = "/test",method = RequestMethod.GET)
    public String test(Model model){
        AccountEntity account =new AccountEntity();
        model.addAttribute("acc", account);
        return "registerh";
    }


    //注册
    @RequestMapping(path = "/register" ,method = RequestMethod.POST )
    public String registerAccount(Model model,AccountEntity account,HttpServletRequest request){
        if (null!=account.getAccountAcc() && ""!=account.getAccountAcc()){
            if(null!=account.getAccountPwd() &&""!=account.getAccountPwd()) {


            }
        }


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
