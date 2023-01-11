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

    @JsonIgnore
    @OneToMany(mappedBy = "teamBuild")
    private List<Player> players;

    public TeamBuild() {
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

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
