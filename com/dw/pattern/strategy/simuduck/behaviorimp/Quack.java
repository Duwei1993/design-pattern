package dw.pattern.strategy.simuduck.behaviorimp;

import dw.pattern.strategy.simuduck.behaviorinterface.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Quack>>");
    }
}
