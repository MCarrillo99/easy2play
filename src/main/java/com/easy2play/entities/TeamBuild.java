package com.easy2play.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.List;

@Entity
@Table
public class TeamBuild {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idTeamBuild;

    private String teamName;

    private double lati;

    private double longi;

    private Integer otherPlayers;

    @JsonIgnore
    @OneToMany(mappedBy = "teamBuild")
    private List<Player> players;

    public TeamBuild() {
    }

    public TeamBuild(long idTeamBuild, String teamName) {
        this.idTeamBuild = idTeamBuild;
        this.teamName = teamName;
    }

    /*
    public Integer getTotalPlayers(){
        if(players != null) {
            return otherPlayers + players.size();
        }
        return otherPlayers;
    } */

    public TeamBuild(String teamName) {
        this.teamName = teamName;
    }

    public long getIdTeamBuild() {
        return idTeamBuild;
    }

    public void setIdTeamBuild(long idTeamBuild) {
        this.idTeamBuild = idTeamBuild;
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
