/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyShop;

import java.util.ArrayList;

/**
 * @author workway
 */
public class JewelryDept extends Dept {
    private ArrayList<Jewelry> jewelryList = new ArrayList<>();

    public JewelryDept() {

    }

     public void addItem(Jewelry item) {
        jewelryList.add(item);
         System.out.println("Jewelry list added " + jewelryList);
    }

    @Override
    public String toString() {
        String temp = "";
        for (Jewelry a : jewelryList) {
            temp=temp+a.toString();
        }
        return temp;
    }
}

