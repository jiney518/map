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
		
		
		//길찾기탭 클릭
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("그린팩토리");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("부천역 1호선");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		Thread.sleep(3000);
		
		//경유지추가
		WebElement viaBtn = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[1]"));
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("서울대학교");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).sendKeys("신림역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).sendKeys("고려대학교 구로병원");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/span/input")).sendKeys(Keys.ENTER);
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).sendKeys("까치산역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/input")).sendKeys(Keys.ENTER);		
		viaBtn.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/span/input")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[6]/span/input")).sendKeys("경인여자대학교");
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
		
		//경유지추가 6회 시도
		rightClick(driver.findElement(By.xpath("//div[@id='naver_map']/div[1]/div[1]/img[8]")));
		driver.findElement(By.xpath("//div[@id='map_area']/div[3]/div[1]/div[1]/ul[1]/li[2]/a")).click();	
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//경유지 삭제
		//WebElement viaDel = 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/a")).click();
		
		//출발, 도착지 드래그&드롭으로 변경
		WebElement start = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span/a[2]"));
		WebElement end = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[5]/span/a[2]"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(start, end).build().perform();
		
		Thread.sleep(3000);
		
		//지우기 버튼 클릭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		Assert.assertEquals("최근검색", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div/div[1]/ul/li[1]/a")).getText());
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("63스퀘어");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("송도파크빌리지");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(3000);
		//길찾기 메뉴 재클릭
		//driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		//타메뉴 이동 후 길찾기 메뉴 재진입
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals("자동차 전용 제외", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[4]/a")).getText());
		
		
		
		//driver.close();		
		
	}
	
	@Test
	public void tc003() throws Exception{
		String winHandlemain = driver.getWindowHandle();
		
		//대중교통탭으로 이동
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
				
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("강남역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("부천역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(3000);		
				
			
		//타메뉴 이동 후 대중교통 재진입
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[1]/a")).click();
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("고려대학교");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		//요약레이어 오픈
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/dl/dt/a")).click();
		
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		Assert.assertEquals("시내교통", (driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul[1]/li[1]/a")).getText()));
		
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[1]/a")).click();
		Assert.assertEquals("추천", driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[1]")).getText());
		
		//즐겨찾기 클릭
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
		
		//이미 등록되어 있을 경우, 팝업 노출 케이스
		try {
			driver.findElement(By.xpath("//div[@id='simplemodal-data']/div[2]/a")).click();			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("즐겨찾기 등록");
		}
		
		//경로1 상세 열기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		//출발지 클릭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/div[1]/div[1]/div")).click();

	
		//즐겨찾기 삭제
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[1]/a")).click();
		//실시간 교통정보 포함 uncheck
		driver.findElement(By.xpath("//input[@id='incRealtimeInfo']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='incRealtimeInfo']")).click();
		
		//경로1 상세 열기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[6]/div[1]/div[2]/strong")).click();
		//거리뷰 버튼
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/ul/li[6]/div[2]/p/a")).click();
		//레이어 닫기
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
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("코엑스");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("인천공항");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		
		//무료탭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();		
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("무료 도로를 이용한 길찾기 결과가 없습니다."));

		WebElement endPlace = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input"));
		WebElement delBtn = driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/a[1]"));
		
		Actions action = new Actions(driver);
		action.moveToElement(endPlace).perform();
		Thread.sleep(2000);
		delBtn.click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("코엑스");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		
		//추천탭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("출발지와 도착지가 동일합니다. 확인 후 다시 지정해주세요."));
		
		//지우기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("어린이대공원");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("세종대학교");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		
			/*//지도 축소
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
		
		//대중교통탭 
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("어린이대공원");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("세종대학교");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		Thread.sleep(2000);
		Assert.assertTrue(driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/p")).
				getText().equals("출발지와 도착지 간의 직선거리가 700m 미만인 경우, 결과를 제공하지 않습니다."));
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("그린팩토리");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("가산디지털단지역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		//버스탭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[4]/a")).click();
		
		//상세 열기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[6]/a")).click();
		//도보영역 상세 펼침
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[2]/div[2]/p/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[3]/ul/li[5]/div[1]/div[3]/a")).click();
		//전체 경로보기
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/ul/li[3]/a")).click();
		//실시간 노선
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[8]/div[2]/p/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='aside']/div[3]/a")).click();
		//운행시간
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[4]/div[2]/p/a[2]")).click();
		//driver.switchTo().alert();
		//거리뷰
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[11]/div[1]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[7]/ul/li[11]/div[2]/p/a")).click();
		//레이어 닫기
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/a")).click();		
		
		//시외구간
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[2]")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("강남역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("전주역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		
		//상세
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/a")).click();
		//다른 경로
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/div[2]/div[2]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[3]/div[2]/ul/li[3]/a")).click();
		
	}
	
	@Test
	public void tc006() throws Exception{
		driver.findElement(By.xpath("//div[@id='nav']/ul/li[2]/a")).click();
		
		//자전거탭
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys("세곡초등학교");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys("수원역");
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/span/input")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[1]/div[1]/div[2]/a[3]")).click();
		
		Thread.sleep(2000);
		//팝업 닫기
		driver.findElement(By.xpath("//div[@id='simplemodal-data']/div[3]/div[3]/a")).click();
		//정보 제공의 한계, 책임
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/div/div[2]/a")).click();
		//driver.findElement(By.xpath(""))
		
	}
	
	
	
	
	
	//우클릭 action
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
		System.out.println("IE 오픈 성공");
				
	}

  @AfterTest
  public void afterTest() {
	    System.out.println("tearDown");
	   driver.close();
	   driver.quit();
	}
}
