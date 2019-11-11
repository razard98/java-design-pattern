package james.pattern.structural.proxy.simple;

public class Subject implements ISubject {

    @Override
    public void doSomething(String value) {
        System.out.println("Executed Subject : " + value + " java");
    }
}
