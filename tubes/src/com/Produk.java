
package com;

import javax.swing.Icon;

public class Produk {
    
    private String nama_produk;
    private String deskripsi_produk;
    private int harga_produk;
    private Icon image;
    public String getNama_produk;
    public String getStrHarga_produk;
    
    public Produk(){   
    }
    
    public Produk(String nama_produk,  int harga_produk){
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;  
    }
    
    public Produk(String nama_produk,  int harga_produk, String deskripsi_produk){
        this.nama_produk = nama_produk;
        this.deskripsi_produk = deskripsi_produk;
        this.harga_produk = harga_produk;  
    }
    
    public Produk(String nama_produk,  int harga_produk, String deskripsi_produk, Icon image){
        this.nama_produk = nama_produk;
        this.deskripsi_produk = deskripsi_produk;
        this.harga_produk = harga_produk;
        this.image = image;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
    }
    
    public String getDeskripsi_produk(){
        return deskripsi_produk;
    }
    
    public void setDeskripsi_produk(String deskripsi_produk){
        this.deskripsi_produk = deskripsi_produk;
    }
    
    public int getHarga_produk(){
        return harga_produk;
    }
    
    public String getStrHarga_produk() {
        return String.valueOf(harga_produk);
    }
    
    public void setHarga_produk(int harga_produk) {
        this.harga_produk = harga_produk;
    }
    
    public Icon getImage(){
        return image;
    }
    
    public void setImage(Icon image){
        this.image = image;
    }

    
    
    
}
