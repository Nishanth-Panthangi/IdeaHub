package com.ideaXhub.service.impl;

import com.ideaXhub.manager.UserManager;
import com.ideaXhub.service.UserService;
import com.ideaXhub.view.UserRegistrationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserManager userManager;

    @Override
    public void registerUser(UserRegistrationDTO userDTO) {
        userManager.register(userDTO);
    }
}
