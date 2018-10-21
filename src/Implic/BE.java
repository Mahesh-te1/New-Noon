package Implic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BE {
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
			String title = driver.getTitle();
			if (title.contains("Enter")) {
				System.out.println(title);
				break;

			} else {
				System.out.println("still in loginpage: Iteration--->" + i);

			}
		}
		driver.close();

	}

}
