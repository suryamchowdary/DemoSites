package Testing_Sms;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Listeners implements ITestListener {
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
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		Reporter.log("Should be executed After the test"+ arg0.getName(),true);
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		Reporter.log("Should be executed before the test"+ arg0.getName(),true);
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
	}
		private void printTestResults(ITestResult result) {

			Reporter.log("Test Method resides in " + result.getTestClass().getName(), true);

			if (result.getParameters().length != 0) {

				String params = null;

				for (Object parameter : result.getParameters()) {

					params += parameter.toString() + ",";

				}

				Reporter.log("Test Method had the following parameters : " + params, true);

			}

			String status = null;

			switch (result.getStatus()) {

			case ITestResult.SUCCESS:

				status = "Pass";

				break;

			case ITestResult.FAILURE:

				status = "Failed";

				break;

			case ITestResult.SKIP:

				status = "Skipped";

			}

			Reporter.log("Test Status: " + status, true);

		}
		

	@Override
	public void onTestFailure(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}




		
}
