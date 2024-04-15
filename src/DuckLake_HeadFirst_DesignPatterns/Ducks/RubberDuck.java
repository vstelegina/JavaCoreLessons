package DuckLake_HeadFirst_DesignPatterns.Ducks;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyNoWay;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.Squeak;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("Я - " + this);
    }
}
