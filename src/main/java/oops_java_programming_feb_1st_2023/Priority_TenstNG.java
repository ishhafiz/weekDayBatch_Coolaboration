package oops_java_programming_feb_1st_2023;

import org.testng.annotations.Test;

public class Priority_TenstNG {

	@Test(priority =1)
	public void logic1() {
		
	}
	@Test(priority =2, dependsOnMethods="logic1")
	public void logic2() {
		
	}
	@Test(priority =3, dependsOnMethods={"logic1","logic2"})
	public void logic3() {
		
	}
	@Test(priority =4, dependsOnMethods={"logic1", "logic2","logic3"})
	public void logic4() {
		
	}
	@Test(priority =5,dependsOnMethods={"logic1", "logic2","logic3","logic4"})
	public void logic5() {
		
	}
}
