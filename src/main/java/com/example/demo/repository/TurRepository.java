package com.example.demo.repository;

import com.example.demo.entity.Tur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurRepository extends JpaRepository <Tur, Long> {
}
