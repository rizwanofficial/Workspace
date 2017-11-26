package annotationTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodTest {
	@Test(priority = 1)
	public void logintest() {
		System.out.println("logintestcompleted");
	}

	@Test(priority = 2)
	public void registrationtest() {
		// int i = 1/0;
		System.out.println("Registration Completed");
	}

	@Test(priority = 3)
	public void bookingtest() {
		System.out.println("booking Completed");
	}

	@Test(priority = 4)
	public void canceltest() {
		System.out.println("cancel Completed");
	}

	@BeforeMethod
	public void openbrowser() {
		System.err.println(" To validate whether browser is open or not");

	}
	
	@AfterMethod
	public void closebrowser() {
		System.err.println(" To validate whether browser is closed or not");

	}

}
