package com.enigma.watchstore.Service.impl;

import java.util.List;

import com.enigma.watchstore.Entity.StoreEntity;
import com.enigma.watchstore.Repository.StoreRepository;
import com.enigma.watchstore.Service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    StoreRepository storeRepository;

    @Override
    public List<StoreEntity> getStore() {
        return storeRepository.findAll();
    }

    @Override
    public StoreEntity addStore(StoreEntity storeEntity) {
        return storeRepository.save(storeEntity);
    }

    @Override
    public StoreEntity editStore(StoreEntity storeEntity) {
        return storeRepository.save(storeEntity);
    }

    @Override
    public void deleteStore(Integer id) {
        boolean exist = storeRepository.existsById(id);

        if (!exist) {
            throw new IllegalStateException("store with id " + id + " doesnt exist");
        }

        storeRepository.deleteById(id);
    }
}
