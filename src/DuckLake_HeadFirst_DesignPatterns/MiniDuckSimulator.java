package DuckLake_HeadFirst_DesignPatterns;

import DuckLake_HeadFirst_DesignPatterns.Behavior.Duck;
import DuckLake_HeadFirst_DesignPatterns.Behavior.Fly.FlyRocketPowered;
import DuckLake_HeadFirst_DesignPatterns.Ducks.DecoyDuck;
import DuckLake_HeadFirst_DesignPatterns.Ducks.MallardDuck;
import DuckLake_HeadFirst_DesignPatterns.Ducks.ModelDuck;
import DuckLake_HeadFirst_DesignPatterns.Ducks.RubberDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performQuack();
        decoyDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.swim();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
