package DuckLake_HeadFirst_DesignPatterns.Behavior.Fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("На взлет!");
    }
}
