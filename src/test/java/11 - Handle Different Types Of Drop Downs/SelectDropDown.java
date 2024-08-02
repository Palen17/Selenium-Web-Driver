package day31;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement drpCountryEle = driver.findElement(By.xpath("//select[@id='country']"));
        Select drpCountry = new Select(drpCountryEle);

        //select option from the drop down
        //drpCountry.selectByVisibleText("France");
        //drpCountry.selectByValue("uk");
        //drpCountry.selectByIndex(2);

        //Capture the options from the dropdown
        List<WebElement> options = drpCountry.getOptions();
        System.out.println(options.size());

        //Printing the options
        /*
        for (int i = 0; i< options.size(); i++){
            System.out.println(options.get(i).getText());
        }
         */

        for (WebElement op:options){
            System.out.println(op.getText());
        }
    }
}
