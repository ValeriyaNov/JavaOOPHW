package Seminar1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Product> goods = new ArrayList<>();

        HotDrink hotChocolateE = new HotDrink("Hot chocolate Elza", 525, 350, 75);
        HotDrink hotChocolateM = new HotDrink("chocolate", 315, 250, 79);
        HotDrink teaBlackBasilur = new HotDrink("tea", 420, 750, 82);
        HotDrink caffeKimboCrema = new HotDrink("capuchino", 320, 250, 65);
        
        goods.add(hotChocolateE);
        goods.add(hotChocolateM);
        goods.add(teaBlackBasilur);
        goods.add(caffeKimboCrema);

        HotDrinkVedingMachine firstmachine = new HotDrinkVedingMachine(goods);
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите наименование напитка, объем и температуру через запятую без пробелов");
        String lstt = sc.next();
        
            String[] strr = lstt.split(",");
       
            String nameHotDrink = strr[0]; 
            int volumeHotDrink = Integer.parseInt(strr[1]);
            int temperatureHotDrink = Integer.parseInt(strr[2]);

       
        HotDrink wishHotDrink = (HotDrink) firstmachine.getProduct(nameHotDrink, volumeHotDrink, temperatureHotDrink);
        
        System.out.println(wishHotDrink.printHotDrink());
        sc.close();
            
    
}

    

   
}
