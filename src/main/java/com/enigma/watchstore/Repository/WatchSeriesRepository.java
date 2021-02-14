package com.enigma.watchstore.Repository;

import com.enigma.watchstore.Entity.WatchSeriesEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface WatchSeriesRepository extends JpaRepository<WatchSeriesEntity, Integer> {

}
