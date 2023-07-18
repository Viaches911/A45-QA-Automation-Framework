package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    @FindBy(css = ".playlist:nth-child(3)")
    private WebElement firstPlaylist;
    @FindBy(css = "[name='name']")
    private WebElement playlistNameField;
    @FindBy(css = "img.avatar")
    private WebElement userAvatarIcon;

    public HomePage(WebDriver givenDriver) {
        super(givenDriver);
    }
    public HomePage doubleClickFirstPlaylist() {
        actions.doubleClick(firstPlaylist).perform();
        return this;
    }
    public HomePage enterNewPlaylistName(String newplaylistName) {
        playlistNameField.sendKeys(newplaylistName);
        playlistNameField.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.BACK_SPACE));
        playlistNameField.sendKeys(newplaylistName);
        playlistNameField.sendKeys(Keys.ENTER);
        return this;
    }
    public WebElement getUserAvatar () {
        return userAvatarIcon;
    }

    public boolean doesPlaylistExists(String newPlaylistName) {
        By newPlaylist = By.xpath(String.format("//a[text()='%s']", newPlaylistName));
        return findElement((WebElement) newPlaylist).isDisplayed();
    }


}
