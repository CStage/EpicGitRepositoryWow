package Test;

public class Insult extends Item{

    public Insult(String name, int price, int age) {
        super(name, price, age);
        this.depreciationRate = 0.1;
    }
    
}
