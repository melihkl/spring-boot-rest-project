package com.example.demo.entity;

import com.example.demo.enums.AyEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "sabit")
public class Sabit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tur_id")
    private Long id;

    @Column(name = "tur=ad")
    private String turAd;

    @Enumerated(EnumType.STRING)
    @Column(name = "ay")
    private AyEnum ayEnum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTurAd() {
        return turAd;
    }

    public void setTurAd(String turAd) {
        this.turAd = turAd;
    }

    public AyEnum getAyEnum() {
        return ayEnum;
    }

    public void setAyEnum(AyEnum ayEnum) {
        this.ayEnum = ayEnum;
    }
}
