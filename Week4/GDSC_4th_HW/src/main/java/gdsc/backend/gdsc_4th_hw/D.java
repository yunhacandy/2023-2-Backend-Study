package gdsc.backend.gdsc_4th_hw;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class D {
    private final C c;

    public C getC() {
        return c;
    }
}