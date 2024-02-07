/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;


/**
 *
 * @author Selva
 */
public class OrderplacedInfo {
    String name,payment_status,Orderinfo;
    int orderid;
    double total;
    Boolean served;
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    public OrderplacedInfo(){
        
    }
    
    public OrderplacedInfo(String n,String paysts,String Ordinfo,int id,double tot){
        payment_status = paysts;
        name = n;
        Orderinfo = Ordinfo;
        orderid = id;
        total = tot;
        served = false;
    }

    public Boolean getServed() {
        return served;
    }

    public void setServed(Boolean served) {
        this.served = served;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public String getOrderinfo() {
        return Orderinfo;
    }

    public void setOrderinfo(String Orderinfo) {
        this.Orderinfo = Orderinfo;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }
    
}
