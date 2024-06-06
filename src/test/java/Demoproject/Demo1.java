package Demoproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
@Test
public void m() {
System.out.println("welcome");
WebDriver d=new ChromeDriver();
d.get("https://www.flipkart.com/");
d.close();
}
}
