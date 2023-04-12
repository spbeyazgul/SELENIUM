package zdeneme;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import utilities.TestBase;

import java.util.List;

public class C10 extends TestBase {
    @Test
    public void test1() {

        //https://nunzioweb.com/ sitesine git
        driver.get("https://nunzioweb.com/");

        //sitenin gorunur oldugunu test et
        System.out.println(driver.findElement(By.tagName("body")).isDisplayed());

        //soldaki photo page tıklayın
        driver.findElement(By.xpath("(//td[@onmouseover='cellover1(this)'])[8]")).click();
        bekle(2);

        //ana sayfaya geri donun
        driver.navigate().back();

        //"A television show that Nunzio always liked was" yazan kisimda play tusuna basin
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

        // parent iframe e geri donun
        //driver.switchTo().defaultContent();
        driver.switchTo().parentFrame();

        //Navigation menusunun elemanlarını yazdirin
        List<WebElement> menu = driver.findElements(By.xpath("//td[@onmouseover='cellover1(this)']"));
        for (WebElement w :menu ) {
            System.out.println(w.getText());
        }
        //How to Access Free Yahoo! Mail with Outlook linkini tiklayin
        driver.findElement(By.xpath("//*[text()='How to Access Free Yahoo! Mail with Outlook']")).click();
        bekle(3);
        //ilk sayfaya geri donun
        driver.navigate().back();

    }
}