package dw.pattern.strategy.simuduck.behaviorimp;

import dw.pattern.strategy.simuduck.behaviorinterface.FlyBehavior;

public class FlyRocketPowed implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
