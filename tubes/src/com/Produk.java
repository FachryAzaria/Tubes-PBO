
package com;

public class Produk {
    public String nama_produk;
    public int harga_produk;
    
    public Produk(String nama_produk, int harga_produk){
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
    }

    public String getNama_produk() {
        return nama_produk;
    }

    public void setNama_produk(String nama_produk) {
        this.nama_produk = nama_produk;
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

   
    
    
}
