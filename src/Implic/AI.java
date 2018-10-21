package Implic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AI {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.actitime.com");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		// while (true) {
		for (int i = 1; i <= 3; i++) {
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("Logout link is present & click it");
				break;

			} catch (Exception e) {
				System.out.println("Logout link is not present");
			}

		}
		driver.close();
	}

}
