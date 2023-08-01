package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(css = ".avatar")
    private WebElement userAvatarIcon;
    @FindBy(css = ".playlist:nth-child(3)")
    private WebElement firstPlaylist;
    @FindBy(css = "input[name='name']")
    private WebElement playlistNameField;
    @FindBy(css = ".fa-plus-circle")
    private WebElement addNewPlaylist;
    @FindBy(css = ".btn-delete-playlist")
    private WebElement deletePlaylistBtn;
    @FindBy(css = ".show.success")
    private WebElement popUpNotification;
    @FindBy(css = ".songs")
    private WebElement allSongs;
    @FindBy(css = "[data-testid='playlist-context-menu-create-simple']")
    private WebElement chooseCreateNewPlaylist;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }

    public boolean getUserAvatar() {
        return userAvatarIcon.isEnabled();
    }

    public HomePage chooseFirstPlaylist() {
        firstPlaylist.click();
        return this;
    }
    public HomePage enterNewPlaylistName(String playlistName) {
        playlistNameField.sendKeys(playlistName);
        playlistNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        playlistNameField.sendKeys(playlistName);
        playlistNameField.sendKeys(Keys.ENTER);
        return this;
    }

    public void deletePlaylist() {
        deletePlaylistBtn.click();
    }

    public boolean notificationText() {
        findElement(popUpNotification);
        return popUpNotification.isDisplayed();
    }

}
