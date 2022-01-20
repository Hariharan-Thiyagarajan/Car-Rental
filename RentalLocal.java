import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RentalLocal {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1077553\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/");
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[1]/div[2]/a/span")).click();
        driver.findElement(By.id("fromCityList")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"pickUpTime\"]/option[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[4]/div/button")).click();
	
		
	}

}
