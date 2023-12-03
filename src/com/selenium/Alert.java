package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/alert");
		WebElement simple = d.findElement(By.id("accept"));
		simple.click();
		org.openqa.selenium.Alert alert = d.switchTo().alert();
		System.out.println(alert.getText());
		Thread.sleep(2000);
		d.switchTo().alert().accept();
		d.findElement(By.id("confirm")).click();
		org.openqa.selenium.Alert alert2 = d.switchTo().alert();
		System.out.println(alert2.getText());
		Thread.sleep(2000);
		d.switchTo().alert().dismiss();
		d.findElement(By.id("prompt")).click();
		d.switchTo().alert().sendKeys("Yuvaraj");
		d.switchTo().alert().accept();
		
	}
	

}
