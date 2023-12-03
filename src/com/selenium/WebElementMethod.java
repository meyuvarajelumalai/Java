package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementMethod {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
		element.sendKeys("i Phone");
		WebElement ckl = driver.findElement(By.id("nav-search-submit-button"));
		ckl.click();
		WebElement element1 = driver.findElement(By.id("twotabsearchtextbox"));
		element1.clear();
	}

}
