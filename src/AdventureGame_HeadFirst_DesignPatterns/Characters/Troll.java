package AdventureGame_HeadFirst_DesignPatterns.Characters;

import AdventureGame_HeadFirst_DesignPatterns.Weapons.KnifeBehavior;

public class Troll extends Character{

    public Troll() {
        weaponBehavior = new KnifeBehavior();
    }
    @Override
    public void fight() {
        System.out.println("Тролль: я есть тролль, ГРАААА!");
        System.out.println("Тролль: за тридцать серебрянников! И обещание Темного Властелина!");
        weaponBehavior.useWeapon();
    }
}
