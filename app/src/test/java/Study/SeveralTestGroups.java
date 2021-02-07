package Study;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = { "mainGroup" })
public class SeveralTestGroups {
    @BeforeGroups("groupOne")
    public void setupGroupOne() {
        System.out.println("setupGroupOne");
    }

    @AfterGroups("groupOne")
    public void teardownGroupOne() {
        System.out.println("teardownGroupOne");
    }

    @Test(groups = "WIP")
    public void excludedTC(){
        System.out.println("Hope you don't see this text)");
    }

    @Test(groups = "groupOne")
    public void groupOneTest(){
        System.out.println("groupOneTest");
    }

    @Test(groups = "dependency")
    public void groupDependencyTest(){
        System.out.println("groupDependency test, must be run before groupOne");
    }
}
