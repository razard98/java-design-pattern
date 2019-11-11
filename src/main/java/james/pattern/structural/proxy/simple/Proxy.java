package james.pattern.structural.proxy.simple;

public class Proxy implements ISubject {


    @Override
    public void doSomething(String value) {
        ISubject subject = new Subject();
        subject.doSomething(value);
    }
}
