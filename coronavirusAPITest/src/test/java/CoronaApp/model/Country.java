/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoronaApp.model;

/**
 *
 * @author diego
 */
public class Country {
    
    public boolean error;
    public String statusCode;
    public Data data;

    public Country(boolean error, String statusCode, Data data) {
        this.error = error;
        this.statusCode = statusCode;
        this.data = data;
    }

    public boolean isError() {
        return error;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public Data getData() {
        return data;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    
}
