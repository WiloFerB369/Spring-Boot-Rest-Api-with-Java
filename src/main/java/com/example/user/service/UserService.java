package com.example.user.service;

import com.example.user.data.User;

import java.util.List;

public interface UserService
{
    User create(User user );

    User findById( String id );

    void deleteById( String id );

    User update( User user, String userId );

    List<User> all();
}
