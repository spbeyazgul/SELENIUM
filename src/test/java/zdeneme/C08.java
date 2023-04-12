package zdeneme;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C08 extends TestBase {

    //        1)https://www.youtube.com adresine gidin
//        2)Aşağıdaki adları kullanarak 3 test metodu oluşturun ve gerekli testleri yapin
//                => Sayfa başlığının "YouTube" oldugunu test edin
//                => YouTube resminin görüntülendiğini (isDisplayed()) test edin
//       ○Search Box 'in erisilebilir oldugunu test edin (isEnabled())
//          ○wrongTitleTest => Sayfa basliginin "youtube" olmadigini dogrulayin


//        1.Bir Class olusturalim YanlisEmailTesti
//        2.http://automationpractice.com/index.php sayfasina gidelim
//        3.Sign in butonuna basalim
//        4.Email kutusuna @isareti olmayan bir mail yazip enter'a
//        bastigimizda "Invalid email address" uyarisi ciktigini test edelim

    @Test
    public void test01() {

        //● https://the-internet.herokuapp.com/iframe adresine
        driver.get("https://the-internet.herokuapp.com/iframe");
        //gidin.

        //● Bir metod olusturun: iframeTest
        //○ "An IFrame containing…." textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        //Assert.assertEquals("An iFrame containing the TinyMCE WYSIWYG Editor",driver.findElement(By.xpath("//h3")).getText());
        WebElement kutu = driver.findElement(By.xpath("//h3"));
        System.out.println(kutu.isEnabled());

        //○Text Box'a "Merhaba Dunya!" yazin.
        driver.switchTo().frame(0);
        bekle(2);
        driver.findElement(By.xpath("//p")).clear();
        bekle(2);
        driver.findElement(By.xpath("//p")).sendKeys("Merhaba Dunya!");

        //○TextBox'in altinda bulunan "Elemental Selenium" linkini textinin gorunur  //oldugunu dogrulayin ve konsolda yazdirin
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).isDisplayed());


    }
}