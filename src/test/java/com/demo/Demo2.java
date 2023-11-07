package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2 {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");

		driver.manage().window().maximize();
		
		WebElement dDnSkills = driver.findElement(By.id("Skills"));
		
		Select select = new Select(dDnSkills);
		
		select.selectByVisibleText("Certifications");
		
	}
}