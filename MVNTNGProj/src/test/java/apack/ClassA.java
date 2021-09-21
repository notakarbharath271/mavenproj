package apack;

import org.testng.annotations.Test;

public class ClassA {
	
	
	
	@Test(dependsOnMethods = {"Zomato"})
	public void Amazon() {
		System.out.println("Amazon");
	}
	
	@Test
	public void Zomato() {
		System.out.println("Zomato");
	}
	
	@Test
	public void SnapDeal() {
		System.out.println("Snapdeal");
	}
	
	@Test(timeOut = 3000)
	public void MakeMyTrip() throws InterruptedException {
		System.out.println("makeMyTrip");
		Thread.sleep(2000);
	}
	
	@Test(enabled = false)
	public void Flipkart() {
		System.out.println("Flipkart");
	}

	
}
