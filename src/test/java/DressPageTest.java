import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DressPageTest {

	WebDriver driver;
	@BeforeMethod
	public void launch(){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kitty\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	driver.manage().window().maximize();
	}
	
	@DataProvider(name="Verify Login")
	public Object[][] getData(){
		Object[][] data =new Object[3][2];
		
		data[0][0]= "Amin";
		data[0][1]= "admin123";
				
		data[1][0]= "hgyf";
		data[1][1]= "hftdf";
		
		data[2][0]= "uname";
		data[2][1]= "psw3";		
				
		return data;
		
	}
	
	
	@Test(dataProvider="Verify Login")
	
	public void verifyLogi(String UserName,String Password){
		driver.findElement(By.id("txtUsername")).sendKeys(UserName);
		driver.findElement(By.id("txtPassword")).sendKeys(Password);
		driver.findElement(By.id("btnLogin")).click();
		driver.close();
				}


	}

