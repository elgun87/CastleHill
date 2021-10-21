package com.castlehill.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/login.feature",
        glue = "com/castlehill/step_definitions",
        dryRun = false
)
public class CukesRunner {
}
