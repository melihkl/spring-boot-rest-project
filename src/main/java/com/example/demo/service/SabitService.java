package com.example.demo.service;

import com.example.demo.entity.Sabit;

import java.util.List;

public interface SabitService {
    Sabit saveSabit(Sabit sabit);
    List<Sabit> getAllSabit();
}
