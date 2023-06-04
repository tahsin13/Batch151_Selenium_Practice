package day01_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev1Cevap {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        // "https://www.amazon.com/" adresine gidiniz.
        driver.get("https://www.amazon.com/");

        // "https://www.n11.com/" adresine gidiniz.
        driver.get("https://www.n11.com/");

        // amazon adresine geri donunuz
        driver.navigate().back();

        // n11 adresine ilerleyiniz
        driver.navigate().forward();

        // sayfayi yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();

        // Konsola "HER ŞEY YOLUNDA" yazdir
        System.out.println("HER ŞEY YOLUNDA");
    }

}
