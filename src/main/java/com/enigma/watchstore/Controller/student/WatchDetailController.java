package com.enigma.watchstore.Controller.student;

import java.util.List;

import com.enigma.watchstore.Entity.student.WatchDetailEntity;
import com.enigma.watchstore.Services.student.WatchDetailService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/watch_detail")
public class WatchDetailController {

    private final WatchDetailService studentService;

    @Autowired
    public WatchDetailController(WatchDetailService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<WatchDetailEntity> getStudents() {
        return studentService.getStudents();
    }

}
