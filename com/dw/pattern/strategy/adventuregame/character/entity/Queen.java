package dw.pattern.strategy.adventuregame.character.entity;

import dw.pattern.strategy.adventuregame.character.Character;
import dw.pattern.strategy.adventuregame.weapon.WeaponBehavior;
import dw.pattern.strategy.adventuregame.weapon.weaponimp.Knife;
import dw.pattern.strategy.adventuregame.weapon.weaponimp.Sword;

public class Queen extends Character {

    public Queen(){
        weapon = new Knife();
    }

    @Override
    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Queen";
    }
}
