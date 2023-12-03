package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript_Executor {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=58075519359&hvpone=&hvptwo=&hvadid=610780881833&hvpos=&hvnetw=g&hvrand=5079865115968343930&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9061916&hvtargid=kwd-64107830&hydadcr=14452_2316413");
		JavascriptExecutor js = (JavascriptExecutor)d;
		js.executeScript("window.scrollBy(0, 2000)"); //Scroll down
		Thread.sleep(2000);
	    js.executeScript("window.scrollBy(0, -1000)"); // Scroll up
	    Thread.sleep(2000);
	    WebElement element = d.findElement(By.xpath("//a[text()='Australia']"));
	    js.executeScript("arguments[0].scrollIntoView();", element);
	    Thread.sleep(2000);
	    js.executeScript("window.scroll(0,0)");
	}

}
