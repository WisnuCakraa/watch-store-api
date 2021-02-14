package com.enigma.watchstore.Controller;

import java.util.List;

import com.enigma.watchstore.Entity.UserEntity;
import com.enigma.watchstore.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    UserService userService;

    @GetMapping("/users")
    public List<UserEntity> getUser() {
        return userService.getUser();
    }

    @PostMapping("/register")
    public ResponseEntity<UserEntity> doSaveUser(@RequestBody UserEntity userEntity) {
        try {
            userEntity.setPassword(bCryptPasswordEncoder.encode(userEntity.getPassword()));
            UserEntity save = userService.doRegisterUser(userEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/login")
    public ResponseEntity<UserEntity> doLoginUser(@RequestBody UserEntity userEntity) {
        try {
            String username = userEntity.getUsername();
            String password = userEntity.getPassword();
            UserEntity save = userService.doLoginUser(username, password);
            return new ResponseEntity<>(save, HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);

        }
    }

    @DeleteMapping(path = "/users/{id}")
    public void deleteWatchDetail(@PathVariable("id") String id) {
        userService.deleteUser(id);
    }
}