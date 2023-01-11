package com.easy2play.entities;

import javax.persistence.*;

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

    public DispTeam() {
    }

    public long getIdDispTeam() {
        return idDispTeam;
    }

    public void setIdDispTeam(long idDispTeam) {
        this.idDispTeam = idDispTeam;
    }

    public LocalDateTime getOrario() {
        return orario;
    }

    public void setOrario(LocalDateTime orario) {
        this.orario = orario;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
