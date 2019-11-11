package james.pattern.behavioral.rule;

public class RuleB implements IRule {

    private boolean result;

    RuleB(boolean result) {
        this.result = result;
    }

    @Override
    public boolean isMatch(SomeThing someThing) {
        boolean result = this.result;
        System.out.println("Execute RuleB : " + result);
        return result;
    }
}
