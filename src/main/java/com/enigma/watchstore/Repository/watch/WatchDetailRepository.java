package com.enigma.watchstore.Repository.watch;

import com.enigma.watchstore.Entity.watch.WatchDetailEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchDetailRepository extends JpaRepository<WatchDetailEntity, Integer> {

}
