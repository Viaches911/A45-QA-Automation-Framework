import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork15 extends BaseTest {
    @Test
    public static void LoginEmptyEmailPasswordTest() {
        Assert.assertEquals(driver.getCurrentUrl(), url);
    }
}
