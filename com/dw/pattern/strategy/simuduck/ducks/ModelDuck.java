package dw.pattern.strategy.simuduck.ducks;

import dw.pattern.strategy.simuduck.behaviorimp.FlyNoWay;
import dw.pattern.strategy.simuduck.behaviorimp.MuteQuack;
import dw.pattern.strategy.simuduck.behaviorinterface.FlyBehavior;
import dw.pattern.strategy.simuduck.behaviorinterface.QuackBehavior;
import dw.pattern.strategy.simuduck.entity.Duck;

public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("like a ModelDuck");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
}
