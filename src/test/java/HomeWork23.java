import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork23 extends BaseTest {

    // For Homework 23 I used code from Homework 22 (renamePlaylist) for refactoring and implementation with Page Factory
    //Prerequisite - at least one created playlist by user

    @Test
    public void renamePlaylist() throws InterruptedException {
        String playlistName = "Test Edited Playlist";
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        loginPage.login();

        homePage.doubleClickChoosePlaylist()
                .enterNewPlaylistName(playlistName);

        Assert.assertEquals (homePage.getPlaylistName(), playlistName);

    }

}
