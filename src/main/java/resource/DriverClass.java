package resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverClass {

	
	public Properties p;
	public WebDriver driver;
	
	public WebDriver driv() throws IOException {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Demoo\\src\\main\\java\\resource\\file.properties");
	p = new Properties();	
	p.load(fis);	
	String browser=p.getProperty("browser");
	
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Framework\\src\\main\\java\\server\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else {
		System.out.println("firefox");
	}
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;
	}
	
}
