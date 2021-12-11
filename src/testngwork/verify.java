package testngwork;

import org.testng.annotations.Test;

public class verify {
	@Test(groups={"sanity"})
	public void m1() {
		System.out.println("test1");
	}
	@Test(groups={"sanity","smoke"})
	public void m2() {
		System.out.println("test2");
	}
	@Test(groups={"sanity","regression"})
	public void m3() {
		System.out.println("test3");
	}
	@Test(groups={"regression"})
	public void m4() {
		System.out.println("test4");
	}
	public void m5() {
		System.out.println("test5");
	}



}
