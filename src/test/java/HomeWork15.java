import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork15 extends BaseTest {
    @Test
    public void LoginEmptyEmailPasswordTest() {

        String url = "https://testpro.io/";
        getDriver().get(url);
        Assert.assertEquals(getDriver().getCurrentUrl(), url);
        getDriver().quit();
    }
}
