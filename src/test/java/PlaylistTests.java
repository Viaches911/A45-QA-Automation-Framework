import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class PlaylistTests extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedNotificationText = "Added 1 song into";
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login();
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

            String playlistName = "Test Edited Playlist";

            LoginPage loginPage = new LoginPage(driver);
            HomePage homePage = new HomePage(driver);

            loginPage.login();
            homePage.doubleCLickPlaylist();
            homePage.enterNewPlaylistName(playlistName);
            Assert.assertTrue(homePage.doesPlaylistExist(playlistName));
    }

    @Test
    public void deletePlaylist() throws InterruptedException { //need review

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.login();
        WebElement selectPlayList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@class='playlist playlist']")));
        selectPlayList.click();
//delete playlist
        WebElement deletePlaylistButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='del btn-delete-playlist']")));
        deletePlaylistButton.click();
//confirmation
        WebElement confirmationMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='success show']")));
        Assert.assertTrue(confirmationMessage.isDisplayed());
    }
}





