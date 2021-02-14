package com.enigma.watchstore.Service;

import java.util.List;

import com.enigma.watchstore.Entity.WatchSeriesEntity;

public interface WatchSeriesService {

    WatchSeriesEntity addWatchSeries(WatchSeriesEntity watchSeriesEntity);

    WatchSeriesEntity editWatchSeries(WatchSeriesEntity watchSeriesEntity);

    List<WatchSeriesEntity> getWatchSeries();

    void deleteWatchSeries(Integer id);

}