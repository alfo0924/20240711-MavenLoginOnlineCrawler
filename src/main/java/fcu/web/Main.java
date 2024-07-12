package fcu.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class Main {
    public static void main(String[] args)
    {
    WebDriver driver = new ChromeDriver();

    driver.get("https://ilearn.fcu.edu.tw/login/index.php");
    driver.findElement(By.cssSelector(".usermenu span .login")).click();
    driver.findElement(By.cssSelector("login-form-username input")).sendKeys();
    driver.findElement(By.cssSelector("login-form-password input"));
    driver.findElement(By.cssSelector(".login-form div .login-form-username "));

    WebElement selectElement=driver.findElement(By.cssSelector(""));
    Select select=new Select(selectElement);
    select.selectByIndex(0);

    driver.quit();


    }
}