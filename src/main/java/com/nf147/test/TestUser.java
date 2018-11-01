package com.nf147.test;


import com.nf147.dao.PsUserMapper;
import com.nf147.entity.PsUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/user")
public class TestUser {

    @Autowired
    private PsUserMapper psUserMapper;
    //创建用户
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String createUser(PsUser psUser){
        psUserMapper.insert(psUser);
        return "redirect:/user";
    }
    // 创建具有给定输入数组的用户列表
    @RequestMapping(value = "/createWithArray" ,method = RequestMethod.POST)
    public String createWithArray(ArrayList<PsUser> psUsers){

        return "redirect:/user";
    }
    //创建具有给定输入数组的用户列表
    @RequestMapping(value = "/createWithList" ,method = RequestMethod.POST)
    public String createWithList(List<PsUser> psUsers){

        return "redirect:/user";
    }
    //将用户登录到系统中
    @RequestMapping(value = "/login" ,method = RequestMethod.GET)
    public String logsUserIntoTheSystem(String user,String pwd){

        return "redirect:/user";
    }
    //注销当前登录的用户会话
    @RequestMapping(value = "/logout" ,method = RequestMethod.GET)
    public String logsOutCurrentLoggedInUserSession(){

        return "redirect:/user";
    }
    //按用户名获取用户
    @RequestMapping(value = "/{username}" ,method = RequestMethod.GET)
    public String getUserByUserName(String username){

        return "redirect:/user";
    }
    //更新的用户
    @RequestMapping(value = "/login" ,method = RequestMethod.PUT)
    public String updatedUser(PsUser psUser){
        psUserMapper.updateByPrimaryKey(psUser);
        return "redirect:/user";
    }
    //删除用户
    @RequestMapping(value = "/{username}" ,method = RequestMethod.DELETE)
    public String deleteUser(String name){
        psUserMapper.deleteByPrimaryKey(name);
        return "redirect:/user";
    }
}
