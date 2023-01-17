package com.easy2play.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Partita {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idPartita;

    private double posizione;
    
}
