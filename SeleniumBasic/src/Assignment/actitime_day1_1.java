package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actitime_day1_1 {

	public static void main(String[] args) {
		String cdriver = System.getProperty("user.dir") + "\\Executibles\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cdriver);

		WebDriver call = new ChromeDriver();
		call.get("https:\\demo.actitime.com/");

		String s = call.getTitle();
		System.out.println("title : " + s);
		System.out.println("title length : " + s.length());

		String s1 = call.getCurrentUrl();
		System.out.println("site url: " + s1);

		String s2 = "https:\\demo.actitime.com/";
		System.out.println("my Url= " + s2);
		System.out.println("validation = " + s.contains(s2));

		String s3 = call.getPageSource();
		System.out.println("length: " + s3.length());
		// System.out.println(page.length());
		call.close();

	}

}
