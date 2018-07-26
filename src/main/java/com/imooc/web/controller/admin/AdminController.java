package com.imooc.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ Author     ：李华伟
 * @ Date       ：Created in 14:21 2018/7/26
 */
@Controller
public class AdminController {
    /**
     * 后台管理中心
     * @return
     */
    @GetMapping("/admin/center")
    public String adminCenterPage(){
        return "admin/center";
    }
    /**
     * 欢迎页
     * @return
     */
    @GetMapping("/admin/welcome")
    public String welcomePage(){
        return "admin/welcome";
    }
    /**
     * 管理员登录页
     * @return
     */
    @GetMapping("/admin/login")
    public String adminLoginPage() {
        return "admin/login";
    }
}
