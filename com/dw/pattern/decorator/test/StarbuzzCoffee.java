package dw.pattern.decorator.test;

import dw.pattern.decorator.Beverage;
import dw.pattern.decorator.beverages.Espresso;
import dw.pattern.decorator.decorators.Mocha;
import dw.pattern.decorator.decorators.Soy;
import dw.pattern.decorator.decorators.Whip;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        //System.out.println(beverage.getDescription() + "  $" + beverage.cost());

        beverage = new Mocha(beverage);
        beverage = new Soy(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.getDescription() + "  $" + beverage.cost());
        System.out.println(beverage.getCostInfo());

    }
}