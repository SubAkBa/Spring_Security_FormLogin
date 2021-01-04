package com.example.security.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Member {

    @Id
    private String name;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    public Member(String name, String password, Role role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }
}
