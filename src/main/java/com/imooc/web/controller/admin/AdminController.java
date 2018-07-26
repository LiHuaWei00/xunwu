package com.imooc.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 14:21 2018/7/26
 */
@Controller
public class AdminController {
    @GetMapping("/admin/center")
    public String adminCenterPage(){
        return "admin/center";
    }
    @GetMapping("/admin/welcome")
    public String welcomePage(){
        return "admin/welcome";
    }
}
