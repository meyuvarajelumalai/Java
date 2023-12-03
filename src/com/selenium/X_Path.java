package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class X_Path {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/login/");
		d.findElement(By.id("email")).sendKeys("yuvi@gmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		d.findElement(By.xpath("//button[text()='Log in']")).click();
		
		
	}

}
