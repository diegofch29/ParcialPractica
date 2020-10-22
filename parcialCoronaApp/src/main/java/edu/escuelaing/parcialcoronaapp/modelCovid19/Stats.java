/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.modelCovid19;

import java.security.Timestamp;

/**
 *
 * @author diego
 */
public class Stats {
    public String city;
    public String providence;
    public String country;
    public String lasUpdate;
    public String keyId;
    public Long confirmed;
    public Long deaths;
    public Long recovered;

    public Stats(String city, String providence, String country, String lasUpdate, String keyId, Long confirmed, Long deaths, Long recovered) {
        this.city = city;
        this.providence = providence;
        this.country = country;
        this.lasUpdate = lasUpdate;
        this.keyId = keyId;
        this.confirmed = confirmed;
        this.deaths = deaths;
        this.recovered = recovered;
    }

    public String getCity() {
        return city;
    }

    public String getProvidence() {
        return providence;
    }

    public String getCountry() {
        return country;
    }

    public String getLasUpdate() {
        return lasUpdate;
    }

    public String getKeyId() {
        return keyId;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public Long getDeaths() {
        return deaths;
    }

    public Long getRecovered() {
        return recovered;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setProvidence(String providence) {
        this.providence = providence;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLasUpdate(String lasUpdate) {
        this.lasUpdate = lasUpdate;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }
    
    
}
