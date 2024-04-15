package DuckLake_HeadFirst_DesignPatterns.Ducks;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyWithWings;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("Я - " + this);
    }
}
