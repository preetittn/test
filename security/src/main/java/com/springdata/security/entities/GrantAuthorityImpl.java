package com.springdata.security.entities;

import org.springframework.security.core.GrantedAuthority;

public class GrantAuthorityImpl implements GrantedAuthority {

    private String authority;

    public GrantAuthorityImpl(String authority)
    {
        this.authority=authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
