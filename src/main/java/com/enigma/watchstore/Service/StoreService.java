package com.enigma.watchstore.Service;

import java.util.List;

import com.enigma.watchstore.Entity.StoreEntity;

public interface StoreService {

    StoreEntity addStore(StoreEntity storeEntity);

    StoreEntity editStore(StoreEntity storeEntity);

    List<StoreEntity> getStore();

    void deleteStore(Integer id);

}