package com.chhai.springsecuritybasic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private int id;
    private String email;
    private String password;
    private String address;
    private String gender;
    private String role;
}
