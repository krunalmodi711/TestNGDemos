package demopackage;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class demoTestNG {
	
	
	@Test(groups = "regression")
	public void test1(){
		
		Assert.assertEquals(true, true);
	}
	
	@Test(groups = "regression")
	public void test2(){
		
		Assert.assertEquals(true, true);
	}

	@Test(groups = "functional")
	@Parameters({"test"})
	public void test3(String str){
		
		System.out.println(str);
		Assert.assertEquals(true, true);
	}

}
