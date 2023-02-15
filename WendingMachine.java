package Seminar1;

import java.util.ArrayList;

public class WendingMachine {
    
    protected ArrayList<Product> productList;

    public WendingMachine(ArrayList<Product> goods) {
    
        this.productList = goods;
    }



    public void addProduct (Product product){
        productList.add(product);
    }
    public Product returnProduct(String name){
        for (Product el: productList) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (var el: this.productList
             ) {
            System.out.println(el);
        }
    }

}
