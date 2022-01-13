/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.akhir.pws.mila;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author asus
 */
@Entity
@Table(name = "handphone")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Handphone.findAll", query = "SELECT h FROM Handphone h"),
    @NamedQuery(name = "Handphone.findById", query = "SELECT h FROM Handphone h WHERE h.id = :id"),
    @NamedQuery(name = "Handphone.findByNama", query = "SELECT h FROM Handphone h WHERE h.nama = :nama"),
    @NamedQuery(name = "Handphone.findByHarga", query = "SELECT h FROM Handphone h WHERE h.harga = :harga"),
    @NamedQuery(name = "Handphone.findByStok", query = "SELECT h FROM Handphone h WHERE h.stok = :stok")})
public class Handphone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
    @Column(name = "nama")
    private String nama;
    @Column(name = "harga")
    private Integer harga;
    @Column(name = "stok")
    private Integer stok;

    public Handphone() {
    }

    

    public Handphone(Integer id, String nama, Integer harga, Integer stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Handphone)) {
            return false;
        }
        Handphone other = (Handphone) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
//        return "tugas.akhir.pws.mila.Handphone[ id=" + id + " ]";
          return "id = " + getId()+ "Nama = " + getNama() + "harga = " + getHarga() + "stok = " + getStok();
                 
    }
    
}
