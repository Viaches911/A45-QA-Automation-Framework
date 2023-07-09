import org.testng.annotations.Test;

public class HomeWork18 extends BaseTest{
    @Test
    public void playASongTest(){
        provideEmail("viacheslav.dzhilov@testpro.io");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();




    }
}
