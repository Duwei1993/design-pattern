package dw.pattern.strategy.simuduck.test;

import dw.pattern.strategy.simuduck.behaviorimp.FlyNoWay;
import dw.pattern.strategy.simuduck.behaviorimp.FlyRocketPowed;
import dw.pattern.strategy.simuduck.behaviorimp.FlyWithWings;
import dw.pattern.strategy.simuduck.behaviorimp.Squeak;
import dw.pattern.strategy.simuduck.ducks.MallardDuck;
import dw.pattern.strategy.simuduck.ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.swim();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
        mallardDuck.performFly();
        //ModelDuck
        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowed());
        modelDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyWithWings());
        mallardDuck.performFly();
    }
}
