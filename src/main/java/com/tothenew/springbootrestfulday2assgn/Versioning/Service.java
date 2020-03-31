package com.tothenew.springbootrestfulday2assgn.Versioning;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {

    static List<BasicUser> basicUserList = new ArrayList<>();
    static List<DetailedUser> detailedUsers = new ArrayList<>();
    static {
        basicUserList.add(new BasicUser("Shiva","Tiwari"));
        detailedUsers.add(new DetailedUser("Shiva","asd","asd","22",1));
    }

    public List<BasicUser> getAllBasicuser() {
        return basicUserList;
    }


    public List<DetailedUser> getAllDetaileduser() {
        return detailedUsers;
    }

}
