package test;

import org.openqa.selenium.WebDriver;
import utilities.Driver;

public class TestCase3 {
    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();
        driver.get("https://comfyelite.com/");

        if(driver.getTitle().equals("Cntact Us | COMFY ELITE")) System.out.println("User is on Contact Us Page");
        else throw new RuntimeException("User is not routed on Contact Us Page");




        Driver.quitDriver();
    }
}