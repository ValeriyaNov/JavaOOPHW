package Seminar1;

import java.util.ArrayList;

public class HotDrinkVedingMachine extends WendingMachine{
    private ArrayList<Product> lst;

    //protected int temperature;
    public HotDrinkVedingMachine(ArrayList<Product> lst) {
        super(lst);
        this.lst = lst;
        //this.temperature = temperature;
    }

    public HotDrink getProduct(String name, int volume, int temperature){
        for (Product product : lst){
        if (product instanceof HotDrink){ 
            HotDrink ht = (HotDrink) product;
            //ht.printHotDrink();
            if (((ht.getName()).equals(name)) && (ht.getVolume() == volume) && (ht.getTemperature() == temperature)){
              return ht;  
            }
        }

    }
        HotDrink ht = new HotDrink("не найден", 0, 0, 0);
        return ht;
    
    }
}
