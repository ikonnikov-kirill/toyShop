/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyShop;

/**
 *
 * @author workway
 */
public class Item {
    
    public Integer price;
    public String maker;

    
    public Item (Integer price1, String maker1) {
        this.price = price1;
        this.maker=maker1;
     }
    
    public Integer getPrice () {
        return price;
    }

    public String getMaker () {
        return maker;
    }

      @Override
    public String toString () {
        return " Maker "+getMaker()+", Price "+getPrice()+" dollars ";
    }
}
