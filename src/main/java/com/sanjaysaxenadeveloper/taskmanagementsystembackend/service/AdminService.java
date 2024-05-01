package com.sanjaysaxenadeveloper.taskmanagementsystembackend.service;

import com.sanjaysaxenadeveloper.taskmanagementsystembackend.model.Member;
import com.sanjaysaxenadeveloper.taskmanagementsystembackend.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    MemberRepository memberRepository;
    public List<Member> getAllMembers() {
        List<Member> members=memberRepository.findAll();
        System.out.println(members);
        return members;
    }
}
