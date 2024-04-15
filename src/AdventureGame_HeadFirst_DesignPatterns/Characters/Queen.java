package AdventureGame_HeadFirst_DesignPatterns.Characters;

import AdventureGame_HeadFirst_DesignPatterns.Weapons.BowBehavior;

public class Queen extends Character{

    public Queen() {
        weaponBehavior = new BowBehavior();
    }
    @Override
    public void fight() {
        System.out.println("Королева: за мой сломанный ноготь и испорченный вечер!");
        weaponBehavior.useWeapon();
    }
}
