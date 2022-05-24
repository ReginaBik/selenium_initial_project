package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        WebElement firstNameInputBox = driver.findElement(By.xpath("((//form)[2]/div//input)[1]"));
        WebElement lastNameInputBox = driver.findElement(By.xpath("((//form)[2]/div//input)[2]"));
        WebElement emailInputBox = driver.findElement(By.xpath("((//form)[2]/div//input)[3]"));

       /* WebElement firstNameInputLabel = driver.findElement(By.xpath(""));
        WebElement lastNameInputLable = driver.findElement(By.xpath("((//form)[2]/div//input)[3]"));
        WebElement emailLable= driver.findElement(By.xpath("((//form)[2]/div//input)[3]")); */
        WebElement messageTextBox = driver.findElement(By.tagName("//textarea"));

        String firstName = "John";
        firstNameInputBox.sendKeys(firstName);







        Driver.quitDriver();
    }
}
