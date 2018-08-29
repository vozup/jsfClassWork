package com.example.demo;

import javax.faces.annotation.ManagedProperty;
import javax.inject.Named;

@Named
public class Person {
    private int count;
    private String fName = "Serega";
    private String lName = "Vozup";

    private String login;
    private String password;

    private int age = 10;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getCount() {
        return count++;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String checkPassword(){
        if(login.equals("serega") && password.equals("1234")){
            return "goToProfile";
        }
        else return "goToInvalidPassword";
    }
}
