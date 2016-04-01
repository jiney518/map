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
		driver.findElement(By.id("search-input")).sendKeys("그린팩토리");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//업체 상세 페이지 오픈 	
				for(String winHandle : driver.getWindowHandles()){
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
		Thread.sleep(2000);		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();		
		Assert.assertEquals("찾아가는 길", driver.findElement(By.xpath("//div[@id='_baseInfo']/div[4]/h3/span")).getText());
		 System.out.println("찾아가는길 노출 확인");
		
		//평가탭
		driver.findElement(By.xpath("//li[@id='_review']/a")).click();
		
		//평점 선택 
		driver.findElement(By.xpath("//div[@id='s2']/div[1]/div")).click();
		driver.switchTo().alert().accept();
	
		//로그인 페이지
		 driver.findElement(By.id("id")).click();
		 driver.findElement(By.id("id")).sendKeys("nvqa_2tc028");
		 driver.findElement(By.id("pw")).click();
		 driver.findElement(By.id("pw")).sendKeys("qalab123");
		 driver.findElement(By.className("btn_login")).click();
		 System.out.println("평점탭_로그인 성공");
		 
		 driver.findElement(By.xpath("//li[@id='_review']/a")).click();
		 
		 driver.findElement(By.xpath("//div[@id='s2']/div[1]/div")).click();
		 driver.findElement(By.xpath("//div[@id='s2']/div[2]/div/ul/li[1]/span/span")).click();
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[2]/textarea")).click();
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[2]/textarea"))
		 .sendKeys("경기도 성남시 분당구 불정로 6 NAVER 그린팩토리");
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[2]/div/div/div/form/fieldset/div/div/table/tbody/tr[1]/td[3]/input")).click();
		 Thread.sleep(2000);
		 //평가글 삭제
		 driver.findElement(By.xpath("//div[@id='cbox_module']/div[3]/ul/li[1]/div/div[3]/div[2]/span/a")).click();
		 driver.switchTo().alert().accept();
		 System.out.println("평가글 삭제 성공");
		 
		 driver.close();
		 driver.switchTo().window(winHandlemain);
		 
		 driver.findElement(By.id("search-input")).clear();
		 driver.findElement(By.id("search-input")).sendKeys("스타벅스 정자점");
		 driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		 driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		 Thread.sleep(3000);
				 
		 //카드 버튼 클릭 
		 driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/span/a[1]")).click();
		 
		//업체 상세 페이지 오픈 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
		Assert.assertEquals("카드혜택", driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[4]/a/strong")).getText());
		
		//상세정보탭
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		//가격표
		driver.findElement(By.xpath("//dd[@id='_menuImageViewerLayer']/a[1]/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_menuImageViewer']/div[1]/a[3]")).click();
		driver.findElement(By.xpath("//dd[@id='_menuImageViewerLayer']/div/a")).click();
		
		//리뷰/방문기
		driver.findElement(By.xpath("//li[@id='_visit']/a/strong")).click();
		driver.findElement(By.xpath("//div[@id='_visitPaginate']/div/a[5]")).click();
		driver.findElement(By.xpath("//div[@id='_visitPaginate']/div/a[6]")).click();
		
		//상세정보탭
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
		
		//길찾기
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[2]/div[1]/a")).click();
	
		
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("고속터미널역");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//업체 상세 페이지 오픈 	
				for(String winHandle : driver.getWindowHandles()){
					driver.switchTo().window(winHandle);
					driver.manage().window().maximize();
				}
		Thread.sleep(2000);		 
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
	
		//지하철 길찾기
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[1]/span/input")).sendKeys("건대입구");
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[1]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dgInpRoS0_start']")).click();
		
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[3]/span/input")).sendKeys("혜화역");
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[2]/div[3]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='dgInpRoS0_end']")).click();
		Thread.sleep(2000);
		
		//요금계산
		driver.findElement(By.xpath("//div[@id='_subwayRouteBase']/div/fieldset/ul/li[3]/a[2]")).click();		
		Thread.sleep(3000);
		
		//출구/연계버스탭
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
		//첫차/막차시간탭
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
		System.out.println("IE 오픈 성공");
				
	}

  @AfterTest
  public void afterTest() {
	  System.out.println("tearDown");
	    driver.close();
	    driver.quit();
		}


}
