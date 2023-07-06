import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork17 extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedNotificationText = "Added 1 song into";

        navigateToPage();
        provideEmail("viacheslav.dzhilov@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        searchSong("Pluto");
        clickViewAllBtn();
        selectFirstSongResult();
        clickAddtoBtn();
        choosePlaylist();
        Assert.assertTrue (getNotificationText().contains(newSongAddedNotificationText));

        //I created empty playlist "Test Playlist" on Koel website before testing.
        //Song "Pluto" will be added to this playlist.
        // Chrome will be launch in fullscreen mode for best demonstration.


    }
}
