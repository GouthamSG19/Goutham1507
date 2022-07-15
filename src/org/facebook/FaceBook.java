package org.facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\FaceBook\\Driver\\chromedriver.exe");
	//launch the driver
	WebDriver driver = new ChromeDriver();
	//get the url
	driver.get("https:www.facebook.com/");
	//maximize
	driver.manage().window().maximize();
	//id
	WebElement txtusername = driver.findElement(By.xpath("//input[@name='email']"));
	txtusername.sendKeys("MrCrazyDevilSG");
	
	WebElement txtpass = driver.findElement(By.xpath("//input[@name='pass']"));
txtpass.sendKeys("12345677");
	
	WebElement btnlogin = driver.findElement(By.xpath("//button[@name='login']"));
	btnlogin.click();
}
}