package com.enigma.watchstore.Services.student;

import java.util.List;

import com.enigma.watchstore.Entity.student.WatchDetailEntity;
import com.enigma.watchstore.Repository.WatchDetailRepository;

import org.springframework.stereotype.Service;

@Service
public class WatchDetailService {

    private final WatchDetailRepository watchDetailRepository;

    public WatchDetailService(WatchDetailRepository watchDetailRepository) {
        this.watchDetailRepository = watchDetailRepository;
    }

    public List<WatchDetailEntity> getStudents() {
        return watchDetailRepository.findAll();
    }

}