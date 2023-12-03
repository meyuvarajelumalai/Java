package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitConcepts {
	WebDriver d;

	public void waitTime() {
	WebDriverManager.chromedriver().setup();
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	d.findElement(By.name("username")).sendKeys("Admin");
	d.findElement(By.name("password")).sendKeys("admin123");
	WebElement Element = d.findElement(By.xpath("//button[text()=' Login ']"));
	WebDriverWait wait = new WebDriverWait(d, 20);
	wait.until(ExpectedConditions.visibilityOf(Element));
	Element.click();
	}
	public static void main(String[] args) {
		WaitConcepts w = new WaitConcepts();
		w.waitTime();
	}
}
