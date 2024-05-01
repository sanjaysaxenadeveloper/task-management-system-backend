package com.sanjaysaxenadeveloper.taskmanagementsystembackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Table(name = "team_member")
@Entity
@Data
@ToString
public class Member {
    @Id
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String gender;
    private String team;

}
