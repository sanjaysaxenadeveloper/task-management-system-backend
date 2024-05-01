package com.sanjaysaxenadeveloper.taskmanagementsystembackend.controller;

import com.sanjaysaxenadeveloper.taskmanagementsystembackend.model.Member;
import com.sanjaysaxenadeveloper.taskmanagementsystembackend.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminService adminService;
    @GetMapping("/members")
    public List<Member> members(){
        return adminService.getAllMembers();
    }
}
