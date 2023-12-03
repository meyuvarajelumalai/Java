package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table_Web {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/table");
		System.out.println("All Data");
		List<WebElement> alldata = driver.findElements(By.xpath("(//table)[1]/tbody/tr"));
		for (WebElement data : alldata) {
		System.out.println(data.getText());	
		}
		System.out.println();
		System.out.println("Clm Data");
		List<WebElement> clm = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[2]"));
		for (WebElement clmdata : clm) {
		System.out.println(clmdata.getText());	
		}
		System.out.println();
		System.out.println("Row Data");
		List<WebElement> row = driver.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
		for (WebElement rowdata : row) {
			System.out.println(rowdata.getText());
		}
		System.out.println();
		System.out.println("Particular Data");
		WebElement findElement = driver.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[3]"));
		System.out.println(findElement.getText());
		System.out.println();
		System.out.println("Table Name");
		List<WebElement> head = driver.findElements(By.xpath("(//thead)[3]"));
		for (WebElement thead : head) {
			System.out.println(thead.getText());
		}
		driver.close();
	}

}
