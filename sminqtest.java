package com.sminq;
	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.LinkedList;

	import org.testng.Assert;
	import org.testng.ITestResult;
	import org.testng.SkipException;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import Utilities.AndroidUtil;

	import TestNGListeners.CustomListener;
	import Utilities.AndroidUtil;
	import Utilities.ConfigReader;
	import Utilities.DriverUtil;
	import Utilities.ExcelDataUtil;
	import Utilities.ExcelTestDataReader;
	import Utilities.HtmlReportUtil;
	import Utilities.KeywordUtil;
	import Utilities.LogUtil;
	import Utilities.Utility;


	@Listeners(CustomListener.class)
	public class sminqtest extends AndroidUtil
	{
		public String testCaseID = getClass().getSimpleName();
		static int retryCount=GetIntValue("retryCount");
		static int retryingNumber=1;

		@Test
		(testName="sminqtest",description="verify post functionality",dataProvider="getExcelTestData")
		public void TestValidation(HashMap<String, String> rowMap) {
			try{
				Utility.initializeClassFields(getClass(),testCaseID);
				Utility.testData.setBrowser(CustomListener.browserName);
				logStep = Utility.testData.getTestCaseSummary();
				HtmlReportUtil.stepInfo(logStep);
			
				allow();
			signinwith_google();
			clickContinue();
			startline();
			clickonAcc();
			useOtherAccount();
			EnterUname();
			password();
			notnow();
			continue1();
		    startline2();
				
			allowAccessToLocation();
			startline2();
			allow();
	     	  camerclick();
			  clickOk();
			   allowAccessCamera();
			  clickOk();
			   allowAccessTomicrophone();
	            clickOk();
			    camerclick1();
			    startline2();
			     placeclick();
				dragmoodicon();
				done1();
				post();
				Assert.assertTrue(verifyUpload());
		
			}catch (Exception e) {
				//KeywordUtil.changeContext("NATIVE");
				if(retryCount>0)
				{
					String imagePath = Utility.takeScreenshot(driver, testCaseID+"_"+ retryingNumber);
					Utility.testResult.setFailedScreenShotReference(imagePath);
					HtmlReportUtil.stepError(testCaseID,e);
					Utility.testException = e;
					HtmlReportUtil.attachScreenshot(imagePath);
					HtmlReportUtil.stepInfo("Trying to Rerun" + " "+testCaseID +" for " + retryingNumber + " time");
					retryCount--;
					retryingNumber++;
					LogUtil.infoLog(getClass(), "****************Waiting for " + GetIntValue("retryDelayTime") +" Secs before retrying.***********");
					//executionDelay(GetIntValue("retryDelayTime"));
					LogUtil.errorLog(getClass().getSimpleName(),e.getCause().toString());
					TestValidation(rowMap);


				}
				else
				{
					String imagePath = Utility.takeScreenshot(driver, testCaseID);
					Utility.testResult.setFailedScreenShotReference(imagePath);
					HtmlReportUtil.stepError(testCaseID, e);
					Utility.testException = e;
					HtmlReportUtil.attachScreenshot(imagePath);
					e.printStackTrace();
				}

			}
		}
		@DataProvider
		public Iterator<Object[]> getExcelTestData() {

			String sheetname = this.getClass().getSimpleName();
			String testDataPath = ConfigReader.getValue("testDataPath");
			ExcelTestDataReader excelReader = new ExcelTestDataReader();
			final LinkedList<Object[]> dataBeans = excelReader.getRowDataMap(System.getProperty("user.dir") + testDataPath,
					sheetname);
			return dataBeans.iterator();
		}

	}




	


