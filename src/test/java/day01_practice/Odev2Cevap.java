package day01_practice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Odev2Cevap {
    public static void main(String[] args) {
        System.setProperty("chromeDriver", "src/main/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // "https://teknosa.com/" adresine gidiniz
        driver.get("https://teknosa.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "Teknoloji" kelimesini icerip icermedigini kontrol ediniz
        if(driver.getTitle().contains("Teknoloji")){
            System.out.println("Title 'Teknoloji' iceriyor");
        }else System.out.println("Title 'Teknoloji' icermiyor");

        // URL'in "teknosa" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("teknosa")){
            System.out.println("URL 'teknosa' iceriyor");
        }else System.out.println("URL 'teknosa' icermiyor");

        // "https://medunna.com/" adresine gidiniz
        driver.get("https://medunna.com/");

        // Sayfanin Title'ini ve URL'ini aliniz ve yazdiriniz
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Title'in "MEDUNNA" kelimesini icerip icermedigini kontrol ediniz.
        if (driver.getTitle().contains("MEDUNNA")){
            System.out.println("Title 'MEDUNNA' iceriyor");
        }else  System.out.println("Title 'MEDUNNA' icermiyor");

        // URL'in "medunna" kelimesini icerip icermedigini kontrol ediniz
        if (driver.getCurrentUrl().contains("medunna")){
            System.out.println("URL 'medunna' iceriyor ");
        }else System.out.println("URL 'medunna' icermiyor ");

        // teknosa adresine geri donunuz
        driver.navigate().back();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // medunna adresine ilerleyiniz
        driver.navigate().forward();

        // Sayfayı yenileyiniz
        driver.navigate().refresh();

        // pencereyi kapat
        driver.close();
    }
}
