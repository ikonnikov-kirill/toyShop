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
public class ToyDept extends Dept {
    private ArrayList<Toy> toyList = new ArrayList<>();
    private final String deptType = "toy";

    public ToyDept() {

    }

    public void addItem(Toy item) {
        toyList.add(item);
        System.out.println("Toy list added " + item.toString());
    }

    @Override
    public String toString() {
        String temp = "";
        for (Toy a : toyList) {
          temp=temp+a.toString();
    }
    return temp;
   }
}


