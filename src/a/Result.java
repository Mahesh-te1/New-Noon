package a;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import generic.Utility;

public class Result implements ITestListener {

	static int passCount = 0, failCount = 0, skipCount = 0;

	public void onTestSuccess(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test:" + name + " is Pass ", true);
		passCount++;
	}

	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test:" + name + " is Fail", true);
		failCount++;
	}

	public void onFinish(ITestContext context) {
		Reporter.log("Pass:" + passCount, true);
		Reporter.log("Fail:" + failCount, true);
		Reporter.log("Skip:" + skipCount, true);
		Utility.writeResultToXL("./result/Summary.xlsx", passCount, failCount, skipCount);
	}

	// update only above mentioned 3 methods & keep all the other methods as it
	// is
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name = result.getName();
		Reporter.log("Test:" + name + " is Skip", true);
		skipCount++;
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
