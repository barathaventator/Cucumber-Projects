package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		txtFirstName.sendKeys("Geetha");
		
		WebElement txtLastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		txtLastName.sendKeys("lakshmi");
		
		WebElement chkboxCricket = driver.findElement(By.id("checkbox1"));
		chkboxCricket.click();
		
		
		
		WebElement dDnSkills = driver.findElement(By.id("Skills"));
		
		
		Select select = new Select (dDnSkills);
		
		select.selectByVisibleText("Backup Management");
		
		
		WebElement dDnCounty = driver.findElement(By.id("country"));
		
		Select select1  = new Select (dDnCounty);
		
		select1.selectByValue("Hong Kong");
		
		
		
	
	}

}
