package james.pattern.behavioral.rule;

public class RuleC implements IRule {

    private boolean result;

    RuleC(boolean result) {
        this.result = result;
    }

    @Override
    public boolean isMatch(SomeThing someThing) {
        boolean result = this.result;
        System.out.println("Execute RuleC : " + result);
        return result;
    }
}
