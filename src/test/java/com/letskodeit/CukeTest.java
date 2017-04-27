package com.letskodeit;

import cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Jay Vaghani on 26/04/2017.
 */

@RunWith(Cucumber.class)
@Cucumber.Options(features = ".",format = "html:target/CucumberReport",tags = "@SmokeTest")
public class CukeTest
{
}
