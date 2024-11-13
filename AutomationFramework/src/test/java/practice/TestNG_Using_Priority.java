package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Using_Priority {

		@Test(priority=0) 
		public void CreateAccount() 
		{ 
		Reporter.log("Create Account",true); 
		} 
		@Test(priority=1) 
		public void EditAccount() 
		{ 
		Reporter.log("Edit Account",true); 
		} 
		@Test(priority=2) 
		public void DeleteAccount() 
		{ 
		Reporter.log("DeleteAccount",true);
		}
		
}
