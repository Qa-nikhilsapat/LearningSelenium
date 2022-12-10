package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_3 {
	//
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"F:\\New folder\\SeleniumBasic\\Executibles\\chromedriver.exe");
		
		WebDriver call = new ChromeDriver();
		call.get("http://sampleapp.tricentis.com/101/");
		
		String s1=call.getCurrentUrl();
		String s11="http://sampleapp.tricentis.com/101/";
		System.out.println("Url: "+s1);
		System.out.println("Expected Url: "+s11);
		System.out.println("URL valitation: "+s1.equals(s11));
		
		String s2=call.getTitle();
		String s22="Tricentis Vehicle Insurance";
		System.out.println("Title: "+s2);
		System.out.println("Expected Title: "+s22);
		System.out.println("Title valitation: "+s2.equals(s22));
		
		String s3=call.getPageSource();
		System.out.println("pageLenggth: "+s3.length());
				
		call.close();
		

	}

}
