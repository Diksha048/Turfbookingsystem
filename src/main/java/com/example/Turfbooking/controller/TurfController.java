package com.example.Turfbooking.controller;

import com.example.Turfbooking.model.Turf;
import com.example.Turfbooking.service.TurfService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class TurfController {

    private final TurfService turfService;

    public TurfController(TurfService turfService) {
        this.turfService = turfService;
    }

    @GetMapping("/turfs")
    public List<Turf> getAllTurfs() {
        return turfService.getAllTurfs();
    }

    @PostMapping("/turfs")
    public Turf addTurf(@RequestBody Turf turf) {
        return turfService.saveTurf(turf);
    }
}
