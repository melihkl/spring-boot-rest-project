package com.example.demo.controller;

import com.example.demo.entity.Tur;
import com.example.demo.service.TurService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TurController {

    private final TurService turService;

    public TurController(TurService turService) {
        this.turService = turService;
    }

    @PostMapping("/save")
    public ResponseEntity<Tur> saveTurPage(@RequestBody Tur tur){
        Tur tur1 = turService.saveTur(tur);
        return ResponseEntity.ok(tur1);
    }

    @GetMapping("/turList")
    public List<Tur> turListe(){
        return turService.getAllTur();
    }
}
