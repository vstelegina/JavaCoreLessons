package AdventureGame_HeadFirst_DesignPatterns.Characters;

import AdventureGame_HeadFirst_DesignPatterns.Weapons.WeaponBehavior;

public abstract class Character {
    WeaponBehavior weaponBehavior;
    public abstract void fight();

    public void setWeaponBehavior(WeaponBehavior w) {
        this.weaponBehavior = w;
    }
}
