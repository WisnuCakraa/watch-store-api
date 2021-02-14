package com.enigma.watchstore.Controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

import javax.xml.bind.ValidationException;

import com.enigma.watchstore.Entity.UserEntity;
import com.enigma.watchstore.Repository.UserRepository;
import com.enigma.watchstore.Service.UserService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @GetMapping("/users")
    public List<UserEntity> getUser() {
        return userService.getUser();
    }

    @PostMapping("/register")
    public ResponseEntity<UserEntity> doSaveUser(@RequestBody Map<String, String> body)
            throws NoSuchAlgorithmException {
        try {
            String username = body.get("username");
            if (userRepository.existsByUsername(username)) {
                throw new IllegalStateException("Username already existed");
            }

            String password = body.get("password");
            String encodedPassword = new BCryptPasswordEncoder().encode(password);
            String email = body.get("email");
            UserEntity save = userRepository.save(new UserEntity(username, email, encodedPassword));
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