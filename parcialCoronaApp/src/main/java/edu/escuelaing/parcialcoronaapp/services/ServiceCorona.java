/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Country;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Data;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Stats;
import java.security.Timestamp;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

/**
 *
 * @author diego
 */
@Service
public class ServiceCorona implements ServiceAPI {

    @Override
    public Country getInfo(String request) {
        HttpResponse<JsonNode> response = null;
        String resp = "no se ha encontrado el pais";
        try {
            response = Unirest
                    .get("https://covid-19-coronavirus-statistics.p.rapidapi.com/v1/stats?country="+request)
                    .header("x-rapidapi-host", "covid-19-coronavirus-statistics.p.rapidapi.com")
                    .header("x-rapidapi-key", "bfd439431cmsh0d174b495994382p18d5fejsn7d0c07ea641a")
                    .asJson();
            resp = response.getBody().toString();
            System.out.println(resp);
        } catch (UnirestException ex) {
            Logger.getLogger(ServiceCorona.class.getName()).log(Level.SEVERE, null, ex);
        }
        return toClass(response);
    }
    
    private Country toClass(HttpResponse<JsonNode> countryHttp){
        Country country = null;
        JSONObject countryJson = countryHttp.getBody().getObject();
        JSONObject dataJson = countryJson.getJSONObject("data");
        JSONArray statsJsonArray = dataJson.getJSONArray("covid19Stats");
        boolean continue_ = true;
        int count = 0;
        Data data = new Data(dataJson.getString("lastChecked"));
        while (continue_){
            if (statsJsonArray.isNull(count)){
                continue_=false;
            }
            else{
                JSONObject dataStats = statsJsonArray.getJSONObject(count);
                System.out.println(dataStats.get("city")+" "+count);
                data.addStats(new Stats(dataStats.getString("city"), dataStats.getString("province"), dataStats.getString("country"), dataStats.getString("lastUpdate"), dataStats.getString("keyId"), dataStats.getLong("confirmed"), dataStats.getLong("deaths"), dataStats.getLong("recovered")));
                count+=1;
            }
        }
        country = new Country(countryJson.getBoolean("error"),countryJson.getLong("statusCode") ,countryJson.getString("message"), data);
        return country;
    }
    
}
