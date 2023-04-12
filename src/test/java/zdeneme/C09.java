package zdeneme;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.TestBase;

import java.util.List;

public class C09  extends TestBase{


//1) Open the browser
  //  WebDriver driver = new ChromeDriver();

//2) Enter the URL “http://practice.automationtesting.in/”

// 3) Click on Shop Menu
//4) Now click on Home menu button
//5) Test whether the Home page has Three Arrivals only
//6) The Home page must contains only three Arrivals
//7) Now click the image in the Arrivals
//8) Test whether it is navigating to next page where the user can add that book into his basket.
// 9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
//10) Click on the Add To Basket button which adds that book to your basket
//11) User can view that Book in the Menu item with price.
//12) User can add a book by clicking on Add To Basket button which adds that book in to his Basket


    @Test
    public void test01() {
//        1) Open the browser
//        2) Enter the URL "http://practice.automationtesting.in/"
        driver.get("http://practice.automationtesting.in/");
//        3) Click on Shop Menu
        driver.findElement(By.xpath("//*[text()='Shop']")).click();
//        4) Now click on Home menu button
        driver.findElement(By.linkText("Home"));
//        5) Test whether the Home page has Three Arrivals only
        List<WebElement> fotograf = driver.findElements(By.xpath("//*[@class='woocommerce-LoopProduct-link']"));
        System.out.println(fotograf.size());
//        List<WebElement> fotograf = driver.findElements(By.xpath("(//*[@class='woocommerce'])"));
//        System.out.println(fotograf.size());

//        6) The Home page must contains only three Arrival
        Assert.assertFalse(3== fotograf.size());

//        7) Now click the image in the Arrivals
        driver.findElement(By.xpath("(//*[@class='woocommerce-LoopProduct-link'])[6]"));


//        8) Test whether it is navigating to next page where the user can add that book into his basket.
        WebElement addBook = driver.findElement(By.xpath("//*[text()='Add to basket']"));
        Assert.assertEquals("ADD TO BASKET", addBook.getText());
//        9) Image should be clickable and shoul navigate to next page where user can add that book to his basket
        if (addBook.isEnabled() && addBook.isDisplayed()){
            System.out.println("add book yapılabilir");
        }else {
            System.out.println("add book yapilamaz");
        }
//        10) Click on the Add To Basket button which adds that book to your basket
        addBook.click();

//        11) User can view that Book in the Menu item with price.
        WebElement gorunuyormu = driver.findElement(By.xpath("//a[@class='wpmenucart-contents']"));
        gorunuyormu.isDisplayed();
        //  System.out.println(driver.findElement(By.xpath("//a[@class='wpmenucart-contents']")).isDisplayed());

//        12) User can add a book by clicking on Add To Basket button which adds that book in to his Basket
        addBook.click();

    }
}