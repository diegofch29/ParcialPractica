/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp;

//import org.springframework.boot.SpringApplication;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;



/**
 *
 * @author diego
 */
@SpringBootApplication
@ComponentScan(basePackages = {"edu.escuelaing.parcialcoronaapp"})
public class CoronaApp {
    
    public static void main(String[] args) throws UnirestException {
        SpringApplication.run(CoronaApp.class, args);
        
    }
    
}
