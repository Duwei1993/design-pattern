package dw.pattern.decorator.beverages;

import dw.pattern.decorator.Beverage;

public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    public double cost(){
        return 2.00;
    }
    public String getCostInfo() {
        return "$2.00" + "\r\n";
    }
}
