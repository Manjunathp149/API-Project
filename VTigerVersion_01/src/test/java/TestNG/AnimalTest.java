package TestNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AnimalTest {
@Test(priority = 1)       //invocationCount = 3)
public void elephantTest()
{
Reporter.log("Big", true);
}


@Test      ( priority=-1, dependsOnMethods = "dogTest")
public void ratTest()
{
Reporter.log("Small", true);
}
@Test  (priority=2)            //invocationCount = 2)
public void dogTest()
{
Reporter.log("Medium", true);
Assert.fail();
}
@Test (priority=1)   //invocationCount = 1, dependsOnMethods = "dogTest")
public void snakeTest()
{
Reporter.log("thin", true);
}

}
