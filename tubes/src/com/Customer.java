
package com;

public class Customer {
    public String nama, username, firstname, lastname, password;
    
    
    public Customer(String firstname, String lastname, String username, String password){
        this.firstname = firstname;
        this.lastname = lastname; 
        this.username = username;
        this.password = password;
        this.nama = this.firstname + this.lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
        return "nama "+ this.nama;
    }
   
}
    
