package com.TestScripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.Pages.Amazon;
import com.utility.BaseClass;

public class TestAmazon {

	@Test
	  public void case_101 () throws Exception{
		DOMConfigurator.configure("log4j.xml");
		  BaseClass.openBrowser();
		  Amazon.openAmazon();
        BaseClass.closeApp();
	  }
}
