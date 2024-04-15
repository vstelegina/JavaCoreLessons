package AdventureGame_HeadFirst_DesignPatterns.Weapons;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("<<Вжух мечом!>>");
    }
}
