package dw.pattern.strategy.adventuregame.weapon.weaponimp;

import dw.pattern.strategy.adventuregame.weapon.WeaponBehavior;

public class Sword implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("ues sword" );
    }

    @Override
    public String toString() {
        return " sword ";
    }
}
