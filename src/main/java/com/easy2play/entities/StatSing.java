package com.easy2play.entities;

import jakarta.persistence.*;

@Entity
@Table
public class StatSing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStatSing;

    private double randomStat;

    @OneToOne
    //@Column(name = "idPlayer")
    private Player player;

}
