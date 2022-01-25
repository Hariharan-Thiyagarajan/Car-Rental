import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RentalAirport {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/");
		 driver.findElement(By.cssSelector(".bg-airport")).click();
	       driver.findElement(By.id("fromCityList")).sendKeys("Bangalore");
			Thread.sleep(1000);
			driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-local/div/form/div[2]/div/select/option[3]")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("search_places")).sendKeys("Mysore");
			Thread.sleep(1000);
			driver.findElement(By.id("search_places")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("search_places")).sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(1000);
			driver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
			Thread.sleep(500);
			driver.findElement(By.cssSelector(".book-button.btn")).click();
			//driver.close();

	}
}
