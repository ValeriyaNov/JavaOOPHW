package Seminar1;
//import Drink;
//import HotDrink;
import java.util.ArrayList;

public class HotDrinkVedingMachine extends WendingMachine<HotDrink>{


    public HotDrink getProduct (String name, int volume, int temperature){
        for (Product product : goods){
        if (product instanceof HotDrink){ 
            HotDrink ht = (HotDrink) product;

            if (((ht.getName()).equals(name)) && (ht.getVolume() == volume) && (ht.getTemperature() == temperature)){
              return ht;  
            }
        }

    }
        HotDrink ht = new HotDrink("не найден", 0, 0, 0);
        return ht;
    
    }
}
