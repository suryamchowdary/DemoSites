package Testing_Sms;

import org.testng.annotations.Test;

public class Dependent_Test {
  @Test (dependsOnMethods = {"dependent"})
  public void dependent1() {
	  System.out.println("This has to be executed second");
  }
  @Test
  public void dependent()
  {
	  System.out.println("This mothod has to be exeuted first");
  }
  @Test (dependsOnMethods = {"dependent1"})
  public void depndendent2()
  {
	  System.out.println("This method has to be exeuted after dependent1");
  }
 
}
