package com.easy2play.entities;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class TeamBuild {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTeamBuild;

    private String teamName;

    //@OneToMany
    //private List<Player> players;

}
