package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class TC05_subway_menu {
	
	private static WebDriver driver;	
	
  @Test
  public void tc010() throws Exception{
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[4]/a")).click();
		WebElement departure = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/fieldset/div[1]/div[1]/span/input"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/fieldset/div[1]/div[2]/span/input"));
		
		departure.clear();
		departure.sendKeys("���ڿ�");
		departure.sendKeys(Keys.ENTER);
		destination.clear();
		destination.sendKeys("�����Ű����");
		Thread.sleep(2000);
		departure.sendKeys(Keys.ENTER);
		
		//����ö ��ã��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/fieldset/div[2]/a[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[4]/a")).click();
		//�ֱٰ˻�
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div/div[2]/ul/li/div/a")).click();
	
		Thread.sleep(2000);
		//������ Ŭ��
		driver.findElement(By.xpath("//div[@id='subway_info_layer']/div/div[7]/div/span[1]")).click();
		//���������� ����
		driver.findElement(By.xpath("//div[@id='subway_info_layer']/div[2]/div/div/div[2]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		//��෹�̾� > �����
		driver.findElement(By.xpath("//div[@id='subway_info_layer']/div[1]/div[4]/div/div[1]/a[2]")).click();
		
		departure.sendKeys("����͹̳�");
		departure.sendKeys(Keys.ENTER);
		destination.sendKeys("���빮��");
		Thread.sleep(2000);
		departure.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div/fieldset/div[2]/a[2]")).click();
		//�ɼ� > ��ü
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/div/a[2]")).click();
		//�ּ�ȯ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
		//�ð�����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/a/span")).click();
		driver.findElement(By.xpath("//div[@id='_drop_down_preset_type']/a/span[2]")).click();
		//�����ð�
		driver.findElement(By.xpath("//div[@id='_drop_down_preset_type']/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[4]/a")).click();		
		
	}
	
  @BeforeTest
	public void openBrower(){
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\jiney\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		//dc.setCapability(InternetExplorerDriver.ENABLE_ELEMENT_CACHE_CLEANUP, true);
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
