/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package canteenmanagementsystem;

/**
 *
 * @author Selva
 */
public class Order {
    public String n;
    public int q;
    //public String q;
    public double d;
    
    public Order(String na,int qu,double p)
    {
        n=na;
        q=qu;
        d=p;
    }
    
    public void setP(double p)
    {
        d=p;
    }
    
    public void setQ(int qt)
    {
        q=qt;
    }
    
    public void setName(String na)
    {
        n=na;
    }
    public String getName()
    {
        return n;
    }
    
    public int getQ()
    {
        return q;
    }
    
    public double getP()
    {
        return d;
    }
}
