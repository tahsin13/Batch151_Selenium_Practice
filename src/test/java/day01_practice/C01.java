package day01_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01 {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // "https://testpages.herokuapp.com/styled/calculator" adresine gidin
        String url = "https://testpages.herokuapp.com/styled/calculator";
        driver.get(url);

        // ilk kutucuga 20 giriniz
        WebElement ilkKutucuk = driver.findElement(By.id("number1"));
        ilkKutucuk.sendKeys("20");

        // ikinci kutucuga 30 giriniz
        WebElement ikinciKutucuk = driver.findElement(By.xpath("//input[@id='number2']"));
        ikinciKutucuk.sendKeys("30");

        // calculate'e tıklayınız
        WebElement calculate = driver.findElement(By.xpath("//input[@id='calculate']"));
        calculate.click();

        // sonucu yazdırınız
        WebElement result=driver.findElement(By.xpath("//span[text()='50']"));
        System.out.println(result.getText());

        // sayfayi kapatiniz
        driver.close();
    }
}
