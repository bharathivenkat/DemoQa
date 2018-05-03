package org.test.Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	static WebDriver driver;


			public static void browserOpen(){
				System.setProperty("webdriver.chrome.driver", "./browserdrivers/chromedriver.exe");
				driver =  new ChromeDriver();
				driver.manage().window().maximize();
			}
			public static void browserClose(){
				driver.quit();
			}
			public static void launchApp(String url){
				driver.get(url);
			}
			public static void typeText(WebElement element, String txt){
				element.sendKeys(txt);
			}
			
				
		
	}


