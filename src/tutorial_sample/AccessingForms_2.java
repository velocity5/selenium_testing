package tutorial_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingForms_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver", "E:\\Testing related docs\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseURL = "http://demo.guru99.com/test/radio.html";
		driver.get(baseURL);
		
		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		radio1.click();
		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		radio2.click();
		WebElement radio3 = driver.findElement(By.id("vfb-7-3"));
		radio3.click();
		
		System.out.println("Radio buttons clicked");

		driver.close();
	}
}
