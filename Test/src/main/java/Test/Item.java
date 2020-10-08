package Test;

public class Item {
    protected String name; 
    protected int purchaseAmount;
    protected int age;
    private double currentValue;
    protected double depreciationRate = 0;

    public Item(String name, int purchaseAmount, int age) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
        this.age = age;
        getCurrentValue();

    }

    public String getName() {
        return this.name;
    }

    public void getCurrentValue() {
        this.currentValue = Math.pow(this.purchaseAmount*((1-this.depreciationRate)/100), this.age);
    }

    public void ageOneYear() {
        this.age+=1;
        getCurrentValue();
    }

    
}
