package DuckLake_HeadFirst_DesignPatterns.Ducks;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyWithWings;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.Quack;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;

public abstract class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Я - " + this);
        System.out.println("КРЯ");
    }
}
