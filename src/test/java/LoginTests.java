import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class LoginTests extends BaseTest {

    @Test (dataProvider = "IncorrectLoginData", dataProviderClass = BaseTest.class, enabled = true, priority = 0, description = "Login with invalid email and valid password")
    public void loginInvalidEmailValidPasswordTest(String username, String password){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.provideEmail(username);
        loginPage.providePassword(password);
        loginPage.clickSubmit();

        Assert.assertEquals(getDriver().getCurrentUrl(), url); // https://bbb.testpro.io/
    }

    @Test (enabled = true, priority = 1, description = "Login with valid email and valid password")
    public void loginValidEmailPasswordTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickSubmit();
        isAvatarDisplayed();
    }

    @Test (enabled = true, priority = 3, description = "Login with valid email and empty password")
    public void loginValidEmailEmptyPasswordTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("");
        loginPage.clickSubmit();

        Assert.assertEquals(getDriver().getCurrentUrl(), url); //https://bbb.testpro.io/
    }
    public void isAvatarDisplayed() {
        WebElement avatarIcon = getDriver().findElement(By.cssSelector("img[class='avatar']"));
        Assert.assertTrue(avatarIcon.isDisplayed());
//        Assert.assertEquals(avatarIcon.isDisplayed(), true);
    }

    //Page Object Model example
    @Test
    public void LoginValidEmailPasswordTest () {

        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.provideEmail("demo@class.com");
        loginPage.providePassword("te$t$tudent");
        loginPage.clickSubmit();

        Assert.assertTrue(homePage.getUserAvatar().isDisplayed());

    }

    @Test
    public static void LoginEmptyEmailPasswordTest () {

        //Added ChromeOptions argument below to fix websocket error
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://bbb.testpro.io/";
        driver.get(url);

        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
    }
}
