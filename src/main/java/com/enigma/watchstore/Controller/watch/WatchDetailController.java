package com.enigma.watchstore.Controller.watch;

import java.util.List;

import com.enigma.watchstore.Entity.watch.WatchDetailEntity;
import com.enigma.watchstore.Services.watch.WatchDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WatchDetailController {

    private final WatchDetailService studentService;

    @Autowired
    public WatchDetailController(WatchDetailService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/watch-detail")
    public List<WatchDetailEntity> getStudents() {
        return studentService.getStudents();
    }

}
