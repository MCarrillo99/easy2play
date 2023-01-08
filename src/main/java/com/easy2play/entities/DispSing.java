package com.easy2play.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class DispSing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDispSing;

    //TODO si può fare una enum
    private LocalDateTime orario;

    @ManyToOne
    private Player player;

}