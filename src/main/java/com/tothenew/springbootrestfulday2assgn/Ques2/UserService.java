package com.tothenew.springbootrestfulday2assgn.Ques2;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class UserService {
    private static List<UserModel> userModelList = new ArrayList<>();

    static {
        userModelList.add(new UserModel("Shiva",22));
        userModelList.add(new UserModel("Shivam",32));
        userModelList.add(new UserModel("Shivang",42));
    }

    public List<UserModel> getAll() {
        return userModelList;
    }

    public List<UserModel> post(UserModel userModel) {
        userModelList.add(userModel);
        return userModelList;
    }

    public List<UserModel> deleteUser(String name) {
        Iterator iterator = userModelList.iterator();
        while (iterator.hasNext()) {
            UserModel userModel = (UserModel) iterator.next();
            if (name.equals(userModel.getName())) {
                userModelList.remove(userModel);
                return userModelList;
            }
        }
        return null;
    }

    public UserModel findOne(String name) {
        for (UserModel user : userModelList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }


}
