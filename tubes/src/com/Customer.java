
package com;

public class Customer {
    public String username, nama, email, alamat;
    public long noTelp;
    
    public Customer(String username, String nama, String email, String alamat, long noTelp){
        this.username = username;
        this.nama = nama; 
        this.noTelp = noTelp;
        this.alamat = alamat;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    @Override
    public String toString(){
        return "nama "+ this.nama +" alamat "+ this.alamat;
    }
    
    public void beliProduk(){
        
    }
    
    public void bayarProduk(){
        
    }
    
    public static void main(String[] args) {
        Customer cs1 = new Customer("Fachry", "pari", "faaldhf", "alsdj", 0123456456);
        System.out.println(cs1.toString());
    }
}
    
