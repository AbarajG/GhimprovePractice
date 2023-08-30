package com.mycompany.ghimprove;

import com.mycompany.ghimprove.controller.ListController;
import com.mycompany.ghimprove.model.NumberList;

public class Ghimprove {

    public static void main(String[] args) {
        NumberList lists = new NumberList();
        
        ListController controller = new ListController();
        System.out.println("---------------------------------");
        System.out.println("List One: ");
        controller.orderList(lists.getValuesListOne());
        System.out.println("---------------------------------");
        System.out.println("List Two: ");
        controller.orderList(lists.getValuesListTwo());
        System.out.println("---------------------------------");
    }
}
