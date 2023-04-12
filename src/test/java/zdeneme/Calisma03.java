package zdeneme;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Calisma03 {
/*
    -BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin
-Before methodunda http://www.google.com adresine gidin
-Üç farklı test methodu ile;
-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
-NOT: Çıkan sonuç sayılarını After methodunda yazdırınız
-AfterClass ile kapatın
     */

    //BeforeClass methodu ile driver ı olusturun ve Maximize edin, 15 sn bekletin

    static WebDriver driver;

    @BeforeClass
    public static void beforeClass() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    //Before methodunda http://www.google.com adresine gidin
    @Before
    public void setUp() throws Exception {
        driver.get("http://www.google.com");
    }

    //-Üç farklı test methodu ile;



    @Test//-arama kutusuna "The God Father" yazip, cikan sonuc sayisini yazdirin
    public void test1() {
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("The God Father", Keys.ENTER);
        WebElement sonuc = driver.findElement(By.id("result-stats"));
        String  sonuc1 = sonuc.getText().split(" ")[1];
        System.out.println(sonuc1);
    }
    @Test //-arama kutusuna  "Lord of the Rings" yazip, cikan sonuc sayisini yazdirin
    public void test2(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Lord of the Rings",Keys.ENTER);
        WebElement sonuc2 = driver.findElement(By.id("result-stats"));
        String sonuc3 = sonuc2.getText().split(" ")[1];
        System.out.println(sonuc3);
    }
    @Test //-arama kutusuna  "Kill Bill" yazip, cikan sonuc sayisini yazdirin
    public void test3(){
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Kill Bill",Keys.ENTER);
        WebElement sonuc2 = driver.findElement(By.id("result-stats"));
        String sonuc3 = sonuc2.getText().split(" ")[1];
        System.out.println(sonuc3);
    }

    }

