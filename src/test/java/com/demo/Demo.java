package com.demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement txtFashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(txtFashion).perform();
		
		
		WebElement txtKids = driver.findElement(By.xpath("//a[text()='Kids']"));
		
		action.moveToElement(txtKids).perform();
		
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		
		
		
		
		
		
	}

}
