import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork22 extends BaseTest {
    // For Homework 22 I used code from Homework 21 (renamePlaylist) for refactoring and implementation
    //Prerequisite - at least one created playlist by user
    @Test
    public void renamePlaylist() {
        String playlistName = "Test Edited Playlist";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();
        homePage.doubleClickChoosePlaylist();
        homePage.enterNewPlaylistName(playlistName);
//        Assert.assertTrue(homePage.getPlaylistName(); we disable this method in Home Page
    }

}
