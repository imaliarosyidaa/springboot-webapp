/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.imaliarosyida.studentsmartdisciplinewebapp.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Windows10
 */
@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String loginPage(){
        return "auth-login";
    }
    
    @RequestMapping("/home")
    public String loginSubmit(){ // Method ini digunakan untuk menerima request ketika submit diklik
        return "/layouts/dashboard";
    }
    
    @RequestMapping("/profile")
    public String profilepage(){ // Method ini digunakan untuk menerima request ketika submit diklik
        return "/pages/profile";
    }
}
// Done