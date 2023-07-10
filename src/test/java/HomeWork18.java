import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeWork18 extends BaseTest{
    @Test
    public void playASongTest(){
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
}
