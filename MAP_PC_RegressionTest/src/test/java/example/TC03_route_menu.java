package example;

import org.testng.annotations.Test;

import junit.framework.Assert;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;

public class TC03_route_menu {
	
	private static WebDriver driver;	
	
  @Test
  public void tc002() throws Exception{
		
		
		//��ã���� Ŭ��
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("�׸����丮");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("��õ�� 1ȣ��");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		Thread.sleep(3000);
		
		//�������߰�
		WebElement viaBtn = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("������б�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).sendKeys("�Ÿ���");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).sendKeys("������б� ���κ���");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).sendKeys("��ġ�꿪");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).sendKeys(Keys.ENTER);		
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/span/input")).sendKeys("���ο��ڴ��б�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/span/input")).sendKeys(Keys.ENTER);		
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		//driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[34]/div[1]/div[3]/a")).click();
		
		/*
		WebElement nextBtn = driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[4]/div/div/div[3]/a[2]"));
		
		for (int i=0; i<5; i++ ){
			Thread.sleep(2000);
			nextBtn.click();
		}*/
		
//		rightClick(driver.findElement(By.xpath("//div[@id='traffic_1_181312']/span/a")));
//		driver.findElement(By.xpath("//div[@id='map_area']/div[3]/div[1]/div[1]/ul[4]/li[1]/a")).click();

		Thread.sleep(3000);
		
		//�������߰� 6ȸ �õ�
		rightClick(driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[1]/img[8]")));
		driver.findElement(By.xpath("//div[@id='map_area']/div[3]/div[1]/div[1]/ul[1]/li[2]/a")).click();	
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//������ ����
		//WebElement viaDel = 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		
		//���, ������ �巡��&������� ����
		WebElement start = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span/a[2]"));
		WebElement end = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/a[2]"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(start, end).build().perform();
		
		Thread.sleep(3000);
		
		//����� ��ư Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		Assert.assertEquals("�ֱٰ˻�", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div/div[1]/ul/li[1]/a")).getText());
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("63������");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("�۵���ũ������");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(3000);
		//��ã�� �޴� ��Ŭ��
		//driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		//Ÿ�޴� �̵� �� ��ã�� �޴� ������
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals("�ڵ��� ���� ����", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[4]/a")).getText());
		
		
		
		//driver.close();		
		
	}
	
	@Test
	public void tc003() throws Exception{
		String winHandlemain = driver.getWindowHandle();
		
		//���߱��������� �̵�
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
				
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("������");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("��õ��");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(3000);		
				
			
		//Ÿ�޴� �̵� �� ���߱��� ������
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("������б�");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		//��෹�̾� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		Assert.assertEquals("�ó�����", (driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a")).getText()));
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[1]/a")).click();
		Assert.assertEquals("��õ", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[1]")).getText());
		
		//���ã�� Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/a")).click();

		Thread.sleep(2000);	
		
		for(String winHandle : driver.getWindowHandles()){
		driver.switchTo().window(winHandle);
		}
		Thread.sleep(2000);	
		
		driver.findElement(By.id("id")).click();
		driver.findElement(By.id("id")).sendKeys("nvqa_2tc028");
		driver.findElement(By.id("pw")).sendKeys("qalab123");
		driver.findElement(By.className("int_jogin")).click();		
		driver.switchTo().window(winHandlemain);
		
		Thread.sleep(3000);	
		
		//�̹� ��ϵǾ� ���� ���, �˾� ���� ���̽�
		try {
			driver.findElement(By.xpath("//div[@id='simplemodal-data']/div[2]/a")).click();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���ã�� ���");
		}
		
		//���1 �� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		//����� Ŭ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/div[1]/div[1]/div")).click();

	
		//���ã�� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/a")).click();
		//�ǽð� �������� ���� uncheck
		driver.findElement(By.xpath("//input[@id='incRealtimeInfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='incRealtimeInfo']")).click();
		
		//���1 �� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[6]/div[1]/div[2]/strong")).click();
		//�Ÿ��� ��ư
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[6]/div[2]/p/a")).click();
		//���̾� �ݱ�
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\route_roadmap.png"));	
		Thread.sleep(2000);
		
		//CCTV
		//driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[35]/div[2]/p/a[1]")).click();
	}
	
	@Test
	public void tc004() throws Exception{
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("�ڿ���");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("��õ����");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		
		//������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();		
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("���� ���θ� �̿��� ��ã�� ����� �����ϴ�."));

		WebElement endPlace = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input"));
		WebElement delBtn = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/a[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(endPlace).perform();
		Thread.sleep(2000);
		delBtn.click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("�ڿ���");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		
		//��õ��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("������� �������� �����մϴ�. Ȯ�� �� �ٽ� �������ּ���."));
		
		//�����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("��̴����");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("�������б�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		
			/*//���� ���
		WebElement zoomoutBtn =driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[3]/a[2]"));
		zoomoutBtn.click();
		zoomoutBtn.click();*/
		
		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\route_lineCheck.png"));	
			
	}
	
	@Test
	public void tc005() throws Exception{
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		//���߱����� 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("��̴����");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("�������б�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("������� ������ ���� �����Ÿ��� 700m �̸��� ���, ����� �������� �ʽ��ϴ�."));
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("�׸����丮");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("��������д�����");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		//������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[4]/a")).click();
		
		//�� ����
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[6]/a")).click();
		//�������� �� ��ħ
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[2]/div[2]/p/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[3]/ul/li[5]/div[1]/div[3]/a")).click();
		//��ü ��κ���
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		//�ǽð� �뼱
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[8]/div[2]/p/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/a")).click();
		//����ð�
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[4]/div[2]/p/a[2]")).click();
		//driver.switchTo().alert();
		//�Ÿ���
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[11]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[11]/div[2]/p/a")).click();
		//���̾� �ݱ�
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();		
		
		//�ÿܱ���
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("������");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("���ֿ�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		//��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		//�ٸ� ���
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/div[2]/ul/li[3]/a")).click();
		
	}
	
	@Test
	public void tc006() throws Exception{
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		//��������
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("�����ʵ��б�");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("������");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		//�˾� �ݱ�
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/div[3]/div[3]/a")).click();
		//���� ������ �Ѱ�, å��
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/div[2]/a")).click();
		//driver.findElement(By.xpath(""))
		
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
