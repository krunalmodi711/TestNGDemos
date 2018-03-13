import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test1 {

	@Test
	public void tryying()
	{
		WebDriver objDriver = new FirefoxDriver();
		objDriver.get("www.google.com");
		objDriver.manage().window().setPosition(new Point(-2000,0));
	}

}
