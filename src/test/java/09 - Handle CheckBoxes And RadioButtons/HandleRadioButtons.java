package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandleRadioButtons {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();


        WebElement maleRB = driver.findElement(By.xpath("//input[@id='male']"));
        WebElement femaleRB = driver.findElement(By.xpath("//input[@id='female']"));

        System.out.println("Before selection");
        System.out.println("Male is selected? : " + maleRB.isSelected());
        System.out.println("Female is selected? : " + femaleRB.isSelected());

        maleRB.click();

        System.out.println("After selection");
        System.out.println("Male is selected? : " + maleRB.isSelected());
        System.out.println("Female is selected? : " + femaleRB.isSelected());


    }
}
