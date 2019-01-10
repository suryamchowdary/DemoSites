package Testing_Sms;

import org.testng.annotations.Test;

public class Grouping {
  
	@Test (groups = {"Bike"})
  public void Bike1() {
		System.out.println("Bike1 is to be purchased");
  }
	@Test (groups = {"Bike"})
  public void Bike2() {
	  System.out.println("Bike2 is to be purchased");
  }
	@Test (groups = {"Scooty"})
	  public void Scooty1() {
			System.out.println("Scooty1 is to be purchased");
	  }
		@Test (groups = {"Scooty"})
	  public void Scooty2() {
		  System.out.println("Scooty2 is to be purchased");
	  }
		@Test (groups = { "Bike", "Scooty" })
		public  void type()
		{
			System.out.println("Bike type is Scooty and it is to be purchased");
		}
}
