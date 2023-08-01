import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class HomeWork22 extends BaseTest { //failed
    // For Homework 22 I used code from Homework 21 (renamePlaylist) for refactoring and implementation
    //Prerequisite - at least one created playlist by user
    @Test
    public void renamePlaylist() {
        String playlistName = "Test Edited Playlist";

        LoginPage loginPage = new LoginPage(getThreadLocal());
        HomePage homePage = new HomePage(getThreadLocal());

        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();

        homePage.chooseFirstPlaylist()
                .enterNewPlaylistName(playlistName);
        Assert.assertEquals (homePage.notificationText(), playlistName);
    }

}
