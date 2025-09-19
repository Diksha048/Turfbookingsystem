package com.example.Turfbooking.service;

import com.example.Turfbooking.model.Turf;
import com.example.Turfbooking.repository.TurfRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurfService {

    private final TurfRepository turfRepository;

    public TurfService(TurfRepository turfRepository) {
        this.turfRepository = turfRepository;
    }

    public List<Turf> getAllTurfs() {
        return turfRepository.findAll();
    }

    public Turf saveTurf(Turf turf) {
        return turfRepository.save(turf);
    }
}
