package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.cucumber.core.api.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook {
    @Before
    public void setup(){
        System.out.println("################################");
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed()){
            System.out.println("Test failed!");
            byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot,"image/png");
        }else {
            System.out.println("Cleanup");
            System.out.println("Test completed!");
        }
        System.out.println("################################");
        // after every test, we are going to close the browser
        Driver.close();
    }
}
