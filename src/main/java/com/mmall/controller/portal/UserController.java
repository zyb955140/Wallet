package com.mmall.controller.portal;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * Created by Edison zhu
 * date 2019.5
 */
@Controller
@RequestMapping("/user/")
public class UserController {
    /**
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value ="login.do",method = RequestMethod.POST)
    @ResponseBody
    public Object login(String username, String password, HttpSession session){
        return null;
    }
}
