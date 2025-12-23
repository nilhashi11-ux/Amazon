package com.practice.self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
WebDriver driver = new ChromeDriver();
	
public void loginstep() {
	
	driver.manage().window().maximize();	
	driver.get("https://www.amazon.com/");	
	driver.findElement(By.xpath("//*[@id='nav-link-accountList']")).click();
	driver.findElement(By.xpath("//*[@id='ap_email_login']")).sendKeys("nilhashi11@gmail.com");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	driver.findElement(By.xpath("//*[@name='password']")).sendKeys("coffee/tea");
	driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
    driver.findElement(By.xpath("//*[@class='a-box-inner a-padding-extra-large']")).click();
	driver.findElement(By.xpath("//*[@class='nav-cart-icon nav-sprite']")).click();
	
	}
	
public static void main(String[] args) {
	Amazon obj = new Amazon();
	obj = new Amazon();	
	obj.loginstep();
	
}	
	

}
