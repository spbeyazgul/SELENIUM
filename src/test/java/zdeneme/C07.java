package zdeneme;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C07 extends TestBase {

    // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
    // ikinci emojiye tıklayın
    // tüm ikinci emoji öğelerini tıklayın
    // parent iframe e geri donun
    // formu doldurun,(Formu istediğiniz metinlerle doldurun)
    // apply button a basiniz

    @Test
    public void test1(){

        // https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/ sitesine gidin
        driver.get("https://www.jqueryscript.net/demo/Easy-iFrame-based-Twitter-Emoji-Picker-Plugin-jQuery-Emoojis/");

        // ikinci emojiye tıklayın
        driver.switchTo().frame(1);
        WebElement hayvan = driver.findElement(By.xpath("(//span[@class='mdl-tabs__ripple-container mdl-js-ripple-effect'])[2]"));
        hayvan.click();

        // tüm ikinci emoji öğelerini tıklayın
        //WebElement hayvan2 = driver.findElement(By.xpath("//div[@class='mdl-tabs__panel is-active']"));
        List<WebElement> hayvanlar = driver.findElements(By.xpath("//div[@class='mdl-tabs__panel is-active']"));
        for (WebElement w : hayvanlar) {
            w.click();
            bekle(3);
        }
        // parent iframe e geri donun
        driver.switchTo().parentFrame();

        // formu doldurun,(Formu istediğiniz metinlerle doldurun)
        driver.findElement(By.id("text")).sendKeys("asfsdkfmdfg", Keys.TAB, "1" , Keys.TAB, "GOKHAN", Keys.TAB , "ASFSDF" , Keys.TAB
                ,"ASDFSDF" , Keys.TAB,"afsdfsd", Keys.TAB, "1" , Keys.TAB, "GOKHAN", Keys.TAB,"afsdfsd", Keys.TAB, "1" , Keys.TAB, "GOKHAN", Keys.TAB,Keys.ENTER);


        // apply button a basiniz
        //bu sorunun yukarıdakinin en sonunda

    }
}