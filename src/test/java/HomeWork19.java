import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork19 extends BaseTest { //test failed

    @Test
    public void deletePlaylist() throws InterruptedException {
        String deletedPlaylistMsg = "Deleted playlist";

        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        openPlaylist();
        clickDeletePlaylistBtn();

        Assert.assertTrue(getDeletedPlaylistMsg().contains(deletedPlaylistMsg));
    }


}
