package james.pattern.behavioral.rule;

public class RuleA implements IRule {

    private boolean result;

    RuleA(boolean result) {
        this.result = result;
    }

    @Override
    public boolean isMatch(SomeThing someThing) {
        boolean result = this.result;
        System.out.println("Execute RuleA :" + result);
        return result;
    }

}
