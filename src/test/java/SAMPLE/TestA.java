package SAMPLE;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestA {
	@Test(priority=1)
	public void Login(){
		Assert.assertEquals("A", "A");
		System.out.println("Login Test is pass");
	}
	@Test(priority=2)
	public void Changepassword(){
		System.out.println("Change password is successfully completed");
	}
	
}
