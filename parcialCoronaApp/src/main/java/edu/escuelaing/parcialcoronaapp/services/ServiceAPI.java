/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.services;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import edu.escuelaing.parcialcoronaapp.modelCovid19.Country;
import org.springframework.stereotype.Service;

/**
 *
 * @author diego
 */
@Service
public interface ServiceAPI {
    public Country getInfo(String request);
}
