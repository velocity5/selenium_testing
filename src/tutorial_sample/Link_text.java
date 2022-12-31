package tutorial_sample;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class Link_text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://demo.guru99.com/test/block.html";
		System.setProperty("webdriver.chrome.driver", Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		//driver.findElement(By.linkText("click here")).click();
		//driver.findElement(By.partialLinkText("here")).click();
		//String theLinkText = driver.findElement(By.partialLinkText("EGIS")).getText();
		//System.out.println(theLinkText);
		//theLinkText = driver.findElement(By.partialLinkText("egis")).getText();
		driver.findElement(By.partialLinkText("Inside")).click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Outside")).click();
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
