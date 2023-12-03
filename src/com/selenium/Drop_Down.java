package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {

// 		Multiple Drop-Down
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://letcode.in/dropdowns");
		WebElement element = d.findElement(By.id("superheros"));
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByValue("am");
		Thread.sleep(2000);
		s.selectByVisibleText("Aquaman");
		Thread.sleep(2000);
		s.selectByIndex(2);
//		Thread.sleep(2000);
//		s.deselectByIndex(2);
//		Thread.sleep(2000);
//		s.deselectByVisibleText("Aquaman");
//		Thread.sleep(2000);
//		s.deselectByValue("am");
		System.out.println();
		List<WebElement> options = s.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
		System.out.println();
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		System.out.println();
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		s.deselectAll();
		
		
		
		
// 		Single Drop-Down		
		
		WebElement element1 = d.findElement(By.id("fruits"));
		Select s1 = new Select(element1);
		s1.selectByValue("0");
		Thread.sleep(2000);
		s1.selectByVisibleText("Mango");
		Thread.sleep(2000);
		s1.selectByIndex(3);
		
		
	}

}
