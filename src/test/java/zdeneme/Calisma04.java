package zdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma04 {


    //        -https://www.facebook.com adresine gidin
    //        -Cookies'i kabul edin
    //                -"Create an Account" button'una basin
    //        -"radio buttons" elementlerini locate edin
    //                -Secili degilse cinsiyet butonundan size uygun olani secin
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com");
    }
    @Test //                -"Create an Account" button'una basin
    public void test01() {
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        WebElement genderMale = driver.findElement(By.xpath("//*[text()='Erkek']"));
        if (!genderMale.isSelected()) {
            genderMale.click();
        }

        driver.close();
    }
}