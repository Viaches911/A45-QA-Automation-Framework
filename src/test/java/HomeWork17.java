import org.testng.annotations.Test;

public class HomeWork17 extends BaseTest {
    @Test
    public void addSongToPlaylist() throws InterruptedException {

        String newSongAddedNotificationText = "Added 1 song into";

        navigateToPage();
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();


    }
}
