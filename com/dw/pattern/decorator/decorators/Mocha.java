package dw.pattern.decorator.decorators;

import dw.pattern.decorator.Beverage;
import dw.pattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;
    public static final double PRICE = 0.20;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Mocha";
    }

    @Override
    public double cost() {
        return  PRICE + beverage.cost();
    }

    @Override
    public String getCostInfo() {
        return  beverage.getCostInfo() + "$" + PRICE + "\r\n";
    }
}
