package org.example.springcrud.controller;

import org.example.springcrud.entity.Role;
import org.example.springcrud.entity.User;
import org.example.springcrud.service.RoleService;
import org.example.springcrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    @GetMapping("/registration")
    public String registration(Model model) {
        List<Role> roles = roleService.getRoles();

        model.addAttribute("user", new User());
        model.addAttribute("rolesList", roles);
        return "registration-form";
    }

    @PostMapping("/create-user")
    public String creatUser(@ModelAttribute("user") User user) {
        System.out.println(user);
        userService.saveUser(user);
        return "redirect:/registration";
    }

}
