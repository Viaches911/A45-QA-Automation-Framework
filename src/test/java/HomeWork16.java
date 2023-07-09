import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HomeWork16 extends BaseTest {
    @Test
    public void registrationNavigation()  {

        WebElement registrationLink = driver.findElement(By.cssSelector("[id='hel']"));
        registrationLink.click();

        String registrationUrl = "https://qa.koel.app/registration.php";
        Assert.assertEquals(driver.getCurrentUrl(), registrationUrl);

    }
}
