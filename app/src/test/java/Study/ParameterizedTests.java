package Study;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTests {
    @Parameters({"parameterOne", "parameterTwo"})
    @Test
    public void testDeviceDataXML(String p1, String p2) {
        System.out.println(String.format("%s / %s", p1, p2));
    }

    @DataProvider(name = "DataProviderOne")
    public Object[][] createData() {
        return new Object[][]{
                {"John", 'J'},
                {"Smith", 'S'},
        };
    }

    @Test(dataProvider = "DataProviderOne")
    public void verifyData(String n1, char n2) {
        System.out.println(n1 + " " + n2);
    }

}
