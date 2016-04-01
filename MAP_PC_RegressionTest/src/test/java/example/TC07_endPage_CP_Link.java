package example;

import org.testng.annotations.Test;
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
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TC07_endPage_CP_Link {
	
	private static WebDriver driver;	
	
  @Test
  public void tc012() throws Exception{
		
		String winHandlemain = driver.getWindowHandle();
		
		/* ******* ���� ����***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("��Ű������");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		
		//��ü �� ������ ���� 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}			

		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile5, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\market_img.png"));	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();		
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[1]/dl/dd[1]/a")).click();
		System.out.println("���鰡�� ��ü Ȩ������ Ŭ��");
		Thread.sleep(3000);
		driver.close(); // ��ü �������� ���� 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(3000);
	
		/* ******* �߳��� ***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("ť�����");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}
		
		File scrFile2 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile2, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\yanolga_img.png"));	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[1]/dl/dd[1]/a")).click(); 
		System.out.println("�߳��� ��ü Ȩ������ Ŭ��");	
		Thread.sleep(2000);
		driver.close(); // ��ü �������� ���� 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);
		
			 
		 /* ****** �ǰ����� �ɻ��򰡿� ********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("������б�����");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//��ü �� ������ ���� 	
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}

		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\health insurance_img.png"));	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='_hira']/div/div[2]/a/img")).click();
		System.out.println("�ǰ�����ɻ��򰡿� Ȩ������ Ŭ��");
		driver.close();
		driver.switchTo().window(winHandlemain);
		Thread.sleep(3000); 
		
		
		
	}
		
		@Test
		public void tc013() throws Exception{
			
		String winHandlemain = driver.getWindowHandle();
		
		/****** ���� **********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("žġŲ");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div[1]/dl/dt/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();		

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);	
			driver.manage().window().maximize();	
		}
		
		File scrFile8 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile8, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\yougiyo_img.png"));	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		Assert.assertEquals("�ּ��ֹ��ݾ�", driver.findElement(By.xpath("//div[@id='_yogiyo']/div[1]/dl/dt[3]/span")).getText());
		
		//������ Ŭ��
		driver.findElement(By.xpath("//div[@id='_yogiyo']/div[1]/dl/dd[4]/a")).click();		
		Thread.sleep(3000);
		driver.close(); // ��ü �������� ���� 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);		
		
		
		/* ******* ����� ������***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�߿��ο�������");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div[1]/dl/dt/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li/div[2]/ul/li[4]/a")).click();
		

		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);	
			driver.manage().window().maximize();	
		}
			
		File scrFile4 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile4, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\car park_img.png"));	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[1]/div/span/a")).click();
		System.out.println("����� ������ ���� ������");
		Thread.sleep(3000);
		driver.close(); // ��ü �������� ���� 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);
		
		/* *********ķ���� *************/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("�ڶ�ķ����");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[1]/div[2]/div[2]/a")).click();

			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
			
		//Thread.sleep(3000);
		
		File scrFile7 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile7, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\campingZone_img.png"));	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[1]/div/a")).click();
		System.out.println("ķ���� Ȩ������ Ŭ��");
		Thread.sleep(3000);
		driver.close(); // ��ü �������� ���� 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);		
	}
	
	
	@Test
	public void tc014() throws Exception{
		
		String winHandlemain = driver.getWindowHandle();
	
	/* ****** ȣ���н� ***********/
	driver.findElement(By.id("search-input")).clear();
  driver.findElement(By.id("search-input")).sendKeys("�Ե���Ʈ����");
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebElement priceLink = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[2]/div[1]/dl/dt/span/a"));
	priceLink.click();

	for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
		driver.manage().window().maximize();
	}
	Thread.sleep(3000);
	
	File scrFile1 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	FileUtils.copyFile(scrFile1, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\hotelpass_img.png"));
	
	
	driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
	//ȣ���н� �� �Ǵ� ȣ�� ������ �� Ŭ��
	WebElement tab=driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a"));	
	tab.click();
	WebElement next_btn1 = driver.findElement(By.xpath("//div[@id='_imagehotelpass']/div[1]/a[2]"));
	WebElement next_btn2 = driver.findElement(By.xpath("//div[@id='_imagehotelenjoy']/div[1]/a[2]"));
	
	if(tab.getText().equals("ȣ�� �н�"))
	{	
		//�������� > ���� ��ư Ŭ�� 			
		for(int i=0; i<8; i++){
		Thread.sleep(2000);
		next_btn1.click();		
		}		
		System.out.println("ȣ���н� ���� ���� Ȯ��");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_hotelpass']/div[1]/dl/dd[4]/a")).click();	
		System.out.println("ȣ���н� ���� ������");
	}
	else if(tab.getText().equals("ȣ�� ������"))
	{
		for(int i=0; i<8; i++){
			Thread.sleep(2000);
			next_btn2.click();		
		}
		
		System.out.println("ȣ�ڿ����� ���� ���� Ȯ��");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_hotelenjoy']/div[1]/dl/dd[4]/a")).click();
		System.out.println("ȣ�ڿ����� ���� ������");
	}
	
	Thread.sleep(2000);
	driver.close(); // ��ü �������� ���� 
	driver.switchTo().window(winHandlemain);
	Thread.sleep(2000);
	
	/* *********��Ǻ� *************/
	driver.findElement(By.id("search-input")).clear();
	driver.findElement(By.id("search-input")).sendKeys("����������ƾ");
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
	driver.findElement(By.cssSelector("a[class='nclicks(plc.title,18890217,1,Y)']")).click();
	
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li/div[2]/ul/li[4]/a")).click();
	driver.findElement(By.cssSelector("a[class='spm spm_sw_detail _qbtn_detail nclicks(plc.detail)']")).click();

	//��ü �� ������ ���� 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
					
	driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
	
	//��Ǻ� �� Ŭ��
	driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a")).click();
	//���Ǻ� ����� Ŭ��
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/ul/li[1]/a/img")).click();
			
	//���ǻ����� Ŭ��
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/div/div/div[1]/a[2]")).click();
	//���� �̹���
	WebElement nextBtn =
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[2]"));
	
	for(int n=0; n<4; n++){
			nextBtn.click();
	}
	System.out.println("���ǻ��� ���� ��ư Ŭ�� ����");
	Thread.sleep(1000);
		
	File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	FileUtils.copyFile(scrFile6, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\pensionView_img.png"));	
		
		
	//�������� ������ ��ũ Ŭ��
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[5]/p[1]/a")).click();
	Thread.sleep(2000);
	driver.close(); // ��ü �������� ���� 
	driver.switchTo().window(winHandlemain);		
	Thread.sleep(2000);
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
