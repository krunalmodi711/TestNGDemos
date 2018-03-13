import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Demo1 {
	
	@Test(priority=0)
	public void test1()
	{
		System.out.println("test1");
		Assert.assertEquals(true,true,"Test failed");
		}
	
	@Test(priority=1)
	public void test2(){
		
		System.out.println("test2");
		Assert.assertEquals(true,true,"Test failed");
		}
		
	@Test(priority=2, timeOut=1000)
	public void test3() throws InterruptedException{
			
			System.out.println("test3");
			Assert.assertEquals(true,false,"Test failed");
			}
}
