																																																																																																																																																																																																																																																																																																																																																																																																																																																																						package funeral;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AtomWeb {
	
	private static boolean YourselfFirst;
	private static boolean YourselfandOthersSecond;
	private static boolean FamilyThird;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NoMagagula1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atommetgetup-dev.co.za/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		
	Thread.sleep(1000);
	driver.findElement(By.id("firstName")).sendKeys("Nonjabulo");
	Thread.sleep(1000);
	driver.findElement(By.id("lastName")).sendKeys("Magaula");
	Thread.sleep(1000);
	driver.findElement(By.id("age")).sendKeys("30");
	Thread.sleep(1000);
	driver.findElement(By.id("gender")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("gender_female")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.id("maritalStatus")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("ms_separated")).click();
	
	Thread.sleep(1000);
	driver.findElement(By.id("email")).sendKeys("Nonjabulo@gmail.com");
	Thread.sleep(1000);
	driver.findElement(By.id("cellphone")).sendKeys("0714352657");
		
	Thread.sleep(1000);
	  JavascriptExecutor jse = (JavascriptExecutor)driver;
	  jse.executeScript("window.scrollTo(0,900)");
	
	  Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
	

		WebElement Yourself = driver.findElement(By.xpath("//*[@id=\"Yourself\"]/div/div[3]/span/button"));
		WebElement YourselfandOthers = driver.findElement(By.xpath("//*[@id=\"Yourself&YourFamily\"]/div/div[3]/span/button"));
		WebElement Family = driver.findElement(By.xpath("//*[@id=\"YourFamily\"]/div/div[3]/span/button"));
		
		FamilyThird = true;
		
		if(YourselfFirst)
		{
			Yourself.click();
			
			Thread.sleep(1000);
			   WebElement slider = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
		       Actions action = new Actions(driver);
		       action.dragAndDropBy(slider, 200, 237).perform();
		       
		       Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
		    
		    Thread.sleep(1000);
		   	driver.findElement(By.xpath("//*[@id=\"cashBack\"]/div[2]/button[1]")).click();
	
		    Thread.sleep(1000);
		   	driver.findElement(By.xpath("//*[@id=\"inflation\"]")).click();
		   	
		   	Thread.sleep(1000);
		   	driver.findElement(By.xpath("//*[@id=\"inflation_10\"]")).click();

		   	Thread.sleep(1000);
		   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
		   	
			Thread.sleep(4000);
		   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[8]/div/div/div/div/div[3]/div[2]/button")).click();
		  
			Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"GULP\"]/div/div[2]/div/button")).click();
		  
			Thread.sleep(1000);
			driver.findElement(By.id("firstName")).sendKeys("Mlungisi");
			Thread.sleep(1000);
			driver.findElement(By.id("lastName")).sendKeys("Magaula");
			Thread.sleep(1000);
			driver.findElement(By.id("age")).sendKeys("40");
			Thread.sleep(1000);
			driver.findElement(By.id("gender")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("gender_male")).click();
		   	
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"livingWithMainMember_true\"]/span[1]/span[1]/input")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
			
			Thread.sleep(1000);
			   WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
		       Actions action1 = new Actions(driver);
		       action1.dragAndDropBy(slider1, 200, 237).perform();
		       
		       Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
		    
		  
		}
		else if (YourselfandOthersSecond) {
			
			
			YourselfandOthers.click();
			
			Thread.sleep(1000);
			   WebElement slider = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
		       Actions action = new Actions(driver);
		       action.dragAndDropBy(slider, 200, 237).perform();
		       
		       Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			   	
			   	//Adding child
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"GUC\"]/div/div[2]/div/button")).click();
			    
			   	
				Thread.sleep(1000);
				driver.findElement(By.id("firstName")).sendKeys("Nunu");
				Thread.sleep(1000);
				driver.findElement(By.id("lastName")).sendKeys("Magaula");
				Thread.sleep(1000);
				driver.findElement(By.id("age")).sendKeys("20");
				Thread.sleep(1000);
				driver.findElement(By.id("gender")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("gender_female")).click();
			  //Child for life
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"lifeType_GUC\"]/span[1]/span[1]/input")).click();
				//Next
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"isBiologicalOrLegallyAdoptedChild_true\"]/span[1]/span[1]/input")).click();
				
				//Next
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"fullTimeStudent_false\"]/span[1]/span[1]/input")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"disability_false\"]/span[1]/span[1]/input")).click();
				
				Thread.sleep(1000);
				  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
				  jse1.executeScript("window.scrollTo(0,500)");
				  
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"maritalStatus_single\"]/span[1]/span[1]/input")).click();
				//Next
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				   WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
			       Actions action1 = new Actions(driver);
			       action1.dragAndDropBy(slider1, 200, 237).perform();
			       
			       Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
				   	
				   	//Adding life partner
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"GULP\"]/div/div[2]/div/button")).click();
				  
					Thread.sleep(1000);
					driver.findElement(By.id("firstName")).sendKeys("Mlungisi");
					Thread.sleep(1000);
					driver.findElement(By.id("lastName")).sendKeys("Magaula");
					Thread.sleep(1000);
					driver.findElement(By.id("age")).sendKeys("40");
					Thread.sleep(1000);
					driver.findElement(By.id("gender")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("gender_male")).click();
				   	
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"livingWithMainMember_true\"]/span[1]/span[1]/input")).click();
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
					
					Thread.sleep(1000);
					   WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
				       Actions action2 = new Actions(driver);
				       action2.dragAndDropBy(slider2, 200, 237).perform();
				       
				       Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
				    
				   	//Adding parent
					Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"GUP\"]/div/div[2]/div/button")).click();
				  
					Thread.sleep(1000);
					driver.findElement(By.id("firstName")).sendKeys("Mom");
					Thread.sleep(1000);
					driver.findElement(By.id("lastName")).sendKeys("Magaula");
					Thread.sleep(1000);
					driver.findElement(By.id("age")).sendKeys("59");
					Thread.sleep(1000);
					driver.findElement(By.id("gender")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("gender_female")).click();
				
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
					
					Thread.sleep(1000);
					   WebElement slider3 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
				       Actions action3 = new Actions(driver);
				       action3.dragAndDropBy(slider3, 200, 237).perform();
				       
				       Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
				   	
				   	//Adding extended family
				 
				  
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"GUEF\"]/div/div[2]/div/button")).click();
				  
					Thread.sleep(1000);
					driver.findElement(By.id("firstName")).sendKeys("Mom");
					Thread.sleep(1000);
					driver.findElement(By.id("lastName")).sendKeys("Magaula");
					Thread.sleep(1000);
					driver.findElement(By.id("age")).sendKeys("59");
					Thread.sleep(1000);
					driver.findElement(By.id("gender")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("gender_female")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("relation")).click();
					Thread.sleep(1000);
					driver.findElement(By.id("relation_sister")).click();
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
					
					Thread.sleep(1000);
					   WebElement slider4 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
				       Actions action4 = new Actions(driver);
				       action4.dragAndDropBy(slider4, 200, 237).perform();
				       
				       Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
				   	
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				   	
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"cashBack\"]/div[2]/button[1]")).click();
				   	
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"inflation\"]")).click();
				   	
				   	Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"inflation_10\"]")).click();
				   	
				   	Thread.sleep(1000);
					  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
					  jse2.executeScript("window.scrollTo(0,100)");
				  
				  Thread.sleep(2000);
					 driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
					   	
					Thread.sleep(12000);
					JavascriptExecutor jse3 = (JavascriptExecutor)driver;
				    jse3.executeScript("window.scrollTo(0,200)");
				  
					Thread.sleep(2000);//*[@id="root"]/main/div[1]/table/tbody/tr[4]/td[7]/button[2]/span[1]/svg
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/table/tbody/tr[5]/td[7]/button[2]")).click();
						   	
					Thread.sleep(9000);
					JavascriptExecutor jse4 = (JavascriptExecutor)driver;
				    jse4.executeScript("window.scrollTo(0,200)");
				    
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/table/tbody/tr[4]/td[7]/button[1]")).click();
						   	
					Thread.sleep(2000);
					driver.findElement(By.id("age")).sendKeys("61");
					
					//Next
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
					
					Thread.sleep(1000);
					   WebElement slider5 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
				       Actions action5 = new Actions(driver);
				       action5.dragAndDropBy(slider5, 688, 238).perform();
				       
				       Thread.sleep(2000);
					   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
					   	
						
		}
		else if (FamilyThird) {
			
			Family.click();
			//Adding child
		   	Thread.sleep(2000);
		   	driver.findElement(By.xpath("//*[@id=\"GUC\"]/div/div[2]/div/button")).click();
		    
		   	
			Thread.sleep(1000);
			driver.findElement(By.id("firstName")).sendKeys("Nunu");
			Thread.sleep(1000);
			driver.findElement(By.id("lastName")).sendKeys("Magaula");
			Thread.sleep(1000);
			driver.findElement(By.id("age")).sendKeys("20");
			Thread.sleep(1000);
			driver.findElement(By.id("gender")).click();
			Thread.sleep(1000);
			driver.findElement(By.id("gender_female")).click();
		  //Child for life
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"lifeType_GUC\"]/span[1]/span[1]/input")).click();
			//Next
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"isBiologicalOrLegallyAdoptedChild_true\"]/span[1]/span[1]/input")).click();
			
			//Next
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"fullTimeStudent_false\"]/span[1]/span[1]/input")).click();
			
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"disability_false\"]/span[1]/span[1]/input")).click();
			
			Thread.sleep(1000);
			  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
			  jse1.executeScript("window.scrollTo(0,500)");
			  
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"maritalStatus_single\"]/span[1]/span[1]/input")).click();
			//Next
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
			
			Thread.sleep(1000);
			   WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
		       Actions action1 = new Actions(driver);
		       action1.dragAndDropBy(slider1, 200, 237).perform();
		       
		       Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			   	
			   	//Adding life partner
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"GULP\"]/div/div[2]/div/button")).click();
			  
				Thread.sleep(1000);
				driver.findElement(By.id("firstName")).sendKeys("Mlungisi");
				Thread.sleep(1000);
				driver.findElement(By.id("lastName")).sendKeys("Magaula");
				Thread.sleep(1000);
				driver.findElement(By.id("age")).sendKeys("40");
				Thread.sleep(1000);
				driver.findElement(By.id("gender")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("gender_male")).click();
			   	
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"livingWithMainMember_true\"]/span[1]/span[1]/input")).click();
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				   WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
			       Actions action2 = new Actions(driver);
			       action2.dragAndDropBy(slider2, 200, 237).perform();
			       
			       Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			    
			   	//Adding parent
				Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"GUP\"]/div/div[2]/div/button")).click();
			  
				Thread.sleep(1000);
				driver.findElement(By.id("firstName")).sendKeys("Mom");
				Thread.sleep(1000);
				driver.findElement(By.id("lastName")).sendKeys("Magaula");
				Thread.sleep(1000);
				driver.findElement(By.id("age")).sendKeys("59");
				Thread.sleep(1000);
				driver.findElement(By.id("gender")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("gender_female")).click();
			
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				   WebElement slider3 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
			       Actions action3 = new Actions(driver);
			       action3.dragAndDropBy(slider3, 200, 237).perform();
			       
			       Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			   	
			   	//Adding extended family
			 
			  
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"GUEF\"]/div/div[2]/div/button")).click();
			  
				Thread.sleep(1000);
				driver.findElement(By.id("firstName")).sendKeys("Mom");
				Thread.sleep(1000);
				driver.findElement(By.id("lastName")).sendKeys("Magaula");
				Thread.sleep(1000);
				driver.findElement(By.id("age")).sendKeys("59");
				Thread.sleep(1000);
				driver.findElement(By.id("gender")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("gender_female")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("relation")).click();
				Thread.sleep(1000);
				driver.findElement(By.id("relation_sister")).click();
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				   WebElement slider4 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
			       Actions action4 = new Actions(driver);
			       action4.dragAndDropBy(slider4, 200, 237).perform();
			       
			       Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			   	
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
			   	
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"cashBack\"]/div[2]/button[1]")).click();
			   	
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"inflation\"]")).click();
			   	
			   	Thread.sleep(2000);
			   	driver.findElement(By.xpath("//*[@id=\"inflation_10\"]")).click();
			   	
			   	Thread.sleep(1000);
				  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
				  jse2.executeScript("window.scrollTo(0,100)");
			  
			  Thread.sleep(2000);
				 driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				   	
				Thread.sleep(12000);
				JavascriptExecutor jse3 = (JavascriptExecutor)driver;
			    jse3.executeScript("window.scrollTo(0,200)");
			  
				Thread.sleep(2000);//*[@id="root"]/main/div[1]/table/tbody/tr[4]/td[7]/button[2]/span[1]/svg
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/table/tbody/tr[5]/td[7]/button[2]")).click();
					   	
				Thread.sleep(9000);
				JavascriptExecutor jse4 = (JavascriptExecutor)driver;
			    jse4.executeScript("window.scrollTo(0,200)");
			    
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/table/tbody/tr[4]/td[7]/button[1]")).click();
				
				Thread.sleep(2000);
                WebElement element=driver.findElement(By.id("age"));

            	Thread.sleep(2000);
                Actions a = new Actions(driver);
                a.moveToElement(element).doubleClick().click().sendKeys(Keys.BACK_SPACE).perform();
                
				Thread.sleep(2000);
				element.sendKeys("61");
				
				//Next
				Thread.sleep(2000);
				driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
				
				Thread.sleep(1000);
				   WebElement slider5 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
			       Actions action5 = new Actions(driver);
			       action5.dragAndDropBy(slider5, 688, 238).perform();
			       
			       Thread.sleep(2000);
				   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[3]/div/button")).click();
			
		}
		Thread.sleep(8000);
		JavascriptExecutor jse4 = (JavascriptExecutor)driver;
	    jse4.executeScript("window.scrollTo(0,200)");
	    
	    Thread.sleep(2000);
	   	driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[8]/div/div/div/div/div[2]/div[2]/button")).click();

	    Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"idNumber\"]")).sendKeys("9110105985087");

        Thread.sleep(2000);
		JavascriptExecutor jse5 = (JavascriptExecutor)driver;
	    jse5.executeScript("window.scrollTo(0,200)");

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();


