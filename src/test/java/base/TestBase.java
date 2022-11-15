package base;

import dev.failsafe.internal.util.Assert;
import net.bytebuddy.implementation.InvokeDynamic;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class TestBase {
    WebDriver driver;
    @BeforeEach
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver Windows/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://yopmail.com/");


    }
    @AfterEach
    public void cleanup() {
        //driver.quit();
    }

    @Test
    public void Test() throws InterruptedException {


    driver.findElement(By.xpath("//input[@class='ycptinput']")).sendKeys("loveo@yopmail.com");
    driver.findElement(By.xpath("//i[@class='material-icons-outlined f36']")).click();
    driver.findElement(By.id("newmail")).click();

    //ifram
    driver.switchTo().frame("ifmail");
    driver.findElement(By.id("msgto")).sendKeys("locango@yopmail.com");
    driver.findElement(By.id("msgbody")).sendKeys("ejemplo");
    driver.findElement(By.id("msgsubject")).sendKeys("asunto");
    driver.findElement(By.id("msgsend")).click();
    String texto=driver.findElement(By.xpath("//div[@class='msgpop-dialog']")).getText();
    Assertions.assertEquals(texto, "Tu mensaje ha sido enviado");





    }
}
