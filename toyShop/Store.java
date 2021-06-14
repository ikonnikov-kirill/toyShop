/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toyShop;

/**
 * @author workway
 */
public class Store {
    private ToyDept one = new ToyDept();
    private GroceryDept two = new GroceryDept();
    private JewelryDept three = new JewelryDept();
    private Dispatcher sorter = new Dispatcher();

    public Store() {

    }

    public void addItem(Item item1) {
        sorter.moveToDept(item1);

    }

    @Override
    public String toString (){
      return one.toString()+two.toString()+three.toString();
    }

    public class Dispatcher {

        public Dispatcher() {

        }

        public void moveToDept(Item item1) {

            if (item1 instanceof Toy) {
                one.addItem((Toy) item1);
            }

            if (item1 instanceof Grocery) {
                two.addItem((Grocery) item1);
            }
            if (item1 instanceof Jewelry) {
                three.addItem((Jewelry) item1);
            }else {
            }
        }
    }
}
