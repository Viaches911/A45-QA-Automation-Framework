import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork15 extends BaseTest {
    @Test
    public static void LoginEmptyEmailPasswordTest() {

        String url = "https://testpro.io";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
}
