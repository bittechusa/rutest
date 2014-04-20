import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SaturdatClassTest
{
	WebDriver driver =new FirefoxDriver();
	
	@Before
	public void openUrl()
	{
		driver.get("http://www.bluefly.com");
	}
	
	@After
	public void closeUrl() throws Exception
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
	@Test
	public void Test1()
	{
		driver.findElement(By.xpath("//*[@id='main-nav-men']/a")).click();
		driver.findElement(By.xpath("//*[@id='departmentCrossSellContainer']/div[2]/div[1]/a/img")).click();	
		
//		driver.findElement(By.xpath("//*[@id='department-featured-wrapper']/div/a/img")).click();
//		driver.findElement(By.xpath("//*[@id='334090401']/div[1]/a/img")).click();
		
	}

}
