package github.com.SeliniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptExecutors {
	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//This topic is practiced over facebook website with a demo account
		driver.get("https://www.facebook.com/");
		
		//implementing Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//Identify elements using different locators
		//Identifying element using Xpath and passing a value to text box
		WebElement element = (WebElement) js.executeScript("return document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue;");
		element.sendKeys("moviebuff1100@gmail.com");
		
		//Identifying element using ID 
		js.executeScript("document.getElementById('email').value='moviebuff1100@gmail.com';");
		
		//Identifying element using name 
		js.executeScript("document.getElementsByName('email')[0].value='moviebuff1100@gmail.com';");
		
		//Identifying element using class name
		js.executeScript("document.getElementsByClassName('inputtext')[0].value='moviebuff1100@gmail.com';");
		
		//Identifying element using Tagname
		js.executeScript("document.getElementsByTagName('input')[2].value='moviebuff1100@gmail.com';");
		
		//Identifying element using CSS Selector
		js.executeScript("document.querySelector('#email').value='moviebuff1100@gmail.com';");
		
		//Doing login task by passing the inputs and using xpath to identify elements
		js.executeScript("document.evaluate(\"//input[@id='email']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='moviebuff1100@gmail.com';");
		js.executeScript("document.evaluate(\"//input[@id='pass']\",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue.value='Greeshma';");
		
		//performing click action using javascript executor
		js.executeScript("document.getElementsByName('login')[0].click()");
		
		//Identifying and element and draw a border around it with specified color
		js.executeScript("document.getElementById('email').style.border='5px red solid';");
		
		//Highlight an element using javascript executor
		js.executeScript("document.getElementById('email').style.background='yellow';");
		js.executeScript("document.getElementById('email').setAttribute('style','border:5px red solid;background:yellow');");
		
		//Performing scroll down action using javascript executor till specifed dimensions
		js.executeScript("window.scrollTo(0,500)");
		
		//scroll down till the specifed element is reached
		js.executeScript("window.scrollBy(0,500)");
		js.executeScript("document.getElementById('ty_footer').scrollIntoView();");
		
	}


}
