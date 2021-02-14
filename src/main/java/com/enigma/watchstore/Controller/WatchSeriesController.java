package com.enigma.watchstore.Controller;

import java.util.List;

import com.enigma.watchstore.Entity.WatchSeriesEntity;
import com.enigma.watchstore.Service.WatchSeriesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/watch-series")
public class WatchSeriesController {

    @Autowired
    WatchSeriesService watchSeriesService;

    @GetMapping
    public List<WatchSeriesEntity> getWatchSeries() {
        return watchSeriesService.getWatchSeries();
    }

    @PostMapping
    public ResponseEntity<WatchSeriesEntity> addWatchSeries(@RequestBody WatchSeriesEntity watchSeriesEntity) {
        try {
            WatchSeriesEntity save = watchSeriesService.addWatchSeries(watchSeriesEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping
    public ResponseEntity<WatchSeriesEntity> editWatchSeries(@RequestBody WatchSeriesEntity watchSeriesEntity) {
        try {
            WatchSeriesEntity save = watchSeriesService.editWatchSeries(watchSeriesEntity);
            return new ResponseEntity<>(save, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping(path = "/{id}")
    public void deleteWatchSeries(@PathVariable("id") Integer id) {
        watchSeriesService.deleteWatchSeries(id);
    }
}
