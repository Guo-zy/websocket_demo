package com.yancy.testWebsocket.service;


import com.yancy.testWebsocket.entity.User;
import com.yancy.testWebsocket.respository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
}
