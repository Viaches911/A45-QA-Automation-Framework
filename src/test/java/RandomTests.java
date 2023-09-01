import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class RandomTests extends BaseTest {

    @Test
    public void actionMethods() { //need review
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        doubleClickChoosePlaylist();

//        hoverPlay();
//        contextClickFirstSong();
    }

    @Test
    public void listOfSongsWebElements() { //need review
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        displayAllSongs();
    }
    @Test
    public void registrationNavigation()  { //passed

        WebElement registrationLink = getThreadLocal().findElement(By.xpath("//*[@id=\"app\"]/div/div/form/div[2]/a"));
        registrationLink.click();

        String registrationUrl = "https://qa.koel.app/registration";
        Assert.assertEquals(getThreadLocal().getCurrentUrl(), registrationUrl);

    }

    @Test
    public void playASongTest(){ //passed
        LoginPage loginPage = new LoginPage(getThreadLocal());
        loginPage.provideEmail("demo@class.com")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }

}
