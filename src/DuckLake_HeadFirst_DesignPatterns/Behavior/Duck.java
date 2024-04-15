package DuckLake_HeadFirst_DesignPatterns.Behavior;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyBehavior;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Quack.QuackBehavior;

public abstract class Duck {
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public void swim() {
        System.out.println("Уть-уть-уть лапками в воде, уть-уть-уть лапками!");
    }

    public abstract void display();

    public void performFly() {
       flyBehavior.fly();
    }

    public void performQuack() {
       quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}