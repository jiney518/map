
import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;


//MAP_SUS_4700~MAP_SUS_4875
public class TC01_indoor_map {

private static WebDriver driver;	

	
 @Before
	public void openBrower(){
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\jiney\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(dc);
		driver.get("http://stg.map.naver.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
		System.out.println("IE ���� ����");
				
	}

	
	
	@Test
	public void tc001() throws Exception  {
		
		String winHandlemain = driver.getWindowHandle();
		
		WebElement traffic = driver.findElement(By.xpath("//div[@id='snb']/div[2]/ul/li[1]/a"));
		WebElement cadastral = driver.findElement(By.xpath("//div[@id='snb']/div[2]/ul/li[5]/a"));
		WebElement satellite = driver.findElement(By.xpath("//div[@id='snb']/div[3]/ul/li[2]/a"));
		WebElement bicycle = driver.findElement(By.xpath("//div[@id='snb']/div[2]/ul/li[3]/a"));
		WebElement mDefault = driver.findElement(By.xpath("//div[@id='snb']/div[3]/ul/li[1]/a"));
		
		WebElement zoominBtn = driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[3]/a[1]"));
		
	/*	mDefault.click();
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�Ե������");
		driver.findElement(By.xpath("//div[@id='header']/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a/b")).click();
		WebElement zoominBtn = driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[3]/a[1]"));
		for (int i=0; i<4 ; i++){
			zoominBtn.click();
		}
		System.out.println("�ǳ����� only mode ����");	
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[3]/div[1]/dl/dt/a")).click();
		System.out.println("�ǳ����� ���� �ȳ� �޽��� ����");
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();
		
		bicycle.click();
		
		for (int i=0; i<2 ; i++){
			zoominBtn.click();
		}
		
		System.out.println("�ǳ����� only mode: ������ �ɼ� ����");
			
		traffic.click();
		cadastral.click();
		satellite.click();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\indoorMap_off.png"));	
		Thread.sleep(2000);
		
		traffic.click();
		cadastral.click();
		mDefault.click();*/
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�־ȿ����ϻ�");
		driver.findElement(By.xpath("//div[@id='header']/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[7]/a")).click();
		System.out.println("�־ȿ����ϻ�- �����ȳ� Ŭ��");
		
		Thread.sleep(2000);
		//�ǳ��� ��ư Ŭ�� 
		driver.findElement(By.xpath("//div[@id='aside']/div[5]/div/div[1]/div[3]/div[1]/ul[1]/li[5]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='snb_view']/a")).click();
		driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[5]/div[1]/a[1]")).click();
		
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\aroundInfo_On.png"));	
		Thread.sleep(2000);
		
		rightClick(driver.findElement(By.xpath("//div[@id='traffic_1_181312']/span/a")));
		driver.findElement(By.xpath("//div[@id='map_area']/div[3]/div[1]/div[1]/ul[4]/li[1]/a")).click();
		
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("����Ƹ��� �ڿ���");
		driver.findElement(By.xpath("//div[@id='header']/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[7]/a")).isEnabled());
		System.out.println("�ڿ��� ����Ƹ��� �ǳ����� Ȱ��ȭ OK");
		
		zoominBtn.click();
		zoominBtn.click();
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("Ĳ�� �����ȭ�� ����������");
		driver.findElement(By.xpath("//div[@id='header']/div[1]/fieldset/button")).click();
		
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[1]/div[2]/div[2]/a")).click();
		
		Thread.sleep(3000);	
		//��ü �� ������ ���� 	
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}
		
		Thread.sleep(3000);	
		
		driver.findElement(By.xpath("//div[@id='_title']/h1")).click();
		//�ǳ��� ��ư Ŭ�� 
		driver.findElement(By.xpath("//div[@id='_title']/div/div[1]/ul/li[1]/a")).click();
		
		if(driver.findElement(By.xpath("//div[@id='simplemodal-data']")).isEnabled()){
			driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[8]/div[1]/a[9]")).click();
		System.out.println("�̴ϸ� ���� �̵� OK");
	
	
}
	
	//��Ŭ�� action
	public void rightClick(WebElement element) {
		try {
			Actions action = new Actions(driver).contextClick(element);
			action.build().perform();

			System.out.println("Sucessfully Right clicked on the element");
		} catch (StaleElementReferenceException e) {
			System.out.println("Element is not attached to the page document "
					+ e.getStackTrace());
		} catch (NoSuchElementException e) {
			System.out.println("Element " + element + " was not found in DOM "
					+ e.getStackTrace());
		} catch (Exception e) {
			System.out.println("Element " + element + " was not clickable "
					+ e.getStackTrace());
		}
	}
	
	

	@After
	public void tearDown() throws Exception {
		
	    System.out.println("tearDown");
	   // driver.close();
	    //driver.quit();
	}
	
}