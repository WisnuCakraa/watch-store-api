package com.enigma.watchstore.Service.impl;

import java.util.List;

import com.enigma.watchstore.Entity.WatchDetailEntity;
import com.enigma.watchstore.Repository.WatchDetailRepository;
import com.enigma.watchstore.Service.WatchDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchDetailServiceImpl implements WatchDetailService {

    @Autowired
    WatchDetailRepository watchDetailRepository;

    @Override
    public List<WatchDetailEntity> getWatchDetail() {
        return watchDetailRepository.findAll();
    }

    @Override
    public WatchDetailEntity addWatchDetail(WatchDetailEntity watchDetailEntity) {
        return watchDetailRepository.save(watchDetailEntity);
    }

    @Override
    public WatchDetailEntity editWatchDetail(WatchDetailEntity watchDetailEntity) {
        return watchDetailRepository.save(watchDetailEntity);
    }

    @Override
    public void deleteWatchDetail(Integer id) {
        boolean exist = watchDetailRepository.existsById(id);

        if (!exist) {
            throw new IllegalStateException("watchDetail with id " + id + "doesnt exist");
        }

        watchDetailRepository.deleteById(id);
    }

}
