package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_handling {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/");
		Actions ac = new Actions(d);
		java.awt.Robot r = new Robot();
		WebElement element = d.findElement(By.linkText("Mobiles"));
		ac.contextClick(element).perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Set<String> windowHandles = d.getWindowHandles();
		List< String> in = new ArrayList<>(windowHandles);
		for (String title : in) {
		String title2 = d.switchTo().window(title).getTitle();
		System.out.println(title2);
		}
		d.switchTo().window(in.get(0));
		
	}

}
