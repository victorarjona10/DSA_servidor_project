package edu.upc.dsa.models;

import io.swagger.models.auth.In;

public class partida {
    Integer idPartida;
    String idUser;
    Integer puntos;
    Integer dinero;
    String posEnemigos;
    String posUser;

    public partida(Integer idPartida, String idUser, Integer puntos, Integer dinero, String posEnemigos, String posUser) {
        this.idPartida = idPartida;
        this.idUser = idUser;
        this.puntos = puntos;
        this.dinero = dinero;
        this.posEnemigos = posEnemigos;
        this.posUser = posUser;
    }

    public Integer getIdPartida() {
        return idPartida;
    }

    public void setIdPartida(Integer idPartida) {
        this.idPartida = idPartida;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public Integer getDinero() {
        return dinero;
    }

    public void setDinero(Integer dinero) {
        this.dinero = dinero;
    }

    public String getPosEnemigos() {
        return posEnemigos;
    }

    public void setPosEnemigos(String posEnemigos) {
        this.posEnemigos = posEnemigos;
    }

    public String getPosUser() {
        return posUser;
    }

    public void setPosUser(String posUser) {
        this.posUser = posUser;
    }
}
