package com.example.user.service;

import com.example.user.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class UserServiceHashMap implements UserService{

    private HashMap<String, User> userHashMap = new HashMap<>();

    @Override
    public User create(User user) {
        int id  = userHashMap.size()+1;
        user.setId(String.valueOf(id));
        userHashMap.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        return userHashMap.containsKey(id) ? userHashMap.get(id) : null;
    }

    @Override
    public boolean deleteById(String id) {
        if(userHashMap.containsKey(id)){
            userHashMap.remove(id);
            return true;
        }

        return  false;
    }

    @Override
    public User update(User user, String id) {
        if(userHashMap.containsKey(id)){
            User userTemp = userHashMap.get(id);

            //Solo actualiza el campo email
            //userTemp.setName(user.getName());
            //userTemp.setLastName(user.getLastName());
            userTemp.setEmail(user.getEmail());
            return userHashMap.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        return new ArrayList<>(userHashMap.values());
    }
}
