package com.enigma.watchstore.Repository;

import com.enigma.watchstore.Entity.StoreEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<StoreEntity, Integer> {

}
