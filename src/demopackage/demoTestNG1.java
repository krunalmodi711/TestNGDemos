package demopackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demoTestNG1 {
	
	@Test(groups = "regression")
	public void test5(){
		
		Assert.assertEquals(true, true);
	}
	
	@Test(groups = "regression")
	public void test6(){
		
		Assert.assertEquals(true, true);
	}

	@Test(groups = "functional")
	public void test7(){
		
		Assert.assertEquals(true, true);
	}


}
