package zdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma05 {
    // 1)https://www.youtube.com adresine gidin
// 2)Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
//  => Sayfa başlığının "YouTube" oldugunu test edin
//  => YouTube resminin görüntülendiğini (isDisplayed()) test edin
//○Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//○wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://youtube.com");
    }

    @Test
    public void test1() {
        //Sayfa başlığının "YouTube" oldugunu test edin
        String actualTitle = driver.getTitle();
        String expectedTitle = "YouTube";
        System.out.println(actualTitle);
        if (actualTitle.equals(expectedTitle)){
            System.out.println("test passed");
        }else
            System.out.println("test failed");
    }

    @Test
    public void test2() {
//        boolean baslik = driver.getTitle().contains("YouTube");
//        assertTrue(baslik);

        //YouTube resminin görüntülendiğini (isDisplayed()) test edin

        System.out.println(driver.findElement(By.xpath("(//yt-icon[@id='logo-icon'])[1]")).isDisplayed());

        //Search Box 'in erisilebilir oldugunu test edin (isEnabled())

        System.out.println(driver.findElement(By.xpath("//input[@id='search']")).isEnabled());

        //wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin
    }
}