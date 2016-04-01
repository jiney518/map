package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class TC04_bus_menu {
	
	private static WebDriver driver;	
	
  @Test
  public void tc009() throws Exception{
		
		//���� �޴� Ŭ��
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[3]/a")).click();
		WebElement busNum = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/form/div/a[1]"));
		WebElement busStation = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/form/div/a[2]"));
		WebElement input = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/form/fieldset/span/span/input"));
		WebElement searchBtn = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/form/fieldset/span/button"));
		WebElement delResult = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/form/fieldset/a"));
		
		input.sendKeys("800");
		Thread.sleep(1000);
		searchBtn.click();		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/a/span[2]")).click();
		//��õ������ ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/a")).click();
		
		delResult.click();
		
		input.sendKeys("100");
		searchBtn.click();		
		Thread.sleep(2000);

		//������ �׺���̼�
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/div/a[5]")).click();
		//����� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/ul/li[7]/a")).click();	
		Thread.sleep(2000);
		Assert.assertEquals("ù�� 10:35, ���� 10:35, �� 1ȸ ����", driver.findElement
				(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[3]/span")).getText());
		
		//��ü���� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		//���� ��ȣ Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[1]/a")).click();
		
		WebElement zoomBtn = driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[3]/a[1]"));
		zoomBtn.click();
		zoomBtn.click();
		
		//��ü�뼱 Ŭ��
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/div[1]/div[1]/a")).click();
		
		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\bus_all_Line.png"));	
		
		//�����Ÿ��� Ŭ��
		driver.findElement(By.xpath("//li[@id='busstop-list-101322']/div/p")).click();
		Thread.sleep(2000);
		//������Ʈ ���ΰ�ħ
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[2]/div[1]/a")).click();
		//�Ÿ��� Ŭ��		
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[1]/div[2]/span[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();
		Thread.sleep(2000);
		
		//�������� Ȯ��
		Assert.assertEquals("��⵵ �������ջ�Ȳ��", driver.findElement(By.xpath("//div[@id='aside']/div[3]/div[3]/p/span[2]")).getText());
		
		//���̾� �ݱ�
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/a")).click();
		
		//���� ������
		busStation.click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/a[1]")).click();
		//������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[3]")).click();
		
		zoomBtn.click();
		//�μ�
		driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[5]/a[1]")).click();
		
		//��� 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[3]/a")).click();
		
		delResult.click();
		Assert.assertEquals("�ֱٰ˻�", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div/div[1]/ul/li[1]/a")).getText());
		
		input.sendKeys("�߾ӵ�");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//���������� �ߺ�������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div/div/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[3]/a")).click();
		Assert.assertEquals("'��⵵ ������ �߿��� �߾ӵ�'", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/h4/strong")).getText());
		
		
	}
	
  @BeforeTest
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
	

  @AfterTest
  public void afterTest() {
	  
	    System.out.println("tearDown");
		   driver.close();
		   driver.quit();
	
  }

}
