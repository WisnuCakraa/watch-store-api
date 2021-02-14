package com.enigma.watchstore.Service;

import java.util.List;

import com.enigma.watchstore.Entity.UserEntity;

import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserEntity doRegisterUser(UserEntity userEntity);

    UserEntity doLoginUser(String username, String password);

    List<UserEntity> getUser();

    void deleteUser(String id);

}
