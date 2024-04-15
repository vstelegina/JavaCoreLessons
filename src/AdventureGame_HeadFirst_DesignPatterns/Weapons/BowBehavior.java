package AdventureGame_HeadFirst_DesignPatterns.Weapons;

public class BowBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("<<Пиу-пиу из лука!>>");
    }
}
