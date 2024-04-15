package AdventureGame_HeadFirst_DesignPatterns.Characters;

import AdventureGame_HeadFirst_DesignPatterns.Weapons.SwordBehavior;
import AdventureGame_HeadFirst_DesignPatterns.Weapons.WeaponBehavior;

public class King extends Character{

    public King() {
        weaponBehavior = new SwordBehavior();
    }
    @Override
    public void fight() {
        System.out.println("Король: за мое ущемленное эго и простреленное в молодости колено! Получай!");
        weaponBehavior.useWeapon();
    }
}
