package deadlock.package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;

public class SomeDataFactory {
    @Factory(dataProvider = "data")
    public Object[] createGetInstances(String uri, int statusCode) {
        return new Object[] {
                new SomeClassUsingDataFactory(uri, statusCode)
        };
    }

    @DataProvider(name = "data", parallel = true)
    public Object[][] data() {
        return new Object[][] {
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
                { "/someResource",	200},
        };
    }
}
