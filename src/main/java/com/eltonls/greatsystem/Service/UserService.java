package com.eltonls.greatsystem.Service;

import java.util.List;

import com.eltonls.greatsystem.Model.User;

public interface UserService {

    public User saveUser(User user);
    public List<User> getAllUsers();
}
