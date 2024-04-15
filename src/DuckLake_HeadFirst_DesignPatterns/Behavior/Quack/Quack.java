package DuckLake_HeadFirst_DesignPatterns.Behavior.Quack;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Кря-кря!");
    }
}
