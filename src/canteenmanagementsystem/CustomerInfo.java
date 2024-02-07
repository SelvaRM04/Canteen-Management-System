/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;

import java.util.*;
/**
 *
 * @author Ragul S
 */
public class CustomerInfo {
    String username,password,/*Orderdetails,*/email;
    public double bal_amount;
    //int orderid;
    
    public static ArrayList<Order> order = new ArrayList<>();
    public static ArrayList<CustomerInfo> cus_array= new ArrayList<>();
    public static HashMap<String,String> mp = new HashMap<>();
    public static HashMap<String,CustomerInfo> ub = new HashMap<>();

    public CustomerInfo()
    {
        
    }
    
    public CustomerInfo(String username, String password, String email, double bal_amount) {
        cus_array.add(new CustomerInfo());
        this.username = username;
        this.password = password;
        this.email = email;
        this.bal_amount = bal_amount;
        mp.put(username,password);
        CustomerInfo put = ub.put(username,this);
        //Orderdetails = "";
        //orderid = 0;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
            
    
    public void add(CustomerInfo c){
        
        cus_array.add(c);
    }
    
    public void detectAmount(double orderamt){
        bal_amount -= orderamt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBal_amount() {
        return bal_amount;
    }

    public void setBal_amount(double bal_amount) {
        this.bal_amount = bal_amount;
    }

   // public String getOrderdetails() {
       // return Orderdetails;
    //}

    public void setOrderdetails(String Orderdetails) {
        //this.Orderdetails = Orderdetails;
    }
    
    @Override
    public String toString() {
        return "CustomerInfo{" + "username=" + username + ", bal_amount=" + bal_amount + '}';
    }
    
    
    
}
