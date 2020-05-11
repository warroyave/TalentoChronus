package co.com.proyectobase.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
		features="src/test/resources/features/talentoSophos.feature",
		glue="co.com.proyectobase.screenplay.stepdefinitions",
		snippets=SnippetType.CAMELCASE		)
@RunWith(CucumberWithSerenity.class)

public class RunnerTags {
	
}