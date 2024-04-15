package DuckLake_HeadFirst_DesignPatterns.Behavior.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Я не могу летать.");
    }
}
