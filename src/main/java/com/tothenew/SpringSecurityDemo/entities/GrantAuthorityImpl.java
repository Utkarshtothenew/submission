package com.tothenew.SpringSecurityDemo.entities;

import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Entity
public class GrantAuthorityImpl implements GrantedAuthority
{
    public GrantAuthorityImpl() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer roleid;
   private String authority;

   @ManyToMany(mappedBy = "authorities")
   private List<User> users;

    public GrantAuthorityImpl(String authority) {


        this.authority = authority;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
