/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoronaApp.Controllers;

import CoronaApp.Services.ServiceCorona;
import CoronaApp.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author diego
 */
@RestController
@RequestMapping(value = "/subastas")
public class coronaAppController {
    @Autowired
    Service serviceCorona;
    
    @GetMapping("/user/item")
    public ResponseEntity<?> getUserItem(@RequestBody String country){
        //JSONObject json = new JSONObject(country);
        //Usuario user = UserService.findById(Long.parseLong(json.getString("user_id")));
        //ItemService.getItembyUser(user, Long.parseLong(json.getString("item_id")));
        //return new ResponseEntity<>(ItemService.getItembyUser(user, Long.parseLong(json.getString("item_id"))) ,HttpStatus.ACCEPTED);
    }
}
