package com.virgingames;

import com.cucumber.listener.Reporter;
import com.virgingames.propertyreader.PropertyReader;
import com.virgingames.utility.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.io.IOException;


/**
 * Created by Kaushik Patel
 */
public class Hooks extends Utility {


@Before
    public void setUp() {
        selectBrowser(PropertyReader.getInstance().getProperty("browser"));


    }

   @After
    public void teatDown(Scenario scenario) {
if(scenario.isFailed()){
    String screeShotPath = Utility.getScreenshot(driver, scenario.getName().replace(" ", "_"));
    try {
        Reporter.addScreenCaptureFromPath(screeShotPath);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
        closeBrowser();
    }
}
