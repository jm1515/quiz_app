package com.quizzio.service.user;

import com.quizzio.model.entities.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private static final int DEFAULT_SCORE = 0;

    @Override
    public User createUser(String username) {
        return new User(username, DEFAULT_SCORE);
    }
}
