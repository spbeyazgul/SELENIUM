package zdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class Calisma02 {
        /*
    *** Aşağıdaki Task'i Junit framework'u ile yapınız
- http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
- Add Element butonuna 100 defa basınız
- 100 defa basıldığını test ediniz
- 90 defa delete butonuna basınız
- 90 defa basıldığını doğrulayınız
- Sayfayı kapatınız
     */

    WebDriver driver;
    @Test
    public void test01() {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //        *** Aşağıdaki Task'i Junit framework'u ile yapınız
//        - http://the-internet.herokuapp.com/add_remove_elements/ adresine gidiniz
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");

//        - Add Element butonuna 100 defa basınız
        for (int i = 0; i <100 ; i++) {
            WebElement addElement = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
            addElement.click();
        }
//        - 100 defa basıldığını test ediniz
        List<WebElement> yüzTesti = driver.findElements(By.xpath("//*[text()='Delete']"));
        if (yüzTesti.size()==100){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test Failed");

//        - 90 defa delete butonuna basınız
        for (int i = 0; i <90 ; i++) {
            WebElement deleteButton =driver.findElement(By.xpath("//*[text()='Delete']"));
            deleteButton.click();
        }
//        - 90 defa basıldığını doğrulayınız
        List<WebElement> deleteTest = driver.findElements(By.xpath("//*[text()='Delete']"));
        if (deleteTest.size()==10){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Failed");
//         - Sayfayı kapatınız
        driver.close();
    }
}