import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HomeWork18 extends BaseTest{
    @Test
    public void playASongTest(){
        LoginPage loginPage = new LoginPage(getThreadLocal());
        loginPage.provideEmail("demo@class.com")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
}
