package dw.pattern.strategy.simuduck.behaviorimp;

import dw.pattern.strategy.simuduck.behaviorinterface.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly o(╥﹏╥)o");
    }
}
