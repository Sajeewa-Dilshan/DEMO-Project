package com.example.demo1.model;

import java.util.List;

public class Customer {
    private String id;
    private String telephone;
    private List<String> favorites;

    public Customer() {
    }

    public Customer(String id, String telephone, List<String> favorites) {
        this.id = id;
        this.telephone = telephone;
        this.favorites = favorites;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<String> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<String> favorites) {
        this.favorites = favorites;
    }

}
