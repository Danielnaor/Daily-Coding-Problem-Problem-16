/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.Daily_Coding_Problem_Problem16;

import java.util.ArrayList;

/**
 *
 * @author carmitnaor
 */
public class Daily_Coding_Problem_Problem16 {
    // in this case n = 5
    private             int[]   log_Of_order_ids;
    private             int     index;

    
    public Daily_Coding_Problem_Problem16(int n){
        log_Of_order_ids = new int[n];
        index = 0;
    }
    
    
    public static void main(String[] args) {
        
        Daily_Coding_Problem_Problem16 Log = new Daily_Coding_Problem_Problem16(5);
        Log.record(1001);
        Log.record(1002);
        Log.record(1003);
        Log.record(1004);
        Log.record(1005);

        System.out.println(Log.get_last(1)); // should print 1005
        System.out.println(Log.get_last(3)); // should print 1003

        

        System.out.println(Log.get_last(1)); // should print 1007
        System.out.println(Log.get_last(5)); // should print 1003
        
        
        
        
        
    }
    
    
    
    public void record(int order_id){
        log_Of_order_ids[index] = order_id;
        index++;
    }
    
    
    public int get_last(int i){
        return log_Of_order_ids[log_Of_order_ids.length-i];
    }
}
