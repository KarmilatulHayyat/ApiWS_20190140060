/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.akhir.pws.mila;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author asus
 */

@RestController
@RequestMapping("/handphone")
public class DatabaseController {
    
    @Autowired
    HandphoneService HandphoneService;
    
    @GetMapping
    public List<Handphone> getAllHandphones(){
        return HandphoneService.getAllHandphone();
    }
    
    @PostMapping
    @ResponseStatus
    public Handphone addHandphone(@RequestBody Handphone Handphone){
        return HandphoneService.addHandphone(Handphone);
    }
    
    @GetMapping("/{id}")
    public Handphone getHandphoneById(@PathVariable("id") int HandphoneId){
        return HandphoneService.getBookById(HandphoneId);
    }
    
    @PutMapping("/updateHandphone")
    public ResponseEntity<String> updateHandphone(@RequestBody Handphone Handphone){
        try{
            HandphoneService.updateHandphone(Handphone);
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
            HandphoneService.deleteHandphoneById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}