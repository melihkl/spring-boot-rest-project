package com.example.demo.service.impl;

import com.example.demo.entity.Tur;
import com.example.demo.repository.TurRepository;
import com.example.demo.service.TurService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TurServiceImpl implements TurService {

    private final TurRepository turRepository;


    public TurServiceImpl(TurRepository turRepository) {
        this.turRepository = turRepository;
    }

    public Tur saveTur(Tur tur){
        return turRepository.save(tur);
    }

    @Override
    public List<Tur> getAllTur() {
        return turRepository.findAll();
    }

}
