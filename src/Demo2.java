import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	

	@Test(groups = "Regression")
	public void test3()
	{
		System.out.println("test3");
		Assert.assertEquals(true,true,"Test failed");
	}
	
	@Test(groups = {"Regression","Functional"})
	public void test4(){
		
		System.out.println("test4");
		Assert.assertEquals(true,true,"Test failed");
		
	}

}
