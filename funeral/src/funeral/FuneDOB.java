package funeral;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;

public class FuneDOB {

	public static void main(String[] args) throws InterruptedException {
		
		String year= "1998";
        String monthday= "Sat, Jan 9";

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NoMagagula1\\eclipse-workspace\\newpc\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.funeralcover-dev.metgetup.co.za/"); 
		 driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"Myself\"]/div/div[3]/span/button")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
		   

		        

		
		   
		 // WebElement element = driver.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[1]/div/div[2]/div"));
		   
		  //Select sel = new Select(element);
		  //sel.selectByVisibleText("1900");
		  Thread.sleep(2000);
		  
		  EventFiringWebDriver event = new EventFiringWebDriver(driver);
		  event.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=1000");
		  //year
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[91]")).click();
		  //month
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
		  //day
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
		  //okButton
		  Thread.sleep(4000);
		  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
		  
		  Thread.sleep(1000);
		   WebElement slider = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
	       Actions action = new Actions(driver);
	       action.dragAndDropBy(slider, 501, 227).perform();
		  
	      Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			  
	    //Buy now
		  Thread.sleep(8000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[6]/div/div/div/div/div[3]/div[2]/button")).click();
		  
		  //title on personal info screen
		  //Thread.sleep(3000);
		 // driver.findElement(By.xpath("//*[@id=\"clientTitle\"]")).click();
		
	   //choosingTitle
		  //Thread.sleep(4000);
		  //driver.findElement(By.xpath("/html/body/div[4]/div[3]/ul/li[6]")).click();
		  
		//WebElement title = driver.findElement(By.xpath("//*[@id=\"menu-clientTitle\"]/div[3]/ul"));
		  
		//Select select = new Select(driver.findElement(By.id("clientTitle")));
		//select.selectByIndex(0);
		
		  //WebElement titledropd = driver.findElement(By.id("clientTitle"));
		  //titledropd.click();
		  
		  //List<WebElement> titledropd = driver.findElements(null)
		  
		
		     Thread.sleep(2000);
		  driver.findElement(By.id("clientTitle")).click();
		     Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"clientTitle_15\"]")).click();
		     Thread.sleep(2000);
		  driver.findElement(By.name("clientFirstName")).sendKeys("coco");
		     Thread.sleep(2000);
		  driver.findElement(By.name("clientSurname")).sendKeys("melon");
		     Thread.sleep(2000);
		  driver.findElement(By.name("clientIdNumber")).sendKeys("9006077158085");
		     Thread.sleep(2000);
		  //driver.findElement(By.name("maritalStatus")).click();
		 //NOT DONE driver.findElement(By.xpath("//*[@id=\"clientTitle_15\"]")).click();
		     Thread.sleep(1000);
		  driver.findElement(By.name("clientEmail")).sendKeys("cocom@gmail.com");
		  Thread.sleep(1000);
		  driver.findElement(By.name("clientCell")).sendKeys("0765746537");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"panel2bh-header\"]")).click();
		
		
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"mui-component-select-bankName\"]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("bankName_15")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"mui-component-select-accountType\"]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.xpath("//*[@id=\"accountType_0\"]")).click();
		  
		  Thread.sleep(1000);
		  driver.findElement(By.id("accountNumber")).sendKeys("00884937279");
		  
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();
		
		
	}

}
