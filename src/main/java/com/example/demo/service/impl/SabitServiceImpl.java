package com.example.demo.service.impl;

import com.example.demo.entity.Sabit;
import com.example.demo.repository.SabitRepository;
import com.example.demo.service.SabitService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SabitServiceImpl implements SabitService {

    private final SabitRepository sabitRepository;

    public SabitServiceImpl(SabitRepository sabitRepository) {
        this.sabitRepository = sabitRepository;
    }

    @Override
    public Sabit saveSabit(Sabit sabit) {
        return sabitRepository.save(sabit);
    }

    @Override
    public List<Sabit> getAllSabit() {
        return sabitRepository.findAll();
    }
}
