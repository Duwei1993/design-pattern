package dw.pattern.decorator.beverages;

import dw.pattern.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "HouseBlend";
    }

    public double cost(){
        return 0.89;
    }

    @Override
    public String getCostInfo() {
        return "0.89";
    }
}
