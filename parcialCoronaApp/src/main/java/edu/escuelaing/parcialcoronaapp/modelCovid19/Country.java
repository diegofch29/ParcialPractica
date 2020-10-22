/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.parcialcoronaapp.modelCovid19;

/**
 *
 * @author diego
 */
public class Country {
    
    public boolean error;
    public Long statusCode;
    public String message;
    public Data data;

    public Country(boolean error, Long statusCode,String message, Data data) {
        this.error = error;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public Long getStatusCode() {
        return statusCode;
    }

    public Data getData() {
        return data;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setStatusCode(Long statusCode) {
        this.statusCode = statusCode;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    
}
