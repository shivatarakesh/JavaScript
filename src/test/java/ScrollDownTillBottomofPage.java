

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDownTillBottomofPage {

	@Test
	public void ScrollDownTillBottomOfPage() throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/scroll/newInfinite']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/scroll/newTabInfinite']")).click();
		String parent = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if (id.equals(parent)) {
			} else {
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.quit();
		
	
	}
	
	@Test
	public void ScrollTillElement() throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]' and text()='Scroll']")).click();
		driver.findElement(By.xpath("//a[text()='Vertical']")).click();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr=ids.iterator();
		while(itr.hasNext()) {
			String windowid=itr.next();
			driver.switchTo().window(windowid);
			String acturl=driver.getCurrentUrl();
			if(acturl.contains("ui/scroll/newTabVertical")) {
				break;
			}
		}
		
//		String parent = driver.getWindowHandle();
//		Set<String> ids = driver.getWindowHandles();
//		for (String id : ids) {
//			if (id.equals(parent)) {
//			} else {
//				driver.switchTo().window(id);
//			}
//		}
		
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='I have read all the terms and conditions']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()",ele);
		driver.quit();
		
	}
	
	@Test
	public void clickAnElement() throws InterruptedException   {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[@class='poppins text-[14px]' and text()='Scroll']")).click();
		driver.findElement(By.xpath("//a[text()='Vertical']")).click();
		driver.findElement(By.xpath("//a[text()='Open In New Tab']")).click();
		String parent = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if (id.equals(parent)) {
			} else {
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[text()='I have read all the terms and conditions']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()",ele);
		driver.quit();
		
	}
	
	@Test
	public void sendKeys() throws InterruptedException  {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
	//	js.executeScript("arguments[0].value=arguments[1]",ele,"iphone");
		js.executeScript("arguments[0].value='iphone'",ele);
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	public void ScrollTillTopOfPage() throws Throwable {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll']")).click();
		driver.findElement(By.xpath("//section[text()='Scroll' and @class='poppins text-[14px]']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/scroll/newInfinite']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/scroll/newTabInfinite']")).click();
		String parent = driver.getWindowHandle();
		Set<String> ids = driver.getWindowHandles();
		for (String id : ids) {
			if (id.equals(parent)) {
			} else {
				driver.switchTo().window(id);
			}
		}
		Thread.sleep(2000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		driver.quit();
		
	}
	@Test
	public void launchApplication() throws Throwable {
		WebDriver driver =new ChromeDriver();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.location=arguments[0]","https://www.amazon.in/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.quit();
	}
	
	@Test
	public void location() {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Point loc=ele.getLocation();
		int y=loc.getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+y+")");
		driver.quit();
		
		 
	}

}
