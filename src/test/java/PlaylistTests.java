import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedNotificationText = "Added 1 song into";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        searchSong("Pluto");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddtoBtn();
        choosePlaylist();
        Assert.assertTrue(getNotificationText().contains(newSongAddedNotificationText));

        //I created empty playlist "Test Playlist" on Koel website before testing.
        //Song "Pluto" will be added to this playlist.
        // Chrome will be in maximized mode.


    }

    @Test
    public void renamePlaylist() {

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();

        homePage.getFirstPlaylist();
        homePage.getPlaylistNameField();
        homePage.enterNewPlaylistName();

        Assert.assertTrue(homePage.doesPlaylistExist());
    }

    @Test
    public void deletePlaylist() throws InterruptedException { //need review
        String deletedPlaylistMsg = "Deleted playlist";

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();

        //Perform playlist deletion
        homePage.openPlaylist();
        homePage.deletePlaylist();

    }
}


