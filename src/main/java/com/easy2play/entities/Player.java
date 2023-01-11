package com.easy2play.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "player")//TODO si devono fare tutti i costruttori per bene
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

    @JsonIgnore
    @OneToMany(mappedBy = "player")
    private List<DispSing> dispSingList;

    @ManyToOne
    private TeamBuild teamBuild;

    public Player() {
    }

    public long getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(long idPlayer) {
        this.idPlayer = idPlayer;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumCell() {
        return numCell;
    }

    public void setNumCell(int numCell) {
        this.numCell = numCell;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public StatSing getStats() {
        return stats;
    }

    public void setStats(StatSing stats) {
        this.stats = stats;
    }

    public List<DispSing> getDispSingList() {
        return dispSingList;
    }

    public void setDispSingList(List<DispSing> dispSingList) {
        this.dispSingList = dispSingList;
    }

    public TeamBuild getTeamBuild() {
        return teamBuild;
    }

    public void setTeamBuild(TeamBuild teamBuild) {
        this.teamBuild = teamBuild;
    }
}
