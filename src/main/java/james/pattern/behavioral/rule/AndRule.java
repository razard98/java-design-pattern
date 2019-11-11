package james.pattern.behavioral.rule;

import java.util.List;

public class AndRule implements IRule {

    private List<IRule> rules;

    AndRule(List<IRule> rules) {
        this.rules = rules;
    }

    @Override
    public boolean isMatch(SomeThing someThing) {
        return rules.stream().allMatch(r -> r.isMatch(someThing));
    }
}


