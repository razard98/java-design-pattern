package james.pattern.structural.proxy.simple;

import james.pattern.structural.proxy.simple.Proxy;
import james.pattern.structural.proxy.simple.Subject;
import org.junit.Test;

public class ProxyTest {

    @Test
    public void testProxy() {

        Proxy proxy = new Proxy();
        proxy.doSomething("hello");

        Subject subject = new Subject();
        subject.doSomething("hi");
    }
}
