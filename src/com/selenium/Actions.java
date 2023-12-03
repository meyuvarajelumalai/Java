package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://testautomationpractice.blogspot.com/");
		WebElement name = d.findElement(By.name("gender"));
		org.openqa.selenium.interactions.Actions ac = new org.openqa.selenium.interactions.Actions(d);
		ac.click(name).build().perform();
		WebElement dou = d.findElement(By.xpath("//button[text()='Copy Text']"));
		ac.doubleClick(dou).perform();
		WebElement src = d.findElement(By.id("draggable"));
		WebElement des = d.findElement(By.id("droppable"));
		ac.dragAndDrop(src, des).perform();
		d.navigate().to("https://www.amazon.in/");
		WebElement l = d.findElement(By.xpath("//a[text()='Mobiles']"));
		ac.moveToElement(l).perform();
		ac.contextClick(l).perform();
	}

}
