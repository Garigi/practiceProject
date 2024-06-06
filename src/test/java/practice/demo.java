package practice;

import org.testng.annotations.Test;

public class demo {
@Test(enabled=false)
public void m() {
	System.out.println("pass test case");
}
@Test(invocationCount = 5)
public void m1() {
	System.out.println("pass test case 1");
	
}
@Test(priority =2 )
public void m2() {
	System.out.println("pass test case 2");
}
@Test()
public void m3() {
	System.out.println("pass test case 3");
}
}
