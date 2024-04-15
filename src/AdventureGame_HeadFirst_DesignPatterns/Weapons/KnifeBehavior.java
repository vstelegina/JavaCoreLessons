package AdventureGame_HeadFirst_DesignPatterns.Weapons;

public class KnifeBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("<<Тык-тык кинжалом!>>");
    }
}
