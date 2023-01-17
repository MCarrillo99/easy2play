package com.easy2play.DTO;

public class TeamDTO {

    private String teamName;

    private double lati;

    private double longi;

    public TeamDTO() {
    }

    public TeamDTO(String teamName) {
        this.teamName = teamName;
    }

    public TeamDTO(String teamName, double lati, double longi) {
        this.teamName = teamName;
        this.lati = lati;
        this.longi = longi;
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
}
