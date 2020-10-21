/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoronaApp.Services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Service;

/**
 *
 * @author diego
 */
@Service
public class ServiceCorona implements ServiceAPI {

    @Override
    public String getInfo(String request) {
        HttpResponse<JsonNode> response;
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
        return resp;
    }
    
}
