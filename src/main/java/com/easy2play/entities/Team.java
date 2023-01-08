package com.easy2play.entities;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import jakarta.persistence.*;
import org.springframework.data.web.JsonPath;

import java.util.List;

@Entity
@Table
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTeam;

    private String teamName;

    //@OneToMany
    //private List<Player> players;


}
