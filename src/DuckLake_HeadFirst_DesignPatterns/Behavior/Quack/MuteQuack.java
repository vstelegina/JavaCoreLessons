package DuckLake_HeadFirst_DesignPatterns.Behavior.Quack;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("/осуждающее молчание/");
    }
}
