import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork23 extends BaseTest {
    String playlistName = "Test Edited Playlist";

    @Test
    public void renamePlaylist() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();
        homePage.doubleClickFirstPlaylist().enterNewPlaylistName(playlistName);
        Assert.assertEquals(homePage, );

    }

}
