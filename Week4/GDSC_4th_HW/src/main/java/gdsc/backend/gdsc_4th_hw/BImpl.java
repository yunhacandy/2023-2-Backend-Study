package gdsc.backend.gdsc_4th_hw;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BImpl implements B {
    @Override
    public void funcB() {
        log.info("function B");
    }
}