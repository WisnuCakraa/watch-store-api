package com.enigma.watchstore.Repository;

import com.enigma.watchstore.Entity.student.WatchDetailEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchDetailRepository extends JpaRepository<WatchDetailEntity, Integer> {

}
