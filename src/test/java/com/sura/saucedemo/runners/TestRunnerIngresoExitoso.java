package com.sura.saucedemo.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features/IngresoAplicativoExitoso.feature",
        glue = "com.sura.saucedemo"
)

public class TestRunnerIngresoExitoso {
}
