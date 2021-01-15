package dw.pattern.strategy.simuduck.ducks;

import dw.pattern.strategy.simuduck.behaviorimp.FlyWithWings;
import dw.pattern.strategy.simuduck.behaviorimp.Quack;
import dw.pattern.strategy.simuduck.behaviorinterface.FlyBehavior;
import dw.pattern.strategy.simuduck.behaviorinterface.QuackBehavior;
import dw.pattern.strategy.simuduck.entity.Duck;

public class MallardDuck extends Duck {

    public  MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("like a mallardDuck");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
