package tutorial_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "E:\\Testing related docs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "https://shopee.vn/buyer/login?next=https%3A%2F%2Fshopee.vn%2F";
		driver.get(baseURL);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div/div/div[2]/form/div/div[2]/div[2]/div[1]/input"));
		WebElement password = driver.findElement(By.name("password"));
		
		email.sendKeys("timmytran95@gmail.com");
		password.sendKeys("1234567");
		
		System.out.println("Text Field Filled");
		// find submit button and click submit
		WebElement login = driver.findElement(By.className("cepDQ1"));
		login.submit();
		System.out.println("Login done with Submit");
		
		driver.close();
		System.exit(0);
	}
}
