package com.easy2play.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class DispTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDispTeam;

    //TODO si può fare una enum
    private LocalDateTime orario;

    @ManyToOne
    private Team team;

}
