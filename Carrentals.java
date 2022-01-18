import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Carrentals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M1077553\\Documents\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.savaari.com/");
		String Xpath = "//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-home/div/app-home-container/div[1]/div[1]/div[2]/app-outstation/div";

		driver.findElement(By.id("fromCityList")).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(By.id("fromCityList")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Xpath + "/form/div[2]/div/input")).sendKeys("Coimbatore");
		Thread.sleep(1000);
		driver.findElement(By.xpath(Xpath + "/form/div[2]/div/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("pickUpTime")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath(Xpath + "/form/div[4]/div/button")).click();
		Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-select-car/div[2]/div/div/div[1]/div/div[4]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[1]/div/input")).sendKeys("Hari");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[2]/input")).sendKeys("awe@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[3]/div/input")).sendKeys("11536672");
        Thread.sleep(1000);
        driver.findElement(By.id("search_places")).sendKeys("Chennai");
        Thread.sleep(1500);
        driver.findElement(By.id("search_places")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"approot\"]/mat-sidenav-container/mat-sidenav-content/app-booking/div[2]/app-booking-pickup-detail/div/div[2]/form/div[6]/input")).click();
        driver.close();
        
        
}
}