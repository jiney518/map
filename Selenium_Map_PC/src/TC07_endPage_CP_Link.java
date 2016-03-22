import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

//MAP_SUS_5770~MAP_SUS_5830
public class TC07_endPage_CP_Link {
	
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
	public void tc012() throws Exception{
		
		String winHandlemain = driver.getWindowHandle();
		
		/* ******* 나들 가게***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("럭키연쇄점");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		
		//업체 상세 페이지 오픈 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}			

		File scrFile5 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile5, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\market_img.png"));	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();		
		driver.findElement(By.xpath("//div[@id='_baseInfo']/div[1]/dl/dd[1]/a")).click();
		System.out.println("나들가게 업체 홈페이지 클릭");
		Thread.sleep(3000);
		driver.close(); // 업체 상세페이지 종료 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(3000);
	
		/* ******* 야놀자 ***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("큐브모텔");
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
		System.out.println("야놀자 업체 홈페이지 클릭");	
		Thread.sleep(2000);
		driver.close(); // 업체 상세페이지 종료 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);
		
			 
		 /* ****** 건강보험 심사평가원 ********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("서울대학교병원");
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[1]/div[2]/img")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='panel']/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div[2]/ul/li[4]/a")).click();
		
		//업체 상세 페이지 오픈 	
		for(String winHandle : driver.getWindowHandles()){
			driver.switchTo().window(winHandle);
			driver.manage().window().maximize();
		}

		File scrFile3 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		FileUtils.copyFile(scrFile3, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\health insurance_img.png"));	
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a")).click();
		driver.findElement(By.xpath("//div[@id='_hira']/div/div[2]/a/img")).click();
		System.out.println("건강보험심사평가원 홈페이지 클릭");
		driver.close();
		driver.switchTo().window(winHandlemain);
		Thread.sleep(3000); 
		
		
		
	}
		
		@Test
		public void tc013() throws Exception{
			
		String winHandlemain = driver.getWindowHandle();
		
		/****** 요기요 **********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("탑치킨");
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
		Assert.assertEquals("최소주문금액", driver.findElement(By.xpath("//div[@id='_yogiyo']/div[1]/dl/dt[3]/span")).getText());
		
		//더보기 클릭
		driver.findElement(By.xpath("//div[@id='_yogiyo']/div[1]/dl/dd[4]/a")).click();		
		Thread.sleep(3000);
		driver.close(); // 업체 상세페이지 종료 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);		
		
		
		/* ******* 모두의 주차장***********/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("중원민영주차장");
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
		System.out.println("모두의 주차장 가격 더보기");
		Thread.sleep(3000);
		driver.close(); // 업체 상세페이지 종료 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);
		
		/* *********캠핑존 *************/
		driver.findElement(By.id("search-input")).clear();
		driver.findElement(By.id("search-input")).sendKeys("자라섬캠핑장");
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
		System.out.println("캠핑존 홈페이지 클릭");
		Thread.sleep(3000);
		driver.close(); // 업체 상세페이지 종료 
		driver.switchTo().window(winHandlemain);
		Thread.sleep(2000);		
	}
	
	
	@Test
	public void tc014() throws Exception{
		
		String winHandlemain = driver.getWindowHandle();
	
	/* ****** 호텔패스 ***********/
	driver.findElement(By.id("search-input")).clear();
    driver.findElement(By.id("search-input")).sendKeys("롯데아트빌라스");
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
	//호텔패스 탭 또는 호텔 엔조이 탭 클릭
	WebElement tab=driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a"));	
	tab.click();
	WebElement next_btn1 = driver.findElement(By.xpath("//div[@id='_imagehotelpass']/div[1]/a[2]"));
	WebElement next_btn2 = driver.findElement(By.xpath("//div[@id='_imagehotelenjoy']/div[1]/a[2]"));
	
	if(tab.getText().equals("호텔 패스"))
	{	
		//사진정보 > 다음 버튼 클릭 			
		for(int i=0; i<8; i++){
		Thread.sleep(2000);
		next_btn1.click();		
		}		
		System.out.println("호텔패스 사진 정보 확인");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_hotelpass']/div[1]/dl/dd[4]/a")).click();	
		System.out.println("호텔패스 가격 더보기");
	}
	else if(tab.getText().equals("호텔 엔조이"))
	{
		for(int i=0; i<8; i++){
			Thread.sleep(2000);
			next_btn2.click();		
		}
		
		System.out.println("호텔엔조이 사진 정보 확인");		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='_hotelenjoy']/div[1]/dl/dd[4]/a")).click();
		System.out.println("호텔엔조이 가격 더보기");
	}
	
	Thread.sleep(2000);
	driver.close(); // 업체 상세페이지 종료 
	driver.switchTo().window(winHandlemain);
	Thread.sleep(2000);
	
	/* *********펜션뷰 *************/
	driver.findElement(By.id("search-input")).clear();
	driver.findElement(By.id("search-input")).sendKeys("오버더마운틴");
	driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/fieldset/button")).click();
	driver.findElement(By.cssSelector("a[class='nclicks(plc.title,18890217,1,Y)']")).click();
	
	Thread.sleep(3000);
	//driver.findElement(By.xpath("/html/body/div[5]/div[2]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/ul/li/div[2]/ul/li[4]/a")).click();
	driver.findElement(By.cssSelector("a[class='spm spm_sw_detail _qbtn_detail nclicks(plc.detail)']")).click();

	//업체 상세 페이지 오픈 	
			for(String winHandle : driver.getWindowHandles()){
				driver.switchTo().window(winHandle);
				driver.manage().window().maximize();
			}
					
	driver.findElement(By.xpath("//div[@id='_mainTabMenus']/ul/li[1]/a/strong")).click();
	
	//펜션뷰 탭 클릭
	driver.findElement(By.xpath("//ul[@id='_baseTabMenus']/li[1]/a")).click();
	//객실뷰 썸네일 클릭
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/ul/li[1]/a/img")).click();
			
	//객실사진탭 클릭
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/div/div/div[1]/a[2]")).click();
	//다음 이미지
	WebElement nextBtn =
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[1]/div[2]/div/div/div[2]/div[1]/div/div[1]/a[2]"));
	
	for(int n=0; n<4; n++){
			nextBtn.click();
	}
	System.out.println("객실사진 다음 버튼 클릭 성공");
	Thread.sleep(1000);
		
	File scrFile6 = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	FileUtils.copyFile(scrFile6, new File("C:\\Users\\Administrator\\Desktop\\jiney\\map_scrShot\\pensionView_img.png"));	
		
		
	//객실정보 더보기 링크 클릭
	driver.findElement(By.xpath("//div[@id='_uok']/div[2]/div[5]/p[1]/a")).click();
	Thread.sleep(2000);
	driver.close(); // 업체 상세페이지 종료 
	driver.switchTo().window(winHandlemain);		
	Thread.sleep(2000);
	}
	
	
	@After
	public void tearDown() throws Exception {
		
	    System.out.println("tearDown");
	    driver.close();
	    driver.quit();
	}
	

}
