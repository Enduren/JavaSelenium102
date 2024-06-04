package testng102;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListener102 implements ITestListener{


	
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test has failed and this is the message from ITestListner");
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test has passed! ITListens");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	

}
