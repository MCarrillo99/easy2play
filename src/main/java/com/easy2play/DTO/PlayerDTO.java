package com.easy2play.DTO;

public class PlayerDTO {

    private String nome;

    private String cognome;

    private String email;

    private int numCell;

    public PlayerDTO() {
    }

    public PlayerDTO(String nome, String cognome, String email, int numCell) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.numCell = numCell;
    }
}
