package com.example.demo.service;
import java.util.List;

import com.example.demo.model.User;
import com.example.demo.model.UserDto;

public interface UserService {
	User saveAll(User user);
    User save(UserDto user);
    List<User> findAll();
    void delete(long id);
    User findOne(String username);
    User findById(Long id);
}
