package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class TestCase4 {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");


        Driver.quitDriver();
    }
}