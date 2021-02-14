package com.enigma.watchstore.Service;

import java.util.List;

import com.enigma.watchstore.Entity.WatchDetailEntity;

public interface WatchDetailService {

    WatchDetailEntity addWatchDetail(WatchDetailEntity watchDetailEntity);

    WatchDetailEntity editWatchDetail(WatchDetailEntity watchDetailEntity);

    List<WatchDetailEntity> getWatchDetail();

    void deleteWatchDetail(String id);

}