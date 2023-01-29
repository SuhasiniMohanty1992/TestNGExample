package TestNG.Example;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class NewTest {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();
	WebDriver driver = new ChromeDriver();
	@BeforeTest
	public void beforeTest() {
		System.out.println("I am executing before Test");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pooja\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
	}

	@Test
	public void myTestMethod() {

		System.out.println("I am executing Test");
		driver.navigate().to("http://www.facebook.com/");

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		
		//driver.findElement(By.id("pass")).sendKeys("9776859171");
		
		//driver. findElement(By.name("login")).click();

	}
	
	@AfterTest
	public void afterTest()
	{
		driver.close();
		System.out.println("After Test");
	}
}
