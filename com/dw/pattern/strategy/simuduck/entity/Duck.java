package dw.pattern.strategy.simuduck.entity;

import dw.pattern.strategy.simuduck.behaviorinterface.FlyBehavior;
import dw.pattern.strategy.simuduck.behaviorinterface.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;

    public Duck(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("duck swimming!");
    }
}
