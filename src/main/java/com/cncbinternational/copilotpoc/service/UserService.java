package com.cncbinternational.copilotpoc.service;
import com.cncbinternational.copilotpoc.Entity.User;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class UserService {

    public List<User> generateUsers() {
        List<User> userList = new ArrayList<>();
        var users = Arrays.asList(
                "Join",
                "Orange"
        );
        /*add the list of users to list of user's name*/

        return userList;
    }

    public void styleTest() {
        var userA = "&&&AAAA1+9";
        var userB = "&&&BBBB2+8";


    }

    public void sonarError(){
        var user = new User();
        user = null;
        user.setName("test-null");
    }

}

