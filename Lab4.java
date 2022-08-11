package lab4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C://Users//4082//Desktop/chromedriver.exe");
		 
		   /*
		   // Open chrome driver
		   WebDriver driver = new ChromeDriver();
		   
		   //Maximize window
		   driver.manage().window().maximize();
		   
		   driver.get("https://www.way2automation.com/");
		   
		   driver.findElement(By.xpath("//li[@id='menu-item-27580']//a[@class='menu-link']//child::span[@class='menu-text']")).click();
		   driver.findElement(By.xpath("//li[@id='menu-item-27582']//a[@class='menu-link']//child::span[@class='menu-text']")).click();
		   driver.findElement(By.xpath("//li[@id='menu-item-27583']//a[@class='menu-link']//child::span[@class='menu-text']")).click();
		   
		   try {       
               Thread.sleep(5000);
           }
           catch (Exception e) {
           // catching the exception
           System.out.println(e);
       }
		   driver.close();
		   
		   */
		 
		 
		 
		 WebDriver driver1 = new ChromeDriver();
		 driver1.manage().window().maximize();
		 
		  //String mainWindowHandle = driver1.getWindowHandle();
	        
		 driver1.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php");
		 
		 driver1.findElement(By.xpath("//a[@href='frames-and-windows.php']")).click();
		 try {       
             Thread.sleep(2000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
         }
		 
		 driver1.findElement(By.xpath("//a[@href='#example-1-tab-2']")).click();
		 
		 try {       
             Thread.sleep(2000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
          }
		 
		 driver1.findElement(By.xpath("//a[@href='#example-1-tab-3']")).click();
		 
		 try {       
             Thread.sleep(2000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
          }
		 
		 driver1.findElement(By.xpath("//a[@href='#example-1-tab-4']")).click();
		 
		 String MainWindow = driver1.getWindowHandle();
		 System.out.println("Main window handle is " + MainWindow);
		 /*
		  WebDriver driver2 = new ChromeDriver();
		 driver2.manage().window().maximize();
		 driver2.get("https://sso.teachable.com/secure/673/identity/login");
		 
		 driver2.findElement(By.xpath("//a[@href='/secure/673/identity/sign_up']")).click();
		 try {       
             Thread.sleep(3000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
           }
		 
		 driver2.findElement(By.id("user_name")).sendKeys("SidraTulMuntaha");
		 driver2.findElement(By.id("user_email")).sendKeys("sidratulmuntaha143@gmail.com");
		 driver2.findElement(By.id("password")).sendKeys("Sidra@123");
		 try {       
             Thread.sleep(1000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
           }
		 
		 driver2.findElement(By.xpath("//input[@value='Sign up']")).click();
		 try {       
             Thread.sleep(2000);
         }
         catch (Exception e) {
         // catching the exception
         System.out.println(e);
           }
           */
	}

}
