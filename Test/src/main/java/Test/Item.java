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
        setCurrentValue();
    }


    public String getName() {
        return this.name;
    }

    public void setCurrentValue() {
        this.currentValue = Math.pow(this.purchaseAmount * ((1 - this.depreciationRate) / 100), this.age);
    }

    
    public double depreciationAmount() {
        var D = purchaseAmount - currentValue; 
        return D;
    }  


    public double getCurrentValue() {
       return this.currentValue;
    }


}
