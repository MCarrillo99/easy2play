package com.easy2play.entities;

import javax.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table
public class DispSing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idDispSing;

    //TODO si può fare una enum
    private LocalDateTime orario;

    @ManyToOne
    private Player player;

    public DispSing() {
    }

    public long getIdDispSing() {
        return idDispSing;
    }

    public void setIdDispSing(long idDispSing) {
        this.idDispSing = idDispSing;
    }

    public LocalDateTime getOrario() {
        return orario;
    }

    public void setOrario(LocalDateTime orario) {
        this.orario = orario;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}