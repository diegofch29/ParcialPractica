/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.controllers;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Country;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Data;
import edu.escuelaing.parcialcoronaapp.services.ServiceCorona;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping(value = "/coronaApp")
public class CoronaAppController {
    @Autowired
    private ServiceCorona serviceCorona;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getUserItem(@RequestBody String user_id ){
        //System.out.println(user_id);
        Country data = serviceCorona.getInfo("Canada");
        //JSONObject json = new JSONObject(data);
        //Data c = (Data) json.get("data");
        //System.out.println(json);
        System.out.println("--------------------------------------------------------------------------------"
                + "---------------------------------------------------------------------------"
                + "------------------------------------------------------------------");
        //System.out.println(json.toString());
        return new ResponseEntity<>(data ,HttpStatus.ACCEPTED);
    }
    
    public Country getcountry(@RequestBody Country country){
        return country;
    }
}
