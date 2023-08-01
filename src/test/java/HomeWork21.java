import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class HomeWork21 extends BaseTest { //test failed

    String newPlaylistName = "Test Edited Playlist";

    //Prerequisite - at least one created playlist by user

    @Test
    public void renamePlaylist() {
        LoginPage loginPage = new LoginPage(getThreadLocal());
        loginPage.provideEmail("viacheslav.dzhilov@testpro.io")
                .providePassword("te$t$tudent")
                .clickSubmitBtn();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertTrue(doesPlaylistExist());
    }
    public void doubleClickPlaylist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }
    public void enterNewPlaylistName() {
        WebElement playlistInputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[name='name'")));
        playlistInputField.sendKeys(Keys.chord(Keys.CONTROL, "a" , Keys.BACK_SPACE ));
        playlistInputField.sendKeys(newPlaylistName);
        playlistInputField.sendKeys(Keys.ENTER);
    }
    public boolean doesPlaylistExist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='"+newPlaylistName+"']")));
        return playlistElement.isDisplayed();
    }




}
