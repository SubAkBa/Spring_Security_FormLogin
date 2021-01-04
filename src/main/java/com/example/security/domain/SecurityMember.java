package com.example.security.domain;

import lombok.Getter;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;

@Getter
public class SecurityMember extends User {

    private final Member member;

    public SecurityMember(Member member) {
        super(member.getName(), member.getPassword(), AuthorityUtils.createAuthorityList(member.getRole().getValue()));
        this.member = member;
    }
}
