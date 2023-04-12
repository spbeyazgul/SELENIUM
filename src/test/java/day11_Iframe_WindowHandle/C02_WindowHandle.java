package day11_Iframe_WindowHandle;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
public class C02_WindowHandle extends TestBase {
    /*
    //Window 1'de https://www.techproeducation.com adresine gidiniz
    //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
    //Window 2'de https://www.youtube.com sayfasını açınız:
    //Window 3'te https://www.linkedin.com sayfasını açınız:
    //techproeducation sayfasına geçiniz:
    //youtube sayfasına geçiniz:
    //linkedIn sayfasına geçiniz:
     */
    @Test
    public void windowHandle() {
        //Window 1'de https://www.techproeducation.com adresine gidiniz
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();//Techpro sayfasının handle değerini bir String'e assing ettik

        //Başlığın "Techpro Education | Online It Courses & Bootcamps" olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Techpro Education | Online It Courses & Bootcamps";
        Assert.assertEquals(expectedTitle,actualTitle);

        //Window 2'de https://www.youtube.com sayfasını açınız:
        driver.switchTo().//Geçiş yap
                newWindow(WindowType.WINDOW);//-->Yeni bir pencereye driver'i taşır

        //-->WindowType.TAB-->Yeni sekme açar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();//Youtube sayfasının handle değerini bir String'e assing ettik

        //Window 3'te https://www.linkedin.com sayfasını açınız:
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();
        //techproeducation sayfasına geçiniz:
        bekle(3);
        driver.switchTo().window(techproWindowHandle);

        //youtube sayfasına geçiniz:
        bekle(3);
        driver.switchTo().window(youtubeWindowHandle);

        //linkedIn sayfasına geçiniz:
        bekle(3);
        driver.switchTo().window(linkedinWindowHandle);
    }
}