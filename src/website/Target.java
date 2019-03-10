package website;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Target {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.target.com/");
		driver.manage().window().maximize();
		String webpageTitle = driver.getTitle();
		System.out.println("Webpage title ="+webpageTitle);
		/*driver.findElement(By.xpath("//input[@type='search']")).sendKeys("pants");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("Test is passed");
		
		driver.navigate().refresh();
		System.out.println("page refresh is done");
		Thread.sleep(5000);
		
		driver.navigate().back();
		System.out.println("navigated back");
		Thread.sleep(5000);
		
		driver.navigate().forward();
		System.out.println("navigated forward");
		Thread.sleep(5000);
		
		driver.navigate().to("http://www.facebook.com/");
		System.out.println("navigated to new url");*/
		
		String mycurrentURL = driver.getCurrentUrl();
		System.out.println("My current url is ="+mycurrentURL);
		
		
		

	}

}
