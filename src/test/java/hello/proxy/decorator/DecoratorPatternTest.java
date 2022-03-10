package hello.proxy.decorator;

import hello.proxy.decorator.code.Comppnent;
import hello.proxy.decorator.code.DecoratorPatternClient;
import hello.proxy.decorator.code.MessageDecorator;
import hello.proxy.decorator.code.RealComponent;
import hello.proxy.decorator.code.TimeDecorator;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class DecoratorPatternTest {

    @Test
    void noDecorator() {
        Comppnent realComponent = new RealComponent();
        DecoratorPatternClient client = new DecoratorPatternClient(realComponent);
        client.execute();
    }

    @Test
    void decorator1() {
        Comppnent messageDecorator = new MessageDecorator(new RealComponent());
        DecoratorPatternClient client = new DecoratorPatternClient(messageDecorator);
        client.execute();
    }

    @Test
    void decorator2() {
        Comppnent realComponent = new RealComponent();
        Comppnent messageDecorator = new MessageDecorator(realComponent);
        Comppnent timeDecorator = new TimeDecorator(messageDecorator);
        DecoratorPatternClient client = new DecoratorPatternClient(timeDecorator);
        client.execute();
    }
}
