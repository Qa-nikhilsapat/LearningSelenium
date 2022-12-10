package day11_calender_Xpath;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW_RedBus {

	public static void main(String[] args) throws IOException {

		FileInputStream file = new FileInputStream("./SeleniumBasic/DataFiles.properties");
		Properties call =new Properties();
		call.load(file);
		
		String driver=call.getProperty("driver");
		String url =call.getProperty("url");
		String path=call.getProperty("dir");
		
		String homeDir = System.setProperty("user dir", "dir");
		
		WebDriver load =new ChromeDriver();
		load.get("url");

	}

}
