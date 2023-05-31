import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver g = new ChromeDriver();
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		g.get("https://www.flipkart.com/");
		g.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		g.findElement(By.xpath("//img[@alt='Grocery']")).click();
		g.navigate().back();
		
		g.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		g.navigate().back();
		
		g.findElement(By.xpath("//img[@alt='Appliances']")).click();
		g.navigate().back();
		
		g.findElement(By.xpath("//img[@alt='Travel']")).click();
		g.navigate().back();
		
		g.findElement(By.xpath("//img[@alt='Top Offers']")).click();
		g.navigate().back();
		
	}

}
