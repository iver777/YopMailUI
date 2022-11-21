package base;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

        WebElement texto;
    driver.switchTo().frame("ifmail");
    //String email=driver.findElement(By.id("msgfrom']")).getText();
    driver.findElement(By.id("msgto")).sendKeys("loveo@yopmail.com");
    driver.findElement(By.id("msgsubject")).sendKeys("Asunto");
    driver.findElement(By.id("msgbody")).sendKeys("este es un mensaje de prueba");
    //enviar mensaje
    driver.findElement(By.id("msgsend")).click();

    //verificar mensaje
    driver.findElement(By.xpath("//button[@class='md but textu f36']")).click();
  //  texto=driver.findElement();
   // Assertions.assertEquals(texto, "Asunto");







    }
}
