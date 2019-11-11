package james.pattern.behavioral.rule;

import java.util.Arrays;
import java.util.List;

public class Evaluator {

    public static void main(String[] args) {

        System.out.println("[Rule Evaluation]\r\n");

        // and, or combination
        IRule rule1 = or(new RuleA(true), new RuleB(false),
                and(new RuleC(false)));
        System.out.println("Evaluation : " + evaluate(rule1, new SomeThing()));
        System.out.println("\r\n");

        IRule rule2 = and(new RuleA(true), new RuleB(false));
        System.out.println("Evaluation : " + evaluate(rule2, new SomeThing()));

    }

    private static boolean evaluate(IRule rule, SomeThing someThing) {
        return rule.isMatch(someThing);
    }

    /**
     * Helper for AndRule
     *
     * @param rules : rule set
     * @return
     */
    private static IRule and(List<IRule> rules) {
        return new AndRule(rules);
    }

    private static IRule and(IRule... rules) {
        return new AndRule(Arrays.asList(rules));
    }

    /**
     * Helper for OrRule
     *
     * @param rules : rule set
     * @return
     */
    private static IRule or(List<IRule> rules) {
        return new OrRule(rules);
    }

    private static IRule or(IRule... rules) {
        return new OrRule(Arrays.asList(rules));
    }
}
