package com.example.roger.seedneh;  
public class Elderly { 
    int elderly_id; 
    String name; 
    String gender; 
    int phone_number1; 
    int phone_number2; 
    String address;  

    public int getElderly_id()
    { 
        return elderly_id; 
    }  
    public void setElderly_id(int elderly_id) { 
        this.elderly_id = elderly_id; 
    }  
    public String getName() { 
        return name; 
    }  
    public void setName(String name)
    { 
        this.name = name; 
    }  
    public String getGender()
    { 
        return gender; 
    }  
    public void setGender(String gender) { 
        this.gender = gender; 
    }  
    public int getPhone_number1()
    { 
        return phone_number1; 
    }  
    public void setPhone_number1(int phone_number1)
    { 
        this.phone_number1 = phone_number1; 
    }  
    public int getPhone_number2()
    { 
        return phone_number2; 
    }  
    public void setPhone_number2(int phone_number2)
    {
             this.phone_number2 = phone_number2; 
    }
          public String getAddress()
    {
             return address; 
    }
          public void setAddress(String address)
    {
             this.address = address; 
    }
          public Elderly(int elderly_id, String name, String gender, int phone_number1, int phone_number2, String address)
    {
         this.elderly_id = elderly_id; 
        this.name = name; 
        this.gender = gender; 
        this.phone_number1 = phone_number1; 
        this.phone_number2 = phone_number2; 
        this.address = address; 
    }
     } 
