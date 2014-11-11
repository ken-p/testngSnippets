package deadlock.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

@Test(groups="B", dependsOnGroups="A")
public class SomeClass1 {
    private static final Logger log = LoggerFactory.getLogger(SomeClass1.class);

    @Test
    public void someTest1() {
        log.debug("someTest1");
    }
}
