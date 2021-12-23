package org.basetest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassexercise {
   public static WebDriver driver;
	public static WebDriver launchBrowser(String browsername) {
		if(browsername.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browsername.equals("Firefox")){
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browsername.equals("Edge")){
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}

       return driver;
	}
	public static void launchUrl(String url) {
		driver.get(url);
}
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void implicitWait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
	public static void sendKeys(WebElement e,String value) {
		e.sendKeys(value);
	}
	public static void btnClick(WebElement e) {
		e.click();
	}
	public static void quit(){
		driver.quit();
	}
	public static String getCurrentUrl() {
		String url=driver.getCurrentUrl();
		return url;
	}
	public static String getTitle(){
		String Title= driver.getTitle();
		return Title;
	}
	public static String getAttribute(WebElement e) {
		return e.getAttribute("value");
	}
	public static String getText(WebElement e) {
		return e.getText();
	}
	public static void moveToElement(WebElement target) {
		Actions a=new Actions(driver);
		a.moveToElement(target).perform();
	}
	public static void selectByIndex(WebElement element,int index) {
		Select s=new Select(element);
		s.selectByIndex(index);
	}
	public static WebElement findElement(String locatorname,String locValue) {
		WebElement e=null;
		if(locatorname.equals("id")) {
			e=driver.findElement(By.id(locValue));
		}
		else if(locatorname.equals("name")) {
			driver.findElement(By.name(locValue));
		}
		else if(locatorname.equals("xpath")) {
			e=driver.findElement(By.xpath(locValue));
		}
		return e;
	}
	 public static void ScreenShot() throws IOException  {
		 File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 Date d = new Date();
	        String Filename = d.toString();
			FileUtils.copyFile(screenshot, new File("C:\\Users\\asus\\eclipse-workspace\\selenium\\takesScreenshot\\"+Filename+".png"));
	        

	}
	 public static void javascriptexecutor(String ar,WebElement ag) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript(ar,ag);	
}
	    
}

