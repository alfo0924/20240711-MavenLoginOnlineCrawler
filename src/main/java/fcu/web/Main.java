package fcu.web;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    WebDriver driver = new ChromeDriver();

    driver.get("https://ilearn.fcu.edu.tw/");
    driver.findElement(By.cssSelector(".usermenu span.login.pl-2")).click();
    driver.findElement(By.cssSelector(".login-form-username input")).sendKeys("");
    driver.findElement(By.cssSelector(".login-form-password input")).sendKeys("");
        driver.findElement(By.cssSelector(".login-form-submit button.btn.btn-primary ")).click();

        WebElement selectElement =driver.findElement(By.cssSelector("select[name='lmc-filtersemester']"));
        Select select =new Select(selectElement);
        select.selectByIndex(0);


    try
    {
    List<WebElement> elements = driver.findElements(By.cssSelector("#frontpage-mycurricular "));
    System.out.print("Initiate ");
//    Thread.sleep(14500);

    for(WebElement element : elements)
    {
        System.out.print("Printin11");
    WebElement CourseNameElement = element.findElement(By.cssSelector("h6"));
    WebElement TeacherNameElement = element.findElement(By.cssSelector("div"));
        System.out.print("Printin22");
//    System.out.print(CourseNameElement);
    System.out.print(CourseNameElement.getText());
//    System.out.print(TeacherNameElement);
    System.out.print(TeacherNameElement.getText());
    }


    }

    catch(NoSuchElementException e)
    {
    e.printStackTrace();
    }
//    WebElement selectElement=driver.findElement(By.cssSelector(""));
//    Select select=new Select(selectElement);
//    select.selectByIndex(0);

        finally {
        driver.quit();
    }



    }
}