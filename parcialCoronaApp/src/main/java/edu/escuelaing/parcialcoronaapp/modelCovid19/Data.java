/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.modelCovid19;

import java.security.Timestamp;
import java.util.List;

/**
 *
 * @author diego
 */
public class Data {
    
    public String lastChecked;
    public List<Stats> covid19Stats;
    
    public Data(String lastChecked){
        this.lastChecked = lastChecked;

    }
    
    public Data(String lastChecked, List<Stats> covid19Stats ){
        this.lastChecked = lastChecked;
        this.covid19Stats = covid19Stats;

    }


    public String getLastChecked() {
        return lastChecked;
    }



    public void setLastChecked(String lastChecked) {
        this.lastChecked = lastChecked;
    }
    
    public void addStats(Stats st){
        this.covid19Stats.add(st);
    }

    
}
