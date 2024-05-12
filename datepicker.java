package com.datepicker;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class datepicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\thasleem\\Dropbox\\PC\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/demo.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//*[text()='Registration'])[1]")).click();
		Thread.sleep(3000);
		Set<String> wh=driver.getWindowHandles();
		Iterator<String> i1=wh.iterator();
		String mainwindow=driver.getWindowHandle();
		System.out.print(mainwindow);
		System.out.print(wh);

		while(i1.hasNext())
		{
			String childwindow=i1.next(); 
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@id='load_box']//a[@class='fancybox'][normalize-space()='ENTER TO THE TESTING WEBSITE']")).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath("//img[@alt='date picker']")).click();
				Thread.sleep(3000);
				Set<String> wh1=driver.getWindowHandles();
				Iterator<String> i2=wh1.iterator();
				while(i2.hasNext())
				{
					String childwindow1=i2.next(); 
					if(!mainwindow.equalsIgnoreCase(childwindow1) && !childwindow.equalsIgnoreCase(childwindow1))
					{
						driver.switchTo().window(childwindow1);
						Thread.sleep(3000);
						driver.switchTo().frame(0);

						driver.findElement(By.xpath("(//input[@id='datepicker'])[1]")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
						Thread.sleep(3000);

						driver.switchTo().defaultContent();
						driver.findElement(By.xpath("//a[normalize-space()='Animations']")).click();
						Thread.sleep(3000);
						driver.switchTo().frame(1);
						Thread.sleep(3000);
						WebElement UieffectEle=driver.findElement(By.xpath("//select[@id='anim']"));
						Select UiDropdown=new Select(UieffectEle);
						UiDropdown.selectByVisibleText("Clip (UI Effect)");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@id='datepicker']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath("//a[normalize-space()='Display month & year']")).click();
						driver.switchTo().frame(2);
						driver.findElement(By.xpath("//input[@id='datepicker']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//option[@value='3']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//option[@value='2022']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[normalize-space()='13']")).click();
						Thread.sleep(3000);
						driver.switchTo().defaultContent();
						driver.findElement(By.xpath("//a[normalize-space()='Format date']")).click();
						driver.switchTo().frame(3);
						Thread.sleep(3000);
						WebElement dateEle=driver.findElement(By.xpath("//select[@id='format']"));
						Select dateDropdown=new Select(dateEle);
						dateDropdown.selectByVisibleText("Medium - d MM, y");
						Thread.sleep(3000);
						driver.findElement(By.xpath("//input[@id='datepicker']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
						Thread.sleep(3000);
						driver.findElement(By.xpath("//a[normalize-space()='8']")).click();
						driver.switchTo().defaultContent();
						driver.close();

					}

				}
			}
		}
	}
}

