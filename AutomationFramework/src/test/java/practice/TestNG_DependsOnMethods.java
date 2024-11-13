package practice;

import org.testng.annotations.Test;

public class TestNG_DependsOnMethods {

	
		@Test 
		public void Contact() 
		{ 
		System.out.println("Contact Added"); 
		} 
		@Test(dependsOnMethods="Contact") 
		public void Chat() 
		{ 
		System.out.println("Chat");
		}
}
