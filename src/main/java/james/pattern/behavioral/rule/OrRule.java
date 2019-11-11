package james.pattern.behavioral.rule;

import java.util.List;

public class OrRule implements IRule {

    private List<IRule> rules;

    OrRule(List<IRule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean isMatch(SomeThing someThing) {
        return rules.stream().anyMatch(r -> r.isMatch(someThing));
    }
}
