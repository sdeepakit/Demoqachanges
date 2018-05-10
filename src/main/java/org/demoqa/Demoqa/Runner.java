package org.demoqa.Demoqa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue={"org.demoqa.Demoqa"}, plugin = {"pretty","html:target/reports/htmlreport/"}, monochrome = true,tags ={"@Textbox"})


public class Runner {

}
