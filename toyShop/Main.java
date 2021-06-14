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
public class Main {
    public static void main(String[] args) {
        Store firstStore = new Store();
        
      Milk oneMilk = new Milk(2,"Sverdlovskoe Milk");
      Ring oneRing = new Ring(10, "Tiffany Ring");
      Toy oneToy = new Barby(3,"Barby doll");
      Toy twoToy = new Gun(8,"Water pistol");

      firstStore.addItem(oneMilk);
      firstStore.addItem(oneRing);
      firstStore.addItem(oneToy);
      firstStore.addItem(twoToy);
      System.out.println(firstStore);
      }
}
