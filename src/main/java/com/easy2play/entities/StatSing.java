package com.easy2play.entities;

import javax.persistence.*;

@Entity
@Table
public class StatSing {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStatSing;

    private double randomStat;

    @OneToOne(cascade = CascadeType.ALL)
    private Player player;

    public StatSing() {
    }

    public long getIdStatSing() {
        return idStatSing;
    }

    public void setIdStatSing(long idStatSing) {
        this.idStatSing = idStatSing;
    }

    public double getRandomStat() {
        return randomStat;
    }

    public void setRandomStat(double randomStat) {
        this.randomStat = randomStat;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
