package com.test1.controller;

import com.test1.domain.User;
import com.test1.mapper.UserMapper;
import com.test1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class MybatisController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public String login(Model model, String username, String password) {
        User user = userService.login(username, password);
        if (user != null) {
            model.addAttribute("user", user);
            return "forward:/index.html";
        }

        model.addAttribute("msg", "账户密码不存在");
        return "forward:/";
    }
}
