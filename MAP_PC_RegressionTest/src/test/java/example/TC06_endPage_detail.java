package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC06_endPage_detail {
	
	private static WebDriver driver;
	
  @Test
  public void tc011() throws Exception{
		
		String winHandlemain = driver.getWindowHandle();
		
   	driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�׸����丮");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//��ü �� ������ ���� 	
				for(String winHandle : driver.getWindowHandles()){
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();		
		Assert.assertEquals("ã�ư��� ��", driver.findElement(By.xpath("//div[@id='_baseInfo']/div[4]/h3/span")).getText());
		 System.out.println("ã�ư��±� ���� Ȯ��");
		
		//����
		driver.findElement(By.xpath("//li[@id='_review']/a")).click();
		
		//���� ���� 
		driver.findElement(By.xpath("//div[@id='s2']/div[1]/div")).click();
		driver.switchTo().alert().accept();
	
		//�α��� ������
		 driver.findElement(By.id("id")).click();
		 driver.findElement(By.id("id")).sendKeys("nvqa_2tc028");
		 driver.findElement(By.id("pw")).click();
		 driver.findElement(By.id("pw")).sendKeys("qalab123");
		 driver.findElement(By.className("btn_login")).click();
		 System.out.println("������_�α��� ����");
		 
		 driver.findElement(By.xpath("//li[@id='_review']/a")).click();
		 
		 driver.findElement(By.xpath("//div[@id='s2']/div[1]/div")).click();
		 driver.findElement(By.xpath("//div[@id='s2']/div[2]/div/ul/li[1]/span/span")).click();
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[2]/textarea")).click();
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[2]/textarea"))
		 .sendKeys("��⵵ ������ �д籸 ������ 6 NAVER �׸����丮");
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[3]/input")).click();
		 Thread.sleep(2000);
		 //�򰡱� ����
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[3]/ul/li[1]/div/div[3]/div[2]/span/a")).click();
		 driver.switchTo().alert().accept();
		 System.out.println("�򰡱� ���� ����");
		 
		 driver.close();
		 driver.switchTo().window(winHandlemain);
		 
		 driver.findElement(By.id("search-input")).clear();
		 driver.findElement(By.id("search-input")).sendKeys("��Ÿ���� ������");
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		 driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		 Thread.sleep(3000);
				 
		 //ī�� ��ư Ŭ�� 
		 driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/span/a[1]")).click();
		 
		//��ü �� ������ ���� 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
		Assert.assertEquals("ī������", driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[4]/a/strong")).getText());
		
		//��������
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		//����ǥ
		driver.findElement(By.xpath("//dd[@id='_menuImageViewerLayer']/a[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_menuImageViewer']/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//dd[@id='_menuImageViewerLayer']/div/a")).click();
		
		//����/�湮��
		driver.findElement(By.xpath("//li[@id='_visit']/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_visitPaginate']/div/a[5]")).click();
		driver.findElement(By.xpath("//div[@id='_visitPaginate']/div/a[6]")).click();
		
		//��������
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		
		//��ã��
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[2]/div[1]/a")).click();
	
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("����͹̳ο�");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//��ü �� ������ ���� 	
				for(String winHandle : driver.getWindowHandles()){
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
		Thread.sleep(2000);		 
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
	
		//����ö ��ã��
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[1]/span/input")).sendKeys("�Ǵ��Ա�");
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[1]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dgInpRoS0_start']")).click();
		
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[3]/span/input")).sendKeys("��ȭ��");
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[3]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dgInpRoS0_end']")).click();
		Thread.sleep(2000);
		
		//��ݰ��
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[3]/a[2]")).click();		
		Thread.sleep(3000);
		
		//�ⱸ/���������
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[2]/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_mainTabContents']/div[2]/div/div/table/tbody/tr[2]/th/a")).click();
		Thread.sleep(3000);
		
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
		}
		//driver.close();
		driver.switchTo().window(winHandlemain);			
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//div[@id='container']/div/div[1]/div[1]/h1")).click();
		//ù��/�����ð���
		//driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[3]/a/strong")).click();
		
				
		
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
