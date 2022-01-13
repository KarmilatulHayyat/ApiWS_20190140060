/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.akhir.pws.mila;

import java.util.List;

/**
 *
 * @author asus
 */
public interface HandphoneService {

    List<Handphone> getAllHandphone();
    Handphone addHandphone(Handphone handphone);
    Handphone getHandphoneById(int handphoneId);
    void updateHandphone(Handphone handphone);
    void deleteHandphone(int handphoneId);
 }
