package com.tothenew.SpringSecurityDemo.entities;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class User implements UserDetails
{
    public User() {
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userid;
    private  String username;
    private  String password;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "userroles",
            joinColumns = @JoinColumn(name = "userid"),
            inverseJoinColumns = @JoinColumn(name = "roleid"))
    private List<GrantAuthorityImpl> authorities;
    private boolean isAccountNotExpired;
    private boolean isAccountNonLocked;
    private  boolean isCredentialsNonExpired;
    private  boolean isEnabled;

    public User(String username, String password, List<GrantAuthorityImpl> authorities, boolean isAccountNotExpired, boolean isAccountNonLocked, boolean isCredentialsNonExpired, boolean isEnabled) {
        this.username = username;
        this.password = password;
        this.authorities = authorities;
        this.isAccountNotExpired = isAccountNotExpired;
        this.isAccountNonLocked = isAccountNonLocked;
        this.isCredentialsNonExpired = isCredentialsNonExpired;
        this.isEnabled = isEnabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities()
    {
        return authorities;
    }
    @Override
    public String getPassword()
    {
        return this.password;
    }

    @Override
    public String getUsername()
    {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired()
    {
        return isAccountNotExpired;
    }

    @Override
    public boolean isAccountNonLocked()
    {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired()
    {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled()
    {
        return isEnabled;
    }

    public boolean isAccountNotExpired()
    {
        return isAccountNotExpired;
    }

    public void setAccountNotExpired(boolean accountNotExpired)
    {
        isAccountNotExpired = accountNotExpired;
    }

    public void setAccountNonLocked(boolean accountNonLocked)
    {
        isAccountNonLocked = accountNonLocked;
    }

    public void setCredentialsNonExpired(boolean credentialsNonExpired)
    {
        isCredentialsNonExpired = credentialsNonExpired;
    }

    public void setEnabled(boolean enabled)
    {
        isEnabled = enabled;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }



    public void setAuthorities(List<GrantAuthorityImpl> authorities)
    {
        this.authorities = authorities;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorities=" + authorities +
                ", isAccountNotExpired=" + isAccountNotExpired +
                ", isAccountNonLocked=" + isAccountNonLocked +
                ", isCredentialsNonExpired=" + isCredentialsNonExpired +
                ", isEnabled=" + isEnabled +
                '}';
    }
}
