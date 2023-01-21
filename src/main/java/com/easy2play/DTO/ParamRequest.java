package com.easy2play.DTO;

public class ParamRequest {
    private Double raggio;
    private Double latitude;
    private Double longitude;

    public Double getRaggio() {
        return raggio;
    }

    public void setRaggio(Double raggio) {
        this.raggio = raggio;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "ParamRequest{" +
                "raggio=" + raggio +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
