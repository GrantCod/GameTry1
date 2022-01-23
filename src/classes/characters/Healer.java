package classes.characters;

import classes.CharacterClass;
import classes.characters.AttackType;

public class Healer extends CharacterClass {
    public Healer(String name) {
        this.setLevel(1);
        this.setMaxHealthPoints(60);
        this.setMaxManaPoints(150);
        this.setHealthPoints(60);
        this.setManaPoints(150);
        this.setName(name);
        this.setAttackType(AttackType.PHYSICAL_RANGED);
        this.setAttackAmount(2);
    }
}
