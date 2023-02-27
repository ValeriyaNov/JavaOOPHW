package Seminar1;

public class HotDrink extends Drink{
    protected int temperature;

    public HotDrink(String  name, int price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    public void consume(){
        System.out.println("Горячий напиток выпит");
    }

    public String printHotDrink(){
        return String.format("Наименование напитка: %s,  Цена: %s руб,  Объем: %s мм,  Температура: %s С",
                getName(), getPrice(), getVolume(), getTemperature());

    }
    public int getTemperature() {
        return this.temperature;
    
}
}
