package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoratorPatternClient {

    private Comppnent comppnent;

    public DecoratorPatternClient(Comppnent comppnent) {
        this.comppnent = comppnent;
    }

    public void execute() {
        String result = comppnent.operation();
        log.info("result={}", result);
    }
}
