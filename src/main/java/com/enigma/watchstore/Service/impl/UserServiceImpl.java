package com.enigma.watchstore.Service.impl;

import java.util.List;

import com.enigma.watchstore.Entity.UserEntity;
import com.enigma.watchstore.Repository.UserRepository;
import com.enigma.watchstore.Service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserEntity doRegisterUser(UserEntity user) {
        return userRepository.save(user);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public List<UserEntity> getUser() {
        return userRepository.findAll();
    }

    @Override
    public UserEntity doLoginUser(String username, String password) {
        if (!userRepository.existsByUsernameAndPassword(username, password)) {
            throw new IllegalStateException("username or password incorrect");
        } else {
            return userRepository.findByUsername(username);
        }

    }

    @Override
    public void deleteUser(String id) {
        boolean exist = userRepository.existsById(id);
        if (!exist) {
            throw new IllegalStateException("user with id " + id + " doesnt exist");
        }
        userRepository.deleteById(id);
    }
}
