package com.enigma.watchstore.Controller;

import java.util.List;

import com.enigma.watchstore.Entity.WatchDetailEntity;
import com.enigma.watchstore.Service.WatchDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WatchDetailController {

    @Autowired
    WatchDetailService watchDetailService;

    @GetMapping("/watch-detail")
    public List<WatchDetailEntity> getWatchDetail() {
        return watchDetailService.getWatchDetail();
    }

    @PostMapping("/watch-detail")
    public ResponseEntity<WatchDetailEntity> addWatchProduct(@RequestBody WatchDetailEntity watchDetailEntity) {
        try {
            WatchDetailEntity save = watchDetailService.addWatchDetail(watchDetailEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/watch-detail")
    public ResponseEntity<WatchDetailEntity> editWatchProduct(@RequestBody WatchDetailEntity watchDetailEntity) {
        try {
            WatchDetailEntity save = watchDetailService.addWatchDetail(watchDetailEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "/watch-detail/{id}")
    public void deleteWatchDetail(@PathVariable("id") Integer id) {
        watchDetailService.deleteWatchDetail(id);
    }
}
