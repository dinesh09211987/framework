package website;

/*import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class captureScreenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		
		Thread.sleep(5000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Dinesh\\eclipse-workspace\\DineshSelenium\\images\\dinesh.png");
		FileUtils.copyFile(source, destination);
		System.out.println("Screenshot captured and stored");
		

	}

}*/


import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class captureScreenshot {


public static void main(String[] args) throws IOException, InterruptedException {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dinesh\\Desktop\\drivers\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.youtube.com/");
driver.manage().window().maximize();
Thread.sleep(2000);



Screenshot screenshot=new AShot()
 .shootingStrategy(ShootingStrategies.viewportPasting(1000))
 .takeScreenshot(driver);

String destinationFile = "C:\\Users\\Dinesh\\eclipse-workspace\\DineshSelenium\\images\\dinesh1.png";

ImageIO.write(screenshot.getImage(), "PNG", new File(destinationFile));

System.out.println("Screenshot captured and stored");
}

}
