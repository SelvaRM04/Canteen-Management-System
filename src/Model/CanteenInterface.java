/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import canteenmanagementsystem.AdminInfo;
import canteenmanagementsystem.CustomerInfo;
import canteenmanagementsystem.ItemInfo;

/**
 *
 * @author Selva
 */
public class CanteenInterface {
    
    public static Login cl1;
    public static AdminLogin al1;
    public static Payment cp;
    public static Boolean opov=false;
    public static Boolean apov=false;
    public  static BG b;
    public static void main(String args[])
    {
        b = new BG();
        b.setVisible(true);
        AdminInfo ai = new AdminInfo("Admin","admin");
        AdminInfo.Admin_array.add(ai);
        CustomerInfo ci = new CustomerInfo("User","user","user@gmail.com",100);
        CustomerInfo.cus_array.add(ci);
        ItemInfo in1 = new ItemInfo("Pongal",15.75,25);
        ItemInfo.item_array.add(in1);
        ItemInfo in2 = new ItemInfo("Dosa",30,20);
        ItemInfo.item_array.add(in2);
        ItemInfo in3 = new ItemInfo("Upma",20,15);
        ItemInfo.item_array.add(in3);
        ItemInfo in4 = new ItemInfo("Idli",20,0);
        ItemInfo.item_array.add(in4);
        cl1=new Login();
        cl1.setVisible(true);
        al1=new AdminLogin();
        al1.setVisible(true);
    }
}
