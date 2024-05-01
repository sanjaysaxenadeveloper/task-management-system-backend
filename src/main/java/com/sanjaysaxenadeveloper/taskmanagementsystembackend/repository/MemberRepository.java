package com.sanjaysaxenadeveloper.taskmanagementsystembackend.repository;

import com.sanjaysaxenadeveloper.taskmanagementsystembackend.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
}
