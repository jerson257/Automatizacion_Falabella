package com.falabella.www.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.falabella.www.stepdefinitions",
        features = "src/test/resources/features/comprar_articulo_falabella.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerFalabella {
}
