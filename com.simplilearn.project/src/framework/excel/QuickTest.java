package framework.excel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class QuickTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","//home//utkarsh20thgmai//Downloads//Softwares//Selenium_softwares//webdriver_chrome_driver_version83//chromedriver");
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/";
		driver.get(url);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		/*
		String path = "/html/body/div/div/div/div[2]/div/div[2]/div/div[3]/h5";		
		// **** Code to scroll to view using xpath inside javascript
		function getElementByXpath(path) {
			  return document.evaluate(path, document, null, XPathResult.FIRST_ORDERED_NODE_TYPE, null).singleNodeValue;
			}
		*/
		

	}

}
