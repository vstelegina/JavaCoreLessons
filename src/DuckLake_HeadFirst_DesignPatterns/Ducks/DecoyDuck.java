package DuckLake_HeadFirst_DesignPatterns.Ducks;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyNoWay;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.MuteQuack;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("Я - " + this);
    }
}
