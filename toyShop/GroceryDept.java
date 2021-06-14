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

public class GroceryDept extends Dept {
    private ArrayList<Grocery> groceryList = new ArrayList<>();

    public GroceryDept() {

    }
    @Override
    public String toString() {
        String temp = "";
        for (Grocery a : groceryList) {
            temp=temp+a.toString();
        }
        return temp;
    }

    public void addItem(Grocery item) {
        groceryList.add(item);
        System.out.println("Grocery list added " + groceryList);
    }
    public void getInfo () {
        for (Grocery a : groceryList){
            System.out.println(a.toString());
        }
    }

}
