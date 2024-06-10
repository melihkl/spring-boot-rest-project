package com.example.demo.service;

import com.example.demo.entity.Tur;

import java.util.List;

public interface TurService {
    Tur saveTur(Tur tur);
    List<Tur> getAllTur();

}
