package tutorial_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AccessingForms {
	protected WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//		System.out.println(userDirectory);
		System.getProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait= new WebDriverWait(driver,20);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "https://discord.com/login";
		driver.get(baseURL);
		
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.name("password"));
		
		email.sendKeys("hmit299@gmail.com");
		password.sendKeys("1234567");
		
		System.out.println("Text Field Filled");
		// find submit button and click submit
		//WebElement login = driver.findElement(By.className("cepDQ1"));
		//login.submit();
		//System.out.println("Login done with Submit");
		
		driver.close();
		System.exit(0);
	}
}
