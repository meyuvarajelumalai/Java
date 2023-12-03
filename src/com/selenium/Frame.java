package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/frame");
		d.switchTo().frame("firstFr");
		d.findElement(By.name("fname")).sendKeys("Yuvaraj");
		d.findElement(By.name("lname")).sendKeys("Elumalai");
		WebElement element = d.findElement(By.xpath("//iframe[@class='has-background-white']"));
		d.switchTo().frame(element);
		d.findElement(By.name("email")).sendKeys("yuva@gmail.com");
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[text()='Watch tutorial']")).click();
		
		
	}

}
