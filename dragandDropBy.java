import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragandDropBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		WebDriver g = new ChromeDriver();
        g.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         g.get("https://jqueryui.com/draggable/");
         WebElement source = g.findElement(By.xpath("//p[text()='Drag me around']"));

      WebElement target= g.findElement(By.id("//p[text()='Drag me around']"));

         Actions a = new Actions(g);     //create a Objection Creation  Here we are going to pass  WebDriver (g) Refrence

         a.dragAndDropBy(source, 20, 0);  // It is going to do Drag the Block 1 Operation it will move on Column-3
     
         a.perform();                 // 3. we have pass this perform methode If u did not pass the perform methode it wiil not going to perform any mouse Cursor action 



	}

}
