package com.practice.self;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonCart {

	WebDriver driver =new ChromeDriver();
	
	void cartlist(){
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//*[@class='nav-cart-icon nav-sprite']")).click();
		
		
		
	}
	
	public static void main(String[] args) {
		AmazonCart obj = new AmazonCart();
		obj.cartlist();
		
		
	}
	
}
