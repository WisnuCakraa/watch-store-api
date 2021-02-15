package com.enigma.watchstore.Service.impl;

import java.util.List;

import com.enigma.watchstore.Entity.WatchSeriesEntity;
import com.enigma.watchstore.Repository.WatchSeriesRepository;
import com.enigma.watchstore.Service.WatchSeriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchSeriesServiceImpl implements WatchSeriesService {

    @Autowired
    WatchSeriesRepository watchSeriesRepository;

    @Override
    public List<WatchSeriesEntity> getWatchSeries() {
        return watchSeriesRepository.findAll();
    }

    @Override
    public WatchSeriesEntity addWatchSeries(WatchSeriesEntity watchSeriesEntity) {
        return watchSeriesRepository.save(watchSeriesEntity);
    }

    @Override
    public WatchSeriesEntity editWatchSeries(WatchSeriesEntity watchSeriesEntity) {
        return watchSeriesRepository.save(watchSeriesEntity);
    }

    @Override
    public void deleteWatchSeries(Integer id) {
        boolean exist = watchSeriesRepository.existsById(id);

        if (!exist) {
            throw new IllegalStateException("watchSeries with id " + id + " doesnt exist");
        }

        watchSeriesRepository.deleteById(id);
    }
}
