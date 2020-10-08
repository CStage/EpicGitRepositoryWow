package Test;

public class Item {
    protected String name; 
    protected int purchaseAmount;
    protected int age;
    protected int currentValue;
    protected int depreciationRate = 0;

    public Item(String name, int purchaseAmount, int age) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
        this.age = age;
         
    }

    public String getName() {
        return this.name;
    }

    
}
