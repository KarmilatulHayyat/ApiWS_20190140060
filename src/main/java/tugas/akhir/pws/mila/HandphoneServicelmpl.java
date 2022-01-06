/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.akhir.pws.mila;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author asus
 */
@Service
public class HandphoneServicelmpl extends HandphoneService{
    @Autowire
    private HandphoneRepository repository;
    
    @Override
    public Handphone addHandphone(Handphone handphone) {
        return repository.save(handphone);
    }
    
    public Handphone getHandphoneById(int handphoneId) {
        return repository.findById(handphoneId).get();
    }

    @Override
    public void updateHandphone(Handphone handphone) {
        Handphone handphoneDB = repository.findById(handphone.getId()).orElseThrow();
        repository.save(handphone);
    }
    
    @Override

    public void deleteHandphoneById(int handphoneId) {
        try{
            repository.deleteById(handphoneId);
        }
        catch(Exception e){
            throw new RuntimeException(e.getMessage());
        }
    }
    
    public List<Handphone> getAllHandphoneook() {
        return repository.findAll();
    }   
}
