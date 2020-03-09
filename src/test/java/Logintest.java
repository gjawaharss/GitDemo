import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

	
	
	public void print() {
		
		System.out.println("My father Gnanavel");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Syamala\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		
	}

}
