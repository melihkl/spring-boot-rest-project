package com.example.demo.controller;

import com.example.demo.entity.Sabit;
import com.example.demo.service.SabitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class SabitController {

    private final SabitService sabitService;

    public SabitController(SabitService sabitService) {
        this.sabitService = sabitService;
    }

    @PostMapping("/saveSabit")
    public ResponseEntity<Sabit> saveSabitPage(@RequestBody Sabit sabit){
        Sabit sabit1 = sabitService.saveSabit(sabit);
        return ResponseEntity.ok(sabit1);
    }

    @GetMapping("sabitList")
    public List<Sabit> sabitList() {
        return sabitService.getAllSabit();
    }
}
