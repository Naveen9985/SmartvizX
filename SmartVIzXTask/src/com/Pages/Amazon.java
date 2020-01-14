package com.Pages;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import com.utility.BaseClass;
import com.utility.Log;

public class Amazon extends BaseClass{
   public static int Aprice;
public static Integer amazonPrice ;

public static void openAmazon() throws Exception{
	Log.info("*******started execution***********"); 
	driver.get("https://www.amazon.in/");
	//Waiting for the page to be loaded completely
	 System.out.println("Opened Amazon");
	 Reporter.log("Opened Amazon");
	 Log.info("*******Opened Amazon***********");
	 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Redmi Note");
	 Reporter.log("Search for Redmi Note");
	 Log.info("*******Search for Redmi Note***********");
	 //Mouse Hover To click on search 
	 Actions action = new Actions(driver);
	 WebElement ele = driver.findElement(By.xpath("//input[@type = 'submit']"));
	 action.moveToElement(ele).click().build().perform();
	 System.out.println("Clicked on search");
	 Reporter.log("Clicked on search Button");
	 Log.info("*******Clicked on search Button***********");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).clear();
	 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage)");
	 Reporter.log("Search for Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage) ");
	 Log.info("*******Search for Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage)***********");
	 WebElement ele1 = driver.findElement(By.xpath("//input[@type = 'submit']"));
	 action.moveToElement(ele1).click().build().perform();
	 System.out.println("Clicked on search again");
	 Reporter.log("Clicked on search again");
	 Log.info("*******Clicked on search again***********");
	 try{
		 
	 
	WebDriverWait wait= new WebDriverWait(driver,40);
	WebElement ele2 =driver.findElement(By.linkText("Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage)"));
	wait.until(ExpectedConditions.elementToBeClickable(ele2));
	 System.out.println("Clicked on the item");
	 Reporter.log("Clicked on the product");
	 Log.info("*******Clicked on the product***********");
	 String parentWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window's handle -> " + parentWindowHandle);
	 
		for(String child : driver.getWindowHandles()){
			
			driver.switchTo().window(child);
			System.out.println(driver.getTitle());
		}
		
		System.out.println("Entered into child page");
		Reporter.log("Entered into child page");
		 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		 Thread.sleep(5000);
		
		 System.out.println("Added to cart");
		 Reporter.log("Added to cart");
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
		
	 System.out.println("Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage) is not found or out of stock");
	 Reporter.log("Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage) is not found or out of stock");
	 Log.info("*******Redmi Y2 (Rose Gold, 3GB RAM, 32GB Storage) is not found or out of stock***********");
}


}