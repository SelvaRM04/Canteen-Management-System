/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package canteenmanagementsystem;

import java.util.ArrayList;
import java.util.Queue;

/**
 *
 * @author Ragul S
 */
public class OrderInfo {
    public static int order_id = 30400;
    
    public static Queue<OrderplacedInfo> queue;
    
    public static ArrayList<OrderplacedInfo> oa=new ArrayList<>();
    
    public static void add_order(OrderplacedInfo c){
        //c.orderid = order_id;
        //queue.add(c);
        oa.add(c);
        order_id++;
    }
    
    public void served(OrderplacedInfo c){
        queue.remove(c);
    }
}
