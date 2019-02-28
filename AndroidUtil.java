package Utilities;

import java.util.HashMap;

import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.swinq.Pages.ObjectOR;
import com.swinq.Pages.ObjectOR.Sminq;

import Utilities.KeywordUtil;
import ch.qos.logback.core.joran.action.Action;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class AndroidUtil extends Utility {

	public static Dimension size;
	public static String[] activityName, apkInfo;
	public static String appVersionCode, appVersionName, appActivity, appPackage;
	public static Map<String, String> apkInfoMap = new HashMap<String, String>();
	/*
	@SuppressWarnings("rawtypes")
	public static Boolean swipeVerticalBottom()  {
		Boolean flag = false;
		
		size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.50);
		int endy = (int) (size.height * 0.10);
		int startx = size.width / 2;
		((AndroidDriver) driver).swipe(startx, starty, startx, endy, 3000);
		KeywordUtil.executionDelay(2000);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}

	public static Boolean swipeVerticalBottom1() throws InterruptedException {
		Boolean flag = false;
		size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.50);
		int endy = (int) (size.height * 0.50);
		int startx = size.width / 2;
		((AppiumDriver) driver).swipe(startx, starty, startx, endy, 3000);
		Thread.sleep(2000);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean swipeHorizontal() throws InterruptedException {
		Boolean flag = false;
		size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.90);
		int endx = (int) (size.height * 0.10);
		int starty = size.width / 2;
		((AppiumDriver) driver).swipe(startx, starty, endx, starty, 3000);
		Thread.sleep(2000);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean swipeHorizontalleft() throws InterruptedException {
		Boolean flag = false;
		size = driver.manage().window().getSize();
		int startx = (int) (size.width * 0.90);
		int endx = (int) (size.height * 0.10);
		int starty = size.width / 2;
		((AppiumDriver) driver).swipe(endx, starty, startx, starty, 3000);
		Thread.sleep(2000);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean swipeVerticalTop() throws InterruptedException {
		Boolean flag = false;
		size = driver.manage().window().getSize();
		int starty = (int) (size.height * 0.90);
		int endy = (int) (size.height * 0.30);
		int startx = size.width / 2;
		((AppiumDriver) driver).swipe(startx, endy, startx, starty, 3000);
		Thread.sleep(2000);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}*/
	
	public static Boolean allow() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_allow))
		{
			KeywordUtil.click(Sminq.sminqallow, ObjectOR.Common.type_name);
		}
		return flag;
	}

	public static Boolean signinwith_google() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_googleAcc))
		{
			KeywordUtil.click(Sminq.sminqgoogleacc, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean clickContinue() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_continue))
		{
			KeywordUtil.click(Sminq.swingcontinue, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean clickonAcc() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_acc))
		{
			KeywordUtil.click(Sminq.swinqacc, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean clickOk() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_ok))
		{
			KeywordUtil.click(Sminq.swingok, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean allowAccessToLocation() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_givelocationpermision))
		{
			KeywordUtil.click(Sminq.swinggivelocatiopermision, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean allowAccessCamera() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_EnableCamer))
		{
			KeywordUtil.click(Sminq.swinqenablecAMER, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean allowAccessTomicrophone() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_Enablemicrophone))
		{
			KeywordUtil.click(Sminq.swinqenablemicrophone, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean camerclick() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_camera))
		{
			KeywordUtil.click(Sminq.swincamera, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean clickelement(By ele,String sr,String type) throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ele))
		{
			KeywordUtil.click(sr, type);
		}
		return flag;
	}
	public static Boolean camerclick1() throws InterruptedException {
		Boolean flag = false;
		
		
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.sminq_camera1))
		{
			KeywordUtil.click(Sminq.swincamera1, ObjectOR.Common.type_xpath);
		}
		//act.moveByOffset(108,728).click().build().perform();
		return flag;
	}
	
	
	public static Boolean done1() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.done_1))
		{
			KeywordUtil.click(Sminq.done1, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean post() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.post))
		{
			KeywordUtil.click(Sminq.post1, ObjectOR.Common.type_name);
		}
		return flag;
	}
	public static Boolean placeclick() throws InterruptedException {
		Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.place_1))
		{
			KeywordUtil.click(Sminq.place1, ObjectOR.Common.type_name);
		}
		else if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.place_2))
		{
			KeywordUtil.click(Sminq.place2, ObjectOR.Common.type_xpath);
		}
		return flag;
	}
	public static void dragmoodicon() throws InterruptedException
	{
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.drag))
		{
		
	KeywordUtil.click(Sminq.drag1, ObjectOR.Common.type_name);

		}
	}
	
	public static void startline() throws InterruptedException
	{
		Thread.sleep(6000);
	}
	public static void startline2() throws InterruptedException
	{
		Thread.sleep(8000);
	}
	public static boolean verifyUpload() throws InterruptedException
	{Boolean flag = false;
		if(KeywordUtil.isWebElementPresent(ObjectOR.Sminq.upload))
		{
		
	flag=true;

		}return flag;
	}
	public static Boolean tap(double x, double y) throws InterruptedException {

		Boolean flag = false;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		double x1 = x;
		double y1 = y;
		HashMap<String, Double> point = new HashMap<String, Double>();
		point.put("x", x1);
		point.put("y", y1);
		js.executeScript("mobile: tap", point);
		flag = true;

		if (flag)
			return true;
		else
			return false;
	}

	public static void moveToContext(String contextName) {
		if (contextName.contains("NATIVE")) {
			driver.context("NATIVE_APP");
		}

		else if (contextName.contains("WEBVIEW")) {
			driver.context("WEBVIEW_1");
		}

	}

	public static void relaunchApp(String packageName) {
		try {
			driver.closeApp();
			Thread.sleep(1000);
			Runtime.getRuntime().exec("adb shell monkey -p " + packageName + " -c android.intent.category.LAUNCHER 1");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void click(By by) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(by).click();
	}

	public void sendKeys(By by, String data) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(by).sendKeys(data);
	}

	public boolean hasElement(By by) throws InterruptedException {
		Thread.sleep(2000);
		return driver.findElement(by).isDisplayed();
	}

	/*public static Boolean startActivity(String packageName, String appActivity) {
		Boolean flag = false;
		((AndroidDriver) driver).startActivity(packageName, appActivity);
		flag = true;
		return flag;
	}*/

	public static Boolean resetApp() {
		Boolean flag = false;
		driver.resetApp();
		flag = true;
		return flag;
	}

}
