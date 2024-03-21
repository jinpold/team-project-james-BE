package com.james.api.User;

import com.james.api.account.Account;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString
public class User {

    @Id
    @Column(name = "user_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account accounts;


    private String username;
    private String password;
    private String checkPassword;
    private String name;
    private String phone;
    private Long addressId;
    private String job;
    private double height;
    private double weight;
    @Builder(builderMethodName = "builder")
    public User(Long id, String username, String password, String checkPassword,
                String name, String phone, String job, double height, double weight) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.checkPassword = checkPassword;
        this.name = name;
        this.phone = phone;
        this.job = job;
        this.height = height;
        this.weight = weight;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}