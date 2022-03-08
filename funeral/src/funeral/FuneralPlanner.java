package funeral;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class FuneralPlanner {
	

	private static boolean isOtherButtonClicked;
	private static boolean isYesPolclicked;
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\NoMagagula1\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.funeralplannermetgetup-dev.co.za/"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	
		//Repatriation
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[2]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[2]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Undertaker
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[3]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[3]/div[3]/div/div/div/input")).sendKeys("3500");
		Thread.sleep(2000);
		//Cremation
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[4]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[4]/div[3]/div/div/div/input")).sendKeys("300");
		Thread.sleep(2000);
		//Cemetry
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[5]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[5]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		  JavascriptExecutor jse = (JavascriptExecutor)driver;
		  jse.executeScript("window.scrollTo(0,400)");
		
		
		//Coffin
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[6]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[6]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//URN
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[7]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[7]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Funeral Arrangements
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[8]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[8]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Livestock
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[9]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[9]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Clothes
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[10]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel2bh-content\"]/div/div/div[10]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		  JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		  jse1.executeScript("window.scrollTo(0,200)");
		
		driver.findElement(By.xpath("//*[@id=\"panel3bh-header\"]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		
		//Service venue
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[2]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[2]/div[3]/div/div/div/input")).sendKeys("2000");
		Thread.sleep(2000);
		  
		//Chairs
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[3]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[3]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		//Catering 
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[4]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[4]/div[3]/div/div/div/input")).sendKeys("2000");
		Thread.sleep(2000);
		
		//Funeral Service 
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[5]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[5]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		//Flowers
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[6]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[6]/div[3]/div/div/div/input")).sendKeys("2000");
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		  JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		  jse2.executeScript("window.scrollTo(0,400)");
		  
		//Programs
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[7]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[7]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		//Music
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[8]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[8]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		  JavascriptExecutor jse3 = (JavascriptExecutor)driver;
		  jse3.executeScript("window.scrollTo(0,200)");
			
		//Postfuneral
		driver.findElement(By.xpath("//*[@id=\"panel4bh-header\"]/div[1]/div/div[1]")).click();
		Thread.sleep(2000);
		
		//Tombstone
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[2]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[2]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Unveilling
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[3]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[3]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		//Cleansing
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[4]/div[1]/label/span[1]/span[1]/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/div[4]/div[3]/div/div/div/input")).sendKeys("1000");
		Thread.sleep(2000);
		
		Thread.sleep(1000);
		  JavascriptExecutor jse4 = (JavascriptExecutor)driver;
		  jse4.executeScript("window.scrollTo(0,1800)");
		  
		  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div/div/div[3]/div/div/div/div[2]/div[2]/div/button")).click();
			Thread.sleep(8000);
			
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
		
			
		
			//False is the myself button
			isOtherButtonClicked = true;
			
			Thread.sleep(2000);
			WebElement newandOther = driver.findElement(By.xpath("//*[@id=\"Myself&OtherPeople\"]/div/div[3]/span/button"));
			WebElement newandmyself = driver.findElement(By.xpath("//*[@id=\"Myself\"]/div/div[3]/span/button"));
			
			
			
			isYesPolclicked = true;
			
			if(isOtherButtonClicked)
			{
				newandOther.click();
				
				 Thread.sleep(2000);
				   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
				   
				   Thread.sleep(2000);
				 //*[@id="coverAmount"]/span[3]
				   EventFiringWebDriver event = new EventFiringWebDriver(driver);
				   event.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=2800");
				   //year
				   Thread.sleep(5000);
				   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[72]")).click();
				   //month                      

				   Thread.sleep(5000);
				   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[3]")).click();
				   
				   //day
				   Thread.sleep(4000);
				   driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[3]/div[2]/button/span[1]/p")).click();
				   
				   
						//okButton
						  Thread.sleep(3000);
						  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
						  //next
						  Thread.sleep(3000);
						  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
						  
						  //coverAmount
						  Thread.sleep(1000);
						   WebElement slider = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
					       Actions action = new Actions(driver);
					       action.dragAndDropBy(slider, 200, 237).perform();
						  
					       Thread.sleep(3000);
						   driver.findElement(By.xpath("//*[@id=\"confirmCover\"]")).click();
						   //Adding Life partner
						    Thread.sleep(3000);
							   driver.findElement(By.xpath("//*[@id=\"MFSP\"]/div/div[3]/div[1]/button")).click();
							   
							   Thread.sleep(3000);
							   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
							 
							   Thread.sleep(3000);
							   EventFiringWebDriver event1 = new EventFiringWebDriver(driver);
								  event1.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=1000");
								  //year
								  Thread.sleep(4000);
								  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[91]")).click();
								  //month
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
								  //day
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
								  
								//okButton
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
								  //next
								  Thread.sleep(3000);
								  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
								  
								  //coverAmount
								  Thread.sleep(1000);
								   WebElement slider1 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
							       Actions action2 = new Actions(driver);
							       action2.dragAndDropBy(slider1, 200, 237).perform();
								  
							       Thread.sleep(3000);
								   driver.findElement(By.xpath("//*[@id=\"confirmCover\"]")).click();
								   
								   
								  //Adding Child
								   driver.findElement(By.xpath(" //*[@id=\"MFUC\"]/div/div[3]/div[1]/button")).click();
								
								   Thread.sleep(3000);
								   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
								   
								   Thread.sleep(3000);
								   EventFiringWebDriver event2 = new EventFiringWebDriver(driver);
									  event2.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=500");
								 
									  //year
									  Thread.sleep(5000);
									  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[81]")).click();
									  //month
									  Thread.sleep(5000);
									  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
									  //day
									  Thread.sleep(4000);
									  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
									  
									//okButton
									  Thread.sleep(2000);
									  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
									//Check Child for life
									  Thread.sleep(3000);
									  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div[2]/label/span[1]/span[1]/input")).click();
									  
								//Next button
									  Thread.sleep(2000);
									  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
									
									  //coverAmount
									  Thread.sleep(1000);
									   WebElement slider2 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
								       Actions action3 = new Actions(driver);
								       action3.dragAndDropBy(slider2, 200, 227).perform();
								       
								     //this seems about right
										  Thread.sleep(2000);
										  driver.findElement(By.xpath("//*[@id=\"confirmCover\"]")).click();
										  
										  //PArent
										  driver.findElement(By.xpath("//*[@id=\"MFPA\"]/div/div[3]/div[1]/button")).click();
											
										   Thread.sleep(3000);
										   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
										   
										   Thread.sleep(3000);
										   EventFiringWebDriver event3 = new EventFiringWebDriver(driver);
											  event3.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=500");
										 
											  //year
											  Thread.sleep(5000);
											  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[40]")).click();
											  //month
											  Thread.sleep(5000);
											  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
											  //day
											  Thread.sleep(4000);
											  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
											  
											//okButton
											  Thread.sleep(2000);
											  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
											
										//Next button
											  Thread.sleep(2000);
											  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
											
											  //coverAmount
											  Thread.sleep(1000);
											   WebElement slider3 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
										       Actions action4 = new Actions(driver);
										       action4.dragAndDropBy(slider3, 200, 227).perform();
										       
										     //this seems about right
												  Thread.sleep(2000);
												  driver.findElement(By.xpath("//*[@id=\"confirmCover\"]")).click();
												  
												  
												  
												  //Extended Family
												  driver.findElement(By.xpath("//*[@id=\"MFEF\"]/div/div[3]/div[1]/button")).click();
													
												   Thread.sleep(3000);
												   driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[2]/div/div/div/input")).click();
												   
												   Thread.sleep(3000);
												   EventFiringWebDriver event4 = new EventFiringWebDriver(driver);
													  event4.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=500");
												 
													  //year
													  Thread.sleep(5000);
													  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[40]")).click();
													  //month
													  Thread.sleep(5000);
													  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
													  //day
													  Thread.sleep(4000);
													  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
													  
													//okButton
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
													
												//Next button
													  Thread.sleep(2000);
													  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
													
													  //coverAmount
													  Thread.sleep(1000);
													   WebElement slider4 = driver.findElement(By.xpath("//*[@id=\"coverAmount\"]/span[3]"));
												       Actions action5 = new Actions(driver);
												       action5.dragAndDropBy(slider4, 200, 227).perform();
												       
												     //this seems about right
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"confirmCover\"]")).click();
														  
												  
														  //quote
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/div/div/div[2]/div/button")).click();
														
														  //Buy now
														  Thread.sleep(8000);
														  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[1]/div[6]/div/div/div/div/div[3]/div[2]/button")).click();
														  

														     Thread.sleep(2000);
														  driver.findElement(By.id("clientTitle")).click();
														     Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"clientTitle_2\"]")).click();
														     Thread.sleep(2000);
														  driver.findElement(By.name("clientFirstName")).sendKeys("Juanita");
														     Thread.sleep(2000);
														  driver.findElement(By.name("clientSurname")).sendKeys("Kromker");
														     Thread.sleep(2000);
														  driver.findElement(By.name("clientIdNumber")).sendKeys("7103150043086");
														     Thread.sleep(2000);
														  driver.findElement(By.id("maritalStatus")).click();
														 driver.findElement(By.id("maritalStatus_1")).click();
														     Thread.sleep(1000);
														  driver.findElement(By.name("clientEmail")).sendKeys("cocom@gmail.com");
														  Thread.sleep(1000);
														  driver.findElement(By.name("clientCell")).sendKeys("0765746537");
														
														  
														  //Payment info
														  Thread.sleep(1000);
														  driver.findElement(By.xpath("//*[@id=\"panel2bh-header\"]")).click();
														  
														  Thread.sleep(1000);
														  driver.findElement(By.xpath("//*[@id=\"mui-component-select-bankName\"]")).click();
														  
														  Thread.sleep(1000);
														  driver.findElement(By.id("bankName_11")).click();
														
														  Thread.sleep(1000);
														  driver.findElement(By.xpath("//*[@id=\"mui-component-select-accountType\"]")).click();
														  
														  Thread.sleep(1000);
														  driver.findElement(By.xpath("//*[@id=\"accountType_1\"]")).click();
														  
														  Thread.sleep(1000);
														  driver.findElement(By.id("accountNumber")).sendKeys("71131666");
														  
														  Thread.sleep(3000);
														  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();
														  
															
														  
														
														
														  //Life PArtner
														  
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFSP_0_bh-header\"]/div[1]")).click();
											
														
														  Thread.sleep(2000);
														  driver.findElement(By.id("name_0")).sendKeys("part");
														  
														  Thread.sleep(2000);
														  driver.findElement(By.id("surname_0")).sendKeys("Kromker");
														  
														  Thread.sleep(2000);
														  driver.findElement(By.name("gender_0")).click();
														
														  
														  
													
														  
														//child details
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFCL_bh-header\"]/div[1]")).click();			
														
														  Thread.sleep(5000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFCL_1_bh-header\"]/div[1]")).click();	
														
														  Thread.sleep(2000);
														  driver.findElement(By.id("name_1")).sendKeys("nunu");
														  
														  Thread.sleep(2000);
														  driver.findElement(By.id("surname_1")).sendKeys("Kromker");
														  
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"gender_1\"]/label[2]/span[1]/span[1]/input")).click();
														
														  
														  //Parents
														  
														  Thread.sleep(3000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFPA_bh-header\"]/div[1]")).click();
														  
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFPA_2_bh-header\"]")).click();
														  

														  Thread.sleep(2000);
														  driver.findElement(By.id("name_2")).sendKeys("Gogo");
														  

														  Thread.sleep(2000);
														  driver.findElement(By.id("surname_2")).sendKeys("Melon");
														  

														  Thread.sleep(2000);
														  driver.findElement(By.name("gender_2")).click();
														
														  
														  //Extended Family
														
															  
														  Thread.sleep(3000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFEF_bh-header\"]/div[1]")).click();
														  
														  Thread.sleep(2000);
														  driver.findElement(By.xpath("//*[@id=\"panel_MFEF_3_bh-header\"]/div[1]")).click();
														  

														  Thread.sleep(2000);
														  driver.findElement(By.id("name_3")).sendKeys("rethabile");
														  

														  Thread.sleep(2000);
														  driver.findElement(By.id("surname_3")).sendKeys("Melon");
														  
														  Thread.sleep(2000);
														  driver.findElement(By.id("relation_3")).click();
														  
														  Thread.sleep(2000);
														  driver.findElement(By.id("beneficiaryRelationship_6")).click();
														  
														  Thread.sleep(2000);
														  driver.findElement(By.name("gender_3")).click();
														  
														  Thread.sleep(2000);
														 driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();
														
														 //Beneficiary info
														  Thread.sleep(2000);
															 driver.findElement(By.id("beneficiaryFirstName")).sendKeys("Lunga");
															 
															 Thread.sleep(2000);
															 driver.findElement(By.id("beneficiarySurname")).sendKeys("Nkoks");
															 Thread.sleep(2000);
															 driver.findElement(By.xpath("//*[@id=\"mui-component-select-beneficiaryRelationship\"]")).click();
															 Thread.sleep(2000);
															 driver.findElement(By.id("beneficiaryRelationship_2")).click();
															 
															 Thread.sleep(2000);
															 driver.findElement(By.id("beneficiaryCell")).sendKeys("0764534251");
															 
															 Thread.sleep(2000);
															 driver.findElement(By.xpath("//*[@id=\"beneficiaryDateOfBirth\"]")).click();
															
															  Thread.sleep(3000);
															   EventFiringWebDriver event5 = new EventFiringWebDriver(driver);
																  event5.executeScript("document.querySelector('div[class=\"MuiPickersYearSelection-container\"]').scrollTop=500");
															 
																  //year
																  Thread.sleep(5000);
																  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[39]")).click();
																  //month
																  Thread.sleep(5000);
																  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div/div[6]")).click();
																  //day
																  Thread.sleep(4000);
																  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/div/div[2]/div[2]/div/div[2]/div[5]/button/span[1]/p")).click();
																  
																//okButton
																  Thread.sleep(2000);
																  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/button[2]/span[1]")).click();
																
																  //Next
																  Thread.sleep(2000);
																  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div/div[2]/div/button")).click();
																
															  
																//*[@id="pip_true"]
																//PIP radio
																  driver.findElement(By.xpath("//*[@id=\"pip_true\"]")).click();
																  Thread.sleep(2000);
																  //Marketing Consent
																  driver.findElement(By.xpath("//*[@id=\"panel2bh-header\"]/div[1]")).click();
																  //1st button
																  driver.findElement(By.xpath("//*[@id=\"marketConsent_false\"]")).click();
																  Thread.sleep(2000);
																  //2nd button
																  driver.findElement(By.xpath("//*[@id=\"sharePersonalInfo_false\"]")).click();
																  Thread.sleep(2000);
																  //Policy 
																  driver.findElement(By.xpath("//*[@id=\"panel4bh-header\"]/div[1]")).click();
																  Thread.sleep(2000);
																  
																  WebElement yesPolicy = driver.findElement(By.xpath("//*[@id=\"fusionTrue\"]"));
																	WebElement noPolicy = driver.findElement(By.xpath("//*[@id=\"fusionFalse\"]"));
																  
																  if (isYesPolclicked) {
																	  yesPolicy.click();
																	  
																	  driver.findElement(By.xpath("//*[@id=\"panel4bh-content\"]/div/div/button")).click();
																	  driver.findElement(By.xpath("//*[@id=\"mui-component-select-replaceCompany\"]")).click();
																	  driver.findElement(By.xpath("//*[@id=\"replaceCompany_8\"]")).click();
																	  driver.findElement(By.xpath("//*[@id=\"replacePolicyNumber\"]")).sendKeys("1234567");
																	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[1]/form/div/div/div[3]/label/span[1]/span[1]/input")).click();
																	  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div[2]/button")).click();
																	  
																  }
																  else {noPolicy.click();}
															
																//Declaration
																  driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div[2]/div/div/div[2]/button")).click();
																  //scroll
																  Thread.sleep(2000);
																  JavascriptExecutor jse5 = (JavascriptExecutor)driver;
																  jse5.executeScript("window.scrollTo(0,900)");
																  Thread.sleep(2000);
																  //Declare
																  driver.findElement(By.xpath("//*[@id=\"panel3bh-content\"]/div/div/div[2]/label/span[1]/span[1]/input")).click();
																  
																//Next
																  driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[4]/div/div[2]/div[2]/div/button")).click();
											
			
	}

}}
