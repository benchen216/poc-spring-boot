package win.ben2.pocspringboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

@ExtendWith(OutputCaptureExtension.class)
@SpringBootTest
class PocSpringBootApplicationTests {

    @Test
    void contextLoads(CapturedOutput output) {
        Assertions.assertThat(output.getOut()).contains("San Francisco,CA,US");
    }
}
