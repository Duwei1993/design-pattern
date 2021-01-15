package dw.pattern.strategy.adventuregame.weapon.weaponimp;

import dw.pattern.strategy.adventuregame.weapon.WeaponBehavior;

public class Knife implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("knife" );
    }

    @Override
    public String toString() {
        return " knife ";
    }
}
