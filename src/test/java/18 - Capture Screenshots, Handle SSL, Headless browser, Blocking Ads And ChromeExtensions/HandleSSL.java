package CapturescreenshotsHandleSSLHeadlessbrowserBlockingAdsChromeExtensions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); //accepts SSl certificates
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        System.out.println("Title: " + driver.getTitle());
    }
}
