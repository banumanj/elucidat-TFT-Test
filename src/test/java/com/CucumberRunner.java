package com;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target/HtmlReports/index.html","json:target/JsonReports/index.json", "junit:target/XmlReports/index.xml"},
        //plugin = {"pretty", "summary"},
        glue = "com/stepDefinitions",
        features = "src/test/resources/features",
        tags = "@smoke"
)
public class CucumberRunner
{
}


