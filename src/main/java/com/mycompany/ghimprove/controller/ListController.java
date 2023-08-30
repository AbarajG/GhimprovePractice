package com.mycompany.ghimprove.controller;

import java.util.Arrays;

public class ListController {
    
    /**
     * This method make a sorted list and print the values 
     * order by assendent list
     * @param list this parameter is array numbers
     */
    public void orderList(int[] list){
        
        Arrays.sort(list);   
        
        for (int value : list) {
            System.out.println(value);
        }
        
    }

}
