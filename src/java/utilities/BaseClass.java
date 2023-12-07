package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.Scenario;




public class BaseClass {
	//private static BaseClass Base;

	private static WebDriver driver ;
	public final static int TIMEOUT = 2;
	public static Properties prop=new Properties();
	public static FileReader fr;

	public static void setUp() throws IOException {
		if(driver==null) {

			fr=new FileReader ("C:/Users/OVI/eclipse-workspace/DSAlgo_Cucumber/src/test/resources/configFiles/config.properties");

					prop.load(fr);
		}

		if (prop.getProperty("browser").equalsIgnoreCase("Chrome"))
		{
			driver=new ChromeDriver();

			driver.manage().window().maximize();
		}
		else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();

		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			int n=driver.getWindowHandles().size();
			System.out.println(n);
		}

	}
	
	public static void ClearBrowserCache() throws Exception
	{
		driver.manage().deleteAllCookies();
		Thread.sleep(2000); //wait 7 seconds to clear cookies.
	}

	// private BaseClass() {
	//
	// driver = new ChromeDriver();
	// new WebDriverWait(driver, Duration.ofSeconds(5));
	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	// driver.manage().window().maximize();
	// }
	public static String getDSurl() {
		return prop.getProperty("url") ;
	}
	public static void openPage(String url) {
		
		driver.get(url);
	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	public static String getTitle() {
		return driver.getTitle();
	}
	public static void NavBack() {
		driver.navigate().back();
	}
	public static void navigateToPage(String url) {
		driver.navigate().to(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}

	// public static void setUpDriver() {
	// if (Base==null) {
	// Base = new BaseClass();
	// }
	// }
	
	
//	 public static void tearDown(Scenario scenario) {
//		 
//	        //validate if scenario has failed
//	        if(scenario.isFailed()) {
//	            final byte[] screenshot = ((TakesScreenshot) BaseClass.getDriver()).getScreenshotAs(OutputType.BYTES);
//	            scenario.attach(screenshot, "image/png", scenario.getName()); 
//	        }   
//	         
//	        if(driver!=null) {
//				driver.close();
//				driver.quit();
//			}
//			driver=null;
//	 }
//	
//	
	
	
	
	
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
		}
		driver=null;
	}
}