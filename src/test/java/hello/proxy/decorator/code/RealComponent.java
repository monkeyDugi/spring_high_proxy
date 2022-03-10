package hello.proxy.decorator.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RealComponent implements Comppnent {

    @Override
    public String operation() {
        log.info("RealComponent 실행");
        return "data";
    }
}
