package dw.pattern.strategy.adventuregame.test;

import dw.pattern.strategy.adventuregame.character.Character;
import dw.pattern.strategy.adventuregame.character.entity.Knight;
import dw.pattern.strategy.adventuregame.character.entity.Queen;
import dw.pattern.strategy.adventuregame.weapon.weaponimp.Knife;

public class MiniGame {
    public static void main(String[] args) {
        Character knight = new Knight();
        Character queen = new Queen();

        knight.fight();
        queen.fight();
        knight.setWeapon(new Knife());
        knight.weapon.useWeapon();
    }
}
