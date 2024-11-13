package practice;

import org.testng.annotations.Test;

public class TestNG_InvocationCount {

		@Test(invocationCount=5) 
		public void SampleTest() 
		{ 
		System.out.println("hi"); 
		}
}
