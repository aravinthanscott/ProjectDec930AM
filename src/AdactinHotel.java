import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class  AdactinHotel{
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\DESKTOP\\JAVA\\eclipse\\ARAVINTHAN\\Selenium\\drive\\chromedriver.exe");
WebDriver d= new ChromeDriver();
d.get("http://www.adactin.com/HotelApp/");
WebElement user= d.findElement(By.id("username"));
user.sendKeys("SCOTT");
WebElement pass = d.findElement(By.id("password"));
pass.sendKeys("135790");
}
}
