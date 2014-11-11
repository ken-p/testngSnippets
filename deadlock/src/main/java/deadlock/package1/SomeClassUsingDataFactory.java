package deadlock.package1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SomeClassUsingDataFactory {
    private static final Logger log = LoggerFactory.getLogger(SomeClassUsingDataFactory.class);

    private String resource;
    private int statusCode;

    public SomeClassUsingDataFactory(String resource, int statusCode) {
        this.resource = resource;
        this.statusCode = statusCode;
    }

    @BeforeClass(groups = "A")
    public void init() {
        log.debug("init using: {}, {}", resource, statusCode);
    }

    @Test(groups = "A")
    public void test1() {
        log.debug("test1 test");
    }

    @Test(groups = "A")
    public void test2() {
        log.debug("test2 test");
    }

    @Test(groups = "A")
    public void test3() {
        log.debug("test3 test");
    }

    @Test(groups = "A")
    public void test4() {
        log.debug("test4 test");
    }
}
