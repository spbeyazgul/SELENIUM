package zdeneme;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C11 extends TestBase {
    /*
    - http://szimek.github.io/signature_pad/ sayfasına gidiniz
    - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
    - Çizimden sonra clear butonuna basınız
    - Sayfayi kapatiniz
     */

    @Test
    public void cizim() {
//        - http://szimek.github.io/signature_pad/ sayfasına gidiniz
        driver.get("http://szimek.github.io/signature_pad/");

//        - Çıkan ekrana istediğiniz çizgi yada şekli çiziniz
        Actions action = new Actions(driver);

        WebElement tablo = driver.findElement(By.tagName("canvas"));
        action.clickAndHold(tablo).moveByOffset(200,100).
                moveByOffset(60,-100).moveByOffset(30,120).
                moveByOffset(10,-200).moveByOffset(150,120).
                moveByOffset(30,-280).moveByOffset(-20,100).
                release().perform();

        //bekle(3);
//        action.dragAndDropBy(tablo,200,100).perform();

//        action.sendKeys(tablo,"merhaba").perform();
//        action.sendKeys("selam").perform();

//        - Çizimden sonra clear butonuna basınız
        bekle(3);
        driver.findElement(By.xpath("//button[@class='button clear']")).click();
        bekle(3);

//        - Sayfayi kapatiniz

    }
}