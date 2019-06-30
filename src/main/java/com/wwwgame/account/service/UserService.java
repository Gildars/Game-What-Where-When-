package com.wwwgame.account.service;

import com.wwwgame.account.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
