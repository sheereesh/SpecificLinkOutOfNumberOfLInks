package specificlinkproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Specificlink {
 
		 
		public static void main(String[] args) throws InterruptedException {
			 WebDriverManager.chromedriver().setup();
			 WebDriver driver=new ChromeDriver();
			 driver.get("https://www.google.com/");
			 
		driver.manage().window().maximize();
		 List<WebElement> elements=driver.findElements(By.tagName("a")); 
		 String parentElelment =driver.findElement(By.xpath("//a[text()=' How Search works ']")).getText();
		 for(WebElement element: elements) {
		 if(element.getText().equals(parentElelment)) {
			 
			 element.click();
			 break;
		 }

		}


			}

	 

	}

 
