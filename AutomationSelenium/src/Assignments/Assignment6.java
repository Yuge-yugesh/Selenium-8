package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
	}
}
