package dw.pattern.strategy.adventuregame.character.entity;

import dw.pattern.strategy.adventuregame.character.Character;
import dw.pattern.strategy.adventuregame.weapon.WeaponBehavior;
import dw.pattern.strategy.adventuregame.weapon.weaponimp.Sword;

public class Knight extends Character {

    public Knight(){
        weapon = new Sword();
    }

    @Override
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Knight";
    }
}
