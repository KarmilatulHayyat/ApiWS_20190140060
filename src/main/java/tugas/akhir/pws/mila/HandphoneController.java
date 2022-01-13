/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.akhir.pws.mila;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */
@CrossOrigin
@RestController
@RequestMapping("/handphone")
public class HandphoneController {
    
    @Autowired
    HandphoneService handphoneService;
    
    @GetMapping
    public List<Handphone> getAllHandphones(){
        return handphoneService.getAllHandphone();
    }
    
    
    @PostMapping()
    public Handphone addHandphone(@RequestBody Handphone handphone){
        return handphoneService.addHandphone(handphone);
    }
    
    
     @GetMapping("/{id}")
    public Handphone getHandphoneById(@PathVariable("id") int handphoneId){
        return handphoneService.getHandphoneById(handphoneId);
    }
    
    @PutMapping("/updateHandphone")
    public ResponseEntity<String> updateHandphone(@RequestBody Handphone handphone){
        try{
            handphoneService.updateHandphone(handphone);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteHandphone(@PathVariable int id){
        try{
            handphoneService.deleteHandphone(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }    
}
