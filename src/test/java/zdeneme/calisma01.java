package zdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class calisma01 {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//        1."https:www.saucedemo.com" Adresine gidin
        driver.get("https://www.saucedemo.com");

//        2. Username kutusuna "standard_user"yazdirin
        driver.findElement(By.id("user-name")).sendKeys("standard_user", Keys.ENTER);
//        3. Password kutusuna "secret_sauce"yazdirin
        driver.findElement(By.id("password")).sendKeys("secret_sauce",Keys.ENTER);

//        4. Login tusuna basin
        driver.findElement(By.id("login-button")).click();

//        5. Ilk urunun ismini kaydedin ve bu urunun sayfasina gidin
        WebElement isim = driver.findElement(By.id("item_4_title_link"));
        System.out.println(isim.getText());
        isim.click();

//        6. Add to Cart butonuna basin
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();

//        7. Alisveris sepetine tiklayin
        driver.findElement(By.id("shopping_cart_container")).click();

//        8. Sectiginiz urunun basarili olarak sepete eklendigini control edin
        WebElement isim1 = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        System.out.println(isim1.getText());
        if (isim1.isDisplayed()){
            System.out.println("Test Passed");
        }else
            System.out.println("Test Failed");

//        9. Sayfayi kapatin
        driver.close();
    }

}