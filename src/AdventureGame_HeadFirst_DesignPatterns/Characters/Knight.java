package AdventureGame_HeadFirst_DesignPatterns.Characters;

import AdventureGame_HeadFirst_DesignPatterns.Weapons.SpireBehavior;

public class Knight extends Character{
    public Knight() {
        weaponBehavior = new SpireBehavior();
    }
    @Override
    public void fight() {
        System.out.println("Рыцарь: за Короля, Королеву и оплачиваемый отпуск! Кавалерия, в атаку!");
        weaponBehavior.useWeapon();
    }
}
