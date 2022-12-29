package tutorial_sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String baseURL = "https://discord.com/";
		System.getProperty("webdriver.chrome.driver",Constant.Driver_Path_Chrome);
		WebDriver driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id=\"app-mount\"]/div/div/div[1]/div[1]/header[2]/nav/a")).click();
		if(driver.getCurrentUrl().equals(baseURL)) {
			System.out.println("At Homepage");
		} else {
			System.out.println("Not in Homepage");
		}
		driver.close();
	}

}