//Thread.sleep(4000);
//driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();

Thread.sleep(2000);
JavascriptExecutor jse6 = (JavascriptExecutor)driver;
jse6.executeScript("window.scrollTo(0,200)");

Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();


Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Junior");

Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Abrahams");
Thread.sleep(1000);
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"relation\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"relation_brother\"]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"cellphone\"]")).sendKeys("0764565433");
Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();

Thread.sleep(3000);

EventFiringWebDriver event = new EventFiringWebDriver(driver);
event.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=2000");
//year
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[82]")).click();
//month                      

Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
//day
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();

	//okButton
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
	  //next
Thread.sleep(2000);
JavascriptExecutor jse7 = (JavascriptExecutor)driver;
jse7.executeScript("window.scrollTo(0,200)");
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();

//PIP radio
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"isPip_true\"]")).click();

Thread.sleep(2000);
JavascriptExecutor jse8 = (JavascriptExecutor)driver;
jse8.executeScript("window.scrollTo(0,200)");


Thread.sleep(2000);
//Marketing Consent
driver.findElement(By.xpath("//*[@id=\"panel2bh-header\"]/div[1]")).click(); 

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"contactMe_false\"]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"shareMyData_true\"]")).click();


Thread.sleep(2000);
//Declaration 
driver.findElement(By.xpath("//*[@id=\"panel3bh-header\"]")).click();






	}}