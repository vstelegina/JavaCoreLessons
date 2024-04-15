package DuckLake_HeadFirst_DesignPatterns.Behavior.Fly;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Выходим на первую космическую на ракетной тяге...");
    }
}
