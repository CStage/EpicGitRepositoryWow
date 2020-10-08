package Test;

public class BottleCap extends Item{

    public BottleCap(String name, int price, int age) {
        super(name, price, age);
        this.depreciationRate = 0.6;
    }

    
}