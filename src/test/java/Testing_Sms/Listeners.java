package Testing_Sms;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Listeners implements ISuiteListener,IInvokedMethodListener {
	@Test

	  public void main() {

		  System.out.println("Execution of Main test is carring on");

	  }

	  @BeforeMethod

	  public void beforeMethod() {

		  System.out.println("Execution of Before method is carring on");

	  }

	  @AfterMethod

	  public void afterMethod() {

		  System.out.println("Execution of After method is carring on");

	  }

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to begin executing Suite"+arg0.getName(),true);
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		Reporter.log("About to begin executing Suite"+arg0.getName(),true);
	}

	
	// This belongs to IInvokedMethodListener and will execute before every method including @Before @After @Test

		public void beforeInvocation(IInvokedMethod arg0, ITestResult arg1) {

			String textMsg = "About to begin executing following method : " +returnMethodName(arg0.getTestMethod());

			Reporter.log(textMsg, true);

		}
	// This belongs to IInvokedMethodListener and will execute after every method including @Before @After @Test

		public void afterInvocation(IInvokedMethod arg0, ITestResult arg1) {

			String textMsg = "Completed executing following method : " + returnMethodName(arg0.getTestMethod());

			Reporter.log(textMsg, true);

		}

		// This will return method names to the calling function
		private String returnMethodName(ITestNGMethod method) {

			return method.getRealClass().getSimpleName() + "." + method.getMethodName();

		}

		
}
