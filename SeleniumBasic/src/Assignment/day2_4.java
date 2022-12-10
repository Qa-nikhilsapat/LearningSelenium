package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day2_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Executibles\\chromedriver.exe");
		
		WebDriver call= new ChromeDriver();
		call.get("https://www.amazon.in/");
		
		String s1=call.getCurrentUrl();
		String s11="https://www.amazon.in/";
		System.out.println(s1);
		System.out.println("expecetd URl: "+s11);
		System.out.println(s1.equals(s11));
		
		String s2=call.getTitle();
		String s22="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		System.out.println(s2);
		System.out.println("expecetd URl: "+s22);
		System.out.println(s2.equals(s22));
		
		String s3=call.getPageSource();
		System.out.println("length "+s3.length());
		call.close();

	}

}
