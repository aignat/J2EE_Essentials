package controller;

import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
@Named
public class User {

    String name;
    String password;

    public User() {
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void register() {
        System.out.println(this.name + " " + this.password + " a fost inregistrat.");
    }

}
