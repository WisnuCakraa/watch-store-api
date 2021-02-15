package com.enigma.watchstore.Controller;

import java.util.List;

import com.enigma.watchstore.Entity.StoreEntity;
import com.enigma.watchstore.Service.StoreService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping
    public List<StoreEntity> getAllStore() {
        return storeService.getStore();
    }

    @PostMapping
    public ResponseEntity<StoreEntity> addStore(@RequestBody StoreEntity storeEntity) {
        try {
            StoreEntity save = storeService.addStore(storeEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<StoreEntity> editStore(@RequestBody StoreEntity storeEntity) {
        try {
            StoreEntity save = storeService.editStore(storeEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteStore(@PathVariable("id") String id) {
        storeService.deleteStore(id);
    }
}
