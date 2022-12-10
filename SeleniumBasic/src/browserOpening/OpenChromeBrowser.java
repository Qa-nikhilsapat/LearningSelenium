package browserOpening;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	static void facebock() {
		System.setProperty("webdriver.chrome.driver", "F:\\JavaWorkspace\\SeleniumPractice\\executables\\geckodriver.exe");
		
		ChromeDriver call = new ChromeDriver();
		call.get("https://www.facebook.com");
		call.close();
	}

	public static void main(String[] args) {
		
		//facebock();
		/**
		 * Step1: set the path of required browser executable file using System.setProperty(key, value)
		 * Step2: create an instance of required browser class
		 */
		
		System.setProperty("webdriver.chrome.driver", 
				".\\Executibles\\chromedriver.exe");
		
		ChromeDriver cdriver=new ChromeDriver();
		//to enter the url on the open browser
		//cdriver.get("https://www.fb.com");
		//close the current browser
		String s1= cdriver.getCurrentUrl();
		System.out.println(s1);
		
		String s2 ="https://www.fb.com";
		System.out.println("our URL: "+s2);
		System.out.println("validation "+s2.contains(s1));
		//cdriver.close();

	}

}
