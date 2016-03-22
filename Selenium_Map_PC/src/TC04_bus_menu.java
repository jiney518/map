import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import junit.framework.Assert;

//MAP_SUS_2820~MAP_SUS_3210
public class TC04_bus_menu {
	
	private static WebDriver driver;	
	
	@Before
	public void openBrower(){
		
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Administrator\\Desktop\\jiney\\IEDriverServer.exe");
		DesiredCapabilities dc = DesiredCapabilities.internetExplorer();
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		driver = new InternetExplorerDriver(dc);
		driver.get("http://map.naver.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 		
		System.out.println("IE 오픈 성공");
				
	}
	
	@Test
	public void tc009() throws Exception{
		
		//버스 메뉴 클릭
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
		//인천광역시 선택
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[1]/div/ul/li[3]/a")).click();
		
		delResult.click();
		
		input.sendKeys("100");
		searchBtn.click();		
		Thread.sleep(2000);

		//페이지 네비게이션
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/div/a[5]")).click();
		//농어촌 선택
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/ul/li[7]/a")).click();	
		Thread.sleep(2000);
		Assert.assertEquals("첫차 10:35, 막차 10:35, 일 1회 운행", driver.findElement
				(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[3]/span")).getText());
		
		//전체유형 선택
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		
		Thread.sleep(2000);
		//버스 번호 클릭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[1]/a")).click();
		
		WebElement zoomBtn = driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[3]/a[1]"));
		zoomBtn.click();
		zoomBtn.click();
		
		//전체노선 클릭
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/div[1]/div[1]/a")).click();
		
		Thread.sleep(2000);
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\bus_all_Line.png"));	
		
		//광명사거리역 클릭
		driver.findElement(By.xpath("//li[@id='busstop-list-101322']/div/p")).click();
		Thread.sleep(2000);
		//업데이트 새로고침
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[2]/div[1]/a")).click();
		//거리뷰 클릭		
		driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[10]/div[3]/div/div/div[1]/div[2]/span[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();
		Thread.sleep(2000);
		
		//정보제공 확인
		Assert.assertEquals("경기도 버스종합상황실", driver.findElement(By.xpath("//div[@id='aside']/div[3]/div[3]/p/span[2]")).getText());
		
		//레이어 닫기
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/a")).click();
		
		//버스 정류장
		busStation.click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/a[1]")).click();
		//보내기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[3]")).click();
		
		zoomBtn.click();
		//인쇄
		driver.findElement(By.xpath("//div[@id='naver_map']/div[2]/div[2]/div[5]/a[1]")).click();
		
		//출발 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[3]/a")).click();
		
		delResult.click();
		Assert.assertEquals("최근검색", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div/div[1]/ul/li[1]/a")).getText());
		
		input.sendKeys("중앙동");
		input.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//버스정류장 중복지역명
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div/a/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/div/div/div/ul/li[3]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[3]/a")).click();
		Assert.assertEquals("'경기도 성남시 중원구 중앙동'", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/div/h4/strong")).getText());
		
		
	}
	
	@After
	public void tearDown() throws Exception {
		
	    System.out.println("tearDown");
	   driver.close();
	   driver.quit();
	}
	

}