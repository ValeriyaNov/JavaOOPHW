package Seminar1;

import java.util.ArrayList;

public class DrinkMachine extends WendingMachine{
    
    public DrinkMachine(ArrayList<Product> productList) {
        super(productList);
        
    }
    public void addDrink(Drink dr){
        productList.add(dr);
    }
    // public Drink returnProduct(String name){
    //     for (Drink el: productList) {
    //         if(el.getName().equals(name)) return el;
    //     }
    //     return null;
    // }
}
