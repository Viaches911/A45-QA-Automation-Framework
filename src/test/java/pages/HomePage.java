package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".playlist:nth-child(3)")
    private WebElement firstPlaylist;
    @FindBy(css = "[name='name']")
    private WebElement playlistNameField;
    @FindBy(css = "img.avatar")
    private WebElement userAvatarIcon;
    @FindBy(css = "div.success.show")
    private WebElement popUpNotification;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    public HomePage doubleClickChoosePlaylist() {
        doubleClick(firstPlaylist);
        return this;
    }
    public HomePage enterNewPlaylistName(String playlistName) {
        playlistNameField.sendKeys(playlistName);
        playlistNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        playlistNameField.sendKeys(playlistName);
        playlistNameField.sendKeys(Keys.ENTER);
        return this;
    }
    public WebElement getUserAvatar () {
        return userAvatarIcon;
    }

//    public boolean doesPlaylistExists(String playlistName) {
//        By newPlaylist = By.xpath("//a[text()='"+playlistName+"']");
//        return findElement(newPlaylist).isDisplayed();
//    }

    public String getPlaylistName() {
        findElement(popUpNotification);
        return findElement(firstPlaylist).getText();
    }


}
