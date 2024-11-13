package practice;

import org.testng.annotations.Test;

public class TestNG_DependsOnGroups {

		@Test(dependsOnGroups="Sample") 
		public void test1() 
		{ 
		System.out.println("Test 1"); 
		} 
		@Test(groups="Sample") 
		public void test2() 
		{ 
		System.out.println("Test 2"); 
		} 
		@Test(groups="Sample") 
		public void test3() 
		{ 
		System.out.println("Test 3"); 
		} 
		@Test(groups="Sample") 
		public void test4() 
		{ 
		System.out.println("Test 4"); 
		} 
		@Test(groups="Sample") 
		public void test5() 
		{ 
		System.out.println("Test 5");
		}
}
