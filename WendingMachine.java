package Seminar1;

import java.util.ArrayList;

public class WendingMachine <T extends Product> {
    
    protected ArrayList<T> goods;


    public void addProduct (T product){
        goods.add(product);
    }
    public Product returnProduct(String name){
        for (Product el: goods) {
            if(el.getName().equals(name)) return el;
        }
        return null;
    }
    public void printProducts(){
        for (var el: this.goods
             ) {
            System.out.println(el);
        }
    }

    public void setGoods(ArrayList<T> goods) {
        this.goods = goods;
    }
}
