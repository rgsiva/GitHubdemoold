import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rgsiv\\Documents\\Selenium\\Selenium PreRrquisites\\Drivers\\chromedriver_82.0.4103.39.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		String parent = driver.getWindowHandle();
		
		System.out.println("Parent window id is " + parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		
		ArrayList<String> tabs = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(tabs.get(2));
		
		System.out.println("Title of current window is " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(tabs.get(1));
		
		System.out.println("Title of current window is " + driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(tabs.get(0));
		
		System.out.println("Title of parent window is " + driver.getTitle());
		
		driver.close();

	}

}
