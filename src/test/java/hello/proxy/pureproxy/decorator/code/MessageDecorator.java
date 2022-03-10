package hello.proxy.pureproxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MessageDecorator implements Comppnent {

    private Comppnent comppnent;

    public MessageDecorator(Comppnent comppnent) {
        this.comppnent = comppnent;
    }

    @Override
    public String operation() {
        log.info("MessageDecorator 실행");

        String result = comppnent.operation();
        String decoResult = "*****" + result + "*****";
        log.info("MessageDecorator 꾸미기 적용 전={}, 적용 후={}", result, decoResult);
        return decoResult;
    }
}
