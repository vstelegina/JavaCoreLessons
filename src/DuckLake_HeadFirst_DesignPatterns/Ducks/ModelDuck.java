package DuckLake_HeadFirst_DesignPatterns.Ducks;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyNoWay;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.Quack;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Я - " + this);
        System.out.println("Я - моделька утки!");
    }
}
