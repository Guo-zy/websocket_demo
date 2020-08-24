package com.yancy.testWebsocket.service;


import com.yancy.testWebsocket.entity.User;
import com.yancy.testWebsocket.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
}
