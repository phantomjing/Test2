package com.testgit;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;

public class Testgit extends UiAutomatorTestCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UiAutomatorHelper("testjar","com.testgit.Testgit","testGit","1");
	}
	
	public void testGit(){
		UiDevice.getInstance().pressMenu();
		UiDevice.getInstance().pressBack();
	}

}
