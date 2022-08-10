package com.spharosacademy.jpa.project.spharosmvcandjpa.user.service;


import com.spharosacademy.jpa.project.spharosmvcandjpa.user.model.User;
import java.util.List;

public interface UserService {

    // 리턴 할 때, 프론트에 넘겨줄 때.
    User addUser(User user);
    List<User> getAll();

}
