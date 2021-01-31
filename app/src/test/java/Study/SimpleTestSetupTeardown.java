package Study;

import org.testng.annotations.*;

public class SimpleTestSetupTeardown {
    @BeforeClass
    public void setupTestClass() {
        System.out.println("setupTestClass");
    }

    @BeforeMethod
    public void setupTestMethod() {
        System.out.println("setupTestMethod");
    }


    @AfterClass
    public void teardownTestClass() {
        System.out.println("teardownTestClass");
    }

    @AfterMethod
    public void teardownTestMethod() {
        System.out.println("teardownTestMethod");
    }

    @Test
    public void theFirstDummyTest() {
        System.out.println("theFirstDummyTest");
    }

    @Test
    public void theSecondDummyTest() {
        System.out.println("theSecondDummyTest");
    }


}
