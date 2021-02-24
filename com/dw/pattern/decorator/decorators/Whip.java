package dw.pattern.decorator.decorators;

import dw.pattern.decorator.Beverage;
import dw.pattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;
    public static final double PRICE = 0.30;

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,Whip";
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
