package co.com.proyectobase.screenplay.questions;

import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.VALIDATION_MESSAGE;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class TheScreen implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {

//		BrowseTheWeb.as(actor).getDriver().switchTo().frame(FRAME.resolveFor(actor));
//		BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent(); // Salir del frame

		return Text.of((Target) VALIDATION_MESSAGE).viewedBy(actor).asString();

	}

	public static TheScreen theScreen() {
		return new TheScreen();
	}
}
