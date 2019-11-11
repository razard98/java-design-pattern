package james.pattern.behavioral.strategy;

public class StrategyA implements Strategy{
    @Override
    public void runStrategy() {
        System.out.println("run StategyA");
    }
}
