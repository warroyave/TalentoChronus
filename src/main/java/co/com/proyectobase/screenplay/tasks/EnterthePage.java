package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.TalentSophosPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class EnterthePage implements Task {

	private TalentSophosPage talentoSophosPage;

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(talentoSophosPage));
	}

	public static EnterthePage LaPaginaTalento() {
		return Tasks.instrumented(EnterthePage.class);

	}
}
