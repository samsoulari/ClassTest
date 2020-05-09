package com.company;

public class Person {
    private String fistName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName){
        this.fistName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getFistName(){
        return this.fistName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        if(this.age < 0 || this.age > 100){
            return 0;
        }else return this.age;
    }
    public String getFullName(){
        if(this.fistName.isEmpty() && this.lastName.isEmpty()) return "";
        if(this.fistName.isEmpty()) return this.lastName;
        if(this.lastName.isEmpty()) return this.fistName;
        return this.fistName + " " + this.lastName;
    }

    public boolean isTeen(){
        if(age < 20 && age > 12){
            return true;
        }else return false;
    }
}
