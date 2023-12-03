package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		d.get("https://letcode.in/table");
		System.out.println("ALL DATA");
		List<WebElement> alldata = d.findElements(By.xpath("(//table)[1]/tbody/tr"));
		for (WebElement data : alldata) {
			System.out.println(data.getText());
		}
		System.out.println();
		System.out.println("Clm Data");
		List<WebElement> clmdata = d.findElements(By.xpath("(//table)[2]/tbody/tr/td[1]"));
		for (WebElement clm : clmdata) {
			System.out.println(clm.getText());
		}
		System.out.println();
		System.out.println("Row Data");
		List<WebElement> rowdata = d.findElements(By.xpath("(//table)[2]/tbody/tr[1]"));
		for (WebElement row : rowdata) {
			System.out.println(row.getText());
		}
		System.out.println();
		System.out.println("Perticular Data");
		WebElement findElement = d.findElement(By.xpath("(//table)[2]/tbody/tr[2]/td[3]"));
		System.out.println(findElement.getText());
		System.out.println();
		System.out.println("Tabe Head");
		List<WebElement> list = d.findElements(By.xpath("(//thead)[3]"));
		for (WebElement webElement : list) {
			System.out.println(webElement.getText());

		}

	}

}
