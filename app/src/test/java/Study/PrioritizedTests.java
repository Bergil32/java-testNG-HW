package Study;

import org.testng.annotations.Test;

public class PrioritizedTests {
    @Test(priority = 3)
    public void theFirstTestP3() {
        System.out.println("theFirstTestP3");
    }

    @Test(priority = 2)
    public void theSecondTestP2() {
        System.out.println("theSecondTestP3");
    }

    @Test(priority = 1)
    public void theThirdTestP1() {
        System.out.println("theSecondTestP1");
    }
}
