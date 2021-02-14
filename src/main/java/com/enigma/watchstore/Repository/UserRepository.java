package com.enigma.watchstore.Repository;

import com.enigma.watchstore.Entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

    Boolean existsByUsernameAndPassword(String username, String password);

    Boolean existsByUsername(String username);

    UserEntity findByUsername(String username);

    UserEntity findByEmail(String email);
}
