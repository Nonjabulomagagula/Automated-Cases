package funeral;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookBot {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NoMagagula1\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.messenger.com/t/102196302139417"); 
		driver.manage().window().maximize();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		Thread.sleep(2000);
			driver.findElement(By.id("email")).sendKeys("getuptestnmagagula@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("pass")).sendKeys("Welcome@2021**");
			Thread.sleep(2000);
			driver.findElement(By.id("loginbutton")).click();
			
			
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"mount_0_0_l0\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[2]/div/div/div/div/div/div[1]/div[2]/div/div/div/div/div[2]/div/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Get Started");
			  
			
			
			
			
			
			/*  WebDriverWait wait = new WebDriverWait(driver, 10);
			  WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"jsc_c_b\"]")));
			  nameElement.click();*/
			  
			//driver.findElement(By.xpath("//*[@id=\"mount_0_0_+L\"]/div/div/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[3]/div[1]/div[2]/div/div/div[1]/div/a/div[1]/div[1]/div/svg/g")).click();
			//driver.findElement(By.querySelector("//*[@id=\"mount_0_0_VA\"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div/div/div/label/input")).sendKeys("Welcome22021**");
			//document.querySelector
			
			
			
			//driver.findElement(By.xpath("//*[@id=\"mount_0_0_XF\"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[1]/div/svg")).click();
			//*[@id="mount_0_0_PM"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a
			//*[@id="mount_0_0_Rr"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a/svg
			//*[@id="mount_0_0_Ub"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a/svg
			//*[@id="mount_0_0_Ub"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a/div
			//*[@id="mount_0_0_+8"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a/svg
			//*[@id="mount_0_0_+8"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a
			//*[@id="mount_0_0_+8"]/div/div[1]/div/div[2]/div/div/div[1]/div[1]/div[1]/div/div/div/div[1]/div/div/div[2]/div/div[3]/a/svg
			
			
		//*[@id="gatsby-focus-wrapper"]/main/div[3]/div/div/div[1]/div/button/a/div[2]/p
		
		
		 //driver.findElement(By.xpath("//*[@id=\"root\"]/footer/div/div/div[4]/div/div/div/div/div/div[1]/div/a")).click();
		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//*[@id=\"u_0_k_uR\"]/div/div/div/div/button")).click();
		
		
		 Thread.sleep(4000);
		 ////WebDriverWait wait = new WebDriverWait(driver, 10);
		   // WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"email\"]")));

		 //   nameElement.click();
		 ////   nameElement.clear();
		   // nameElement.sendKeys("123");
		 //driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("getuptestnmagagula@gmail.com");
		 //Thread.sleep(4000);
		 //driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Welcome@2021**");
		 //Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
	}

}
//*[@id="email"]