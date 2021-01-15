package dw.pattern.strategy.simuduck.behaviorimp;

import dw.pattern.strategy.simuduck.behaviorinterface.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
