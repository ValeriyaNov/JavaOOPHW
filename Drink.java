package Seminar1;

public class Drink extends Product{
    protected int volume;
    Drink(java.lang.String name, int price) {
        super(name, price);
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }

    public void consume(){
        System.out.println();
        System.out.println("Напиток выпит");
    }

    private class String {
    }
}
