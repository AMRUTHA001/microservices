package com.UST.userservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_tbl")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstname;
    private String Lastname;
    private String email;
    private Long departmentId;


}

