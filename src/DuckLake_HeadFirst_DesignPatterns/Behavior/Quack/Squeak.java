package DuckLake_HeadFirst_DesignPatterns.Behavior.Quack;

public class Squeak implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("/инфернальный визг надувающейся утки/");
    }
}
