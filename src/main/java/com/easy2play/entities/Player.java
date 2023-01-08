package com.easy2play.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPlayer;

    private String nome;

    private String cognome;

    private String email;

    private int numCell;

    @ManyToOne
    //@JoinColumn(name = "team",referencedColumnName = "id_team")
    private Team team;

    @OneToOne
    //@JoinColumn(name = "stats",referencedColumnName = "id_stat_sing")
    private StatSing stats;

    //@OneToMany
    //private List<DispSing> dispSingList;


}
