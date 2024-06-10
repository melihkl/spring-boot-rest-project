package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name= "turs")
public class Tur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="tur_id")
    private Long id;

    @Column(name = "tur_ad")
    private String turAd;

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

}

