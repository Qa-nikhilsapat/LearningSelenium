package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_2 {

	public static void main(String[] args) {
		String driver = System.getProperty("user.dir")+"\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driver);
		
		WebDriver call =new ChromeDriver();
		call.get("https://demo.automationtesting.in/Register.html");
		
		String s1=call.getCurrentUrl();
		System.out.println(s1);
		String s11="https://demo.automationtesting.in/Register.html";
		System.out.println("Expected URL: "+s11);
		System.out.println(s1.equals(s11));
		
		String s2=call.getTitle();
		System.out.println(s2);
		String s22="Register";
		System.out.println("Expeceted Title: "+s2);
		System.out.println(s2.equals(s22));
		
		String s3=call.getPageSource();
		System.out.println("pageLength: "+s3.length());
		call.close();
		
		
		

	}

}
