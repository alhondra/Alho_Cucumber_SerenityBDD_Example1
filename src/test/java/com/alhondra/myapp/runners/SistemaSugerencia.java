package com.alhondra.myapp.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
//cesar recomienda un runner solamente por cada feature.
@CucumberOptions(features = {"src/test/resources/features/sistema_sugerencia.feature"},
        glue = {"com.cedaniel200.myapp.stepdefinitions"},
        snippets = SnippetType.CAMELCASE)
public class SistemaSugerencia {

}
