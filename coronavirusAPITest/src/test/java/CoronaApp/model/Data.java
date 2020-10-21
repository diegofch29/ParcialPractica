/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoronaApp.model;

import java.security.Timestamp;

/**
 *
 * @author diego
 */
public class Data {
    public Long recovered;
    public Long deaths;
    public Long confirmed;
    public Timestamp lastChecked;
    public Timestamp lastReported;
    public String location;
    
    public Data(Long recovered, Long deaths, Long confirmed, Timestamp lastChecked ,Timestamp lastReported, String location ){
        this.recovered = recovered;
        this.deaths = deaths;
        this.confirmed = confirmed;
        this.lastChecked = lastChecked;
        this.lastReported = lastReported;
        this.location = location;
    }

    public Long getRecovered() {
        return recovered;
    }

    public Long getDeaths() {
        return deaths;
    }

    public Long getConfirmed() {
        return confirmed;
    }

    public Timestamp getLastChecked() {
        return lastChecked;
    }

    public Timestamp getLastReported() {
        return lastReported;
    }

    public String getLocation() {
        return location;
    }

    public void setRecovered(Long recovered) {
        this.recovered = recovered;
    }

    public void setDeaths(Long deaths) {
        this.deaths = deaths;
    }

    public void setConfirmed(Long confirmed) {
        this.confirmed = confirmed;
    }

    public void setLastChecked(Timestamp lastChecked) {
        this.lastChecked = lastChecked;
    }

    public void setLastReported(Timestamp lastReported) {
        this.lastReported = lastReported;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
