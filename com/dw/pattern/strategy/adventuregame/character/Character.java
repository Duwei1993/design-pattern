package dw.pattern.strategy.adventuregame.character;

import dw.pattern.strategy.adventuregame.weapon.WeaponBehavior;

public abstract class Character {
    public WeaponBehavior weapon;

    public void fight(){
        System.out.println(this + "  is fighting  with" + weapon + "!");
    }

    public WeaponBehavior getWeapon() {
        return weapon;
    }

    public abstract void setWeapon(WeaponBehavior weapon);
}
