package edu.upc.dsa.models;

import edu.upc.dsa.models.Products;
import edu.upc.dsa.util.RandomUtils;

import java.util.LinkedList;
import java.util.List;

public class User {
    String id;
    String email;
    String username;
    String password;
    Integer dinero = 20;
    Integer puntos = 0;
    String actSkinUser = "default";
    String actSkinWeapon = "default";


    public User(String email, String username, String password, Integer puntos, String actSkinUser, String actSkinWeapon) {
        this();
        this.email = email;
        this.username = username;
        this.password = password;
        if (id != null) this.setId(id);
        this.puntos = puntos;
        this.actSkinUser = actSkinUser;
        this.actSkinWeapon = actSkinWeapon;
    }


    public User(String email, String username, String password) {
        this();
        this.email = email;
        this.username = username;
        this.password = password;
        if (id != null) this.setId(id);
    }


    public User() {
        this.setId(RandomUtils.getId());
    }

    public String getDatos(){
        return "User [id="+id+", email=" + email + ", username=" + username +
                ", password="+ password + ", dinero=" + dinero +"puntos="+puntos + "actSkinUser="+actSkinUser + "actSkinWeapon="+actSkinWeapon+"]";
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getId(){
        return id;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public Integer getDinero(){
        return this.dinero;
    }
    public String getEmail(){
        return email;
    }
    public void setDinero(Integer dinero){
        this.dinero = dinero;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public void setActSkinUser(String actSkinUser) {
        this.actSkinUser = actSkinUser;
    }

    public void setActSkinWeapon(String actSkinWeapon) {
        this.actSkinWeapon = actSkinWeapon;
    }

    public String getActSkinUser() {
        return actSkinUser;
    }

    public String getActSkinWeapon() {
        return actSkinWeapon;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

}

