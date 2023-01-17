package com.easy2play.entities;

import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.web.JsonPath;


import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTeam;

    private String teamName;

    private double lati;

    private double longi;


    @JsonIgnore
    @OneToMany(mappedBy = "team")
    private List<Player> players;

    public Team() {
    }

    public Team(long idTeam, String teamName) {
        this.idTeam = idTeam;
        this.teamName = teamName;
    }

    public Team(String teamName) {
        this.teamName = teamName;
    }

    public long getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(long idTeam) {
        this.idTeam = idTeam;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public double getLati() {
        return lati;
    }

    public void setLati(double lati) {
        this.lati = lati;
    }

    public double getLongi() {
        return longi;
    }

    public void setLongi(double longi) {
        this.longi = longi;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
