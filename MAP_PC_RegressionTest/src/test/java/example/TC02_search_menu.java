package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class TC02_search_menu {
	
	private static WebDriver driver;	
	
  @Test
  public void tc007() throws Exception{
		
		
		//�˻� �޴� �� 
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		
		//���� 
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("���ڵ�");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/p[2]/a")).click();
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�߾ӵ�");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		
		Thread.sleep(2000);
		
		//���� �˻��� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[1]/a[2]")).click();
		
		//�ּ��� 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/a")).click();		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div[1]/div[2]/a")).click();
		
		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\addressTab.png"));	
		
		Thread.sleep(2000);
		//�ֿ���� Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[5]/div[1]/dl/dd[2]/a[3]")).click();
		//System.out.println( driver.findElement(By.id("search-input")).getAttribute("value"));
		Assert.assertEquals("���δ��б� �ڹ���",driver.findElement(By.id("search-input")).getAttribute("value"));
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("��걸 ��굿2�� ��1-3");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		//���θ�+ ��ư Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div[1]/div[3]/div/a[1]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div[1]/div[3]/div/a[2]")).click();
		
		//��෹�̾� > ������
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[2]/div[1]/ul/li[1]")).click();
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("���ڵ�");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		
		//�����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[2]/a")).click();
		//�ߺ�������
		WebElement duplicationBox =driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[3]/h2/select"));		
		Select dropDown1 = new Select(duplicationBox);
		dropDown1.selectByIndex(2);
		
		//������ �ɼ�
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[3]/div[1]/a[1]/span")).click();
		//�Ÿ��� �ɼ�
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		//�ٴٹٶ�� Ŭ�� 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		//��෹�̾� �ݱ�
		//driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[3]")).click();
		
		//������ �׺���̼� 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/div/a[5]")).click();
		
		driver.navigate().refresh();
		

		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�λ絿");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		
		Thread.sleep(2000);
		//������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[3]/a")).click();		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[3]/ul/li[1]/a")).click();

		//������ȣ 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div[2]/div/ul/li[8]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/a")).click();
		//����������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[4]/div[2]/div/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div[1]/div[2]/a[1]")).click();
		
		//���� ��ȣ �˻�
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("8106");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div/div[1]/a")).click();
		
	}
	
	@Test
	public void tc008() throws Exception{
		
		//tab ���� ���� ���̽�
   	driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("������ ����");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		Assert.assertEquals("���", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[1]/ul/li/a")).getText());
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("���굿");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		Assert.assertEquals("�ּ�", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[1]/a")).getText());
		Assert.assertEquals("���", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[2]/a")).getText());
		Assert.assertEquals("����", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div[2]/ul/li[3]/a")).getText());
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("dfesafsfdsd");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/p")).getText());
	
		/*//19�� �˻��� �Ұ� 
		  driver.findElement(By.id("search-input")).clear();
		  driver.findElement(By.id("search-input")).sendKeys("��η�");
		  driver.findElement(
		  By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		  Thread.sleep(5000);

		  driver.switchTo().defaultContent();
		  driver.findElement(By.id("id")).click();
		  driver.findElement(By.id("id")).sendKeys("nvqa_2tc028");
		  driver.findElement(By.id("pw")).click();
		  driver.findElement(By.id("pw")).sendKeys("qalab123");
		  driver.findElement(By.className("btn_login")).click();*/
		
		
		
	}
	
	
  @BeforeTest
  public void beforeTest() {
	  
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
