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
public class AdminInfo {
    String username,password;
    
    public static HashMap<String,String> mp = new HashMap<>();
    public static ArrayList<AdminInfo> Admin_array = new ArrayList<>();

    public AdminInfo(String username, String password) {
        Admin_array.add(new AdminInfo());
        this.username = username;
        this.password = password;
        mp.put(username, password);
    }

    public AdminInfo() {
        
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
    
    
}
