package zdeneme;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C06 extends TestBase {
    @Test
    public void alert() {

        //    -http://demo.automationtesting.in/Alerts.html sayfasına gidiniz
        driver.get("http://demo.automationtesting.in/Alerts.html");

//   -Alert with OK karşısındaki click the button to display an alert box: butonuna tıklayınız
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();

        //-Çıkan alert üzerindeki yazıyı konsola yazdırınız ve tamam butonuna basınız
        alertAccept();

//-Alert with OK & Cancel butonuna basınız ve sonrasında click the button to display a confirm box butonuna basınız
        driver.findElement(By.xpath("//*[text()='Alert with OK & Cancel '] ")).click();
        driver.findElement(By.xpath("//*[@class='btn btn-primary']")).click();
//-Çıkan alert'te iptal butonuna basınız
        alertDismiss();
//     -Alert with Textbox butonuna basınız ve sonrasında click the button to demonstrate the prompt box butonuna basınız
        driver.findElement(By.xpath("//*[text()='Alert with Textbox '] ")).click();
        driver.findElement(By.cssSelector("button[class='btn btn-info']")).click();
//-Çıkan prompt box'a 'isminizi' yazdırınız ve Tamam'a basınız
        alertprompt("tuba");
        alertAccept();
//-Çıkan mesajı konsola yazdırınız
        System.out.println(driver.findElement(By.xpath("//*[text()='Hello tuba How are you today']")).getText());
//-Çıkan mesajın 'Hello <isminiz> How are you today' yazdığını doğrulayınız
        Assert.assertEquals("Hello tuba How are you today",driver.findElement(By.xpath("//*[text()='Hello tuba How are you today']")).getText());

    }
}