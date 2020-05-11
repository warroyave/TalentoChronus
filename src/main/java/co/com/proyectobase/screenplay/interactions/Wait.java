package co.com.proyectobase.screenplay.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

public class Wait implements Interaction {

	private int var;

	protected Wait(int var) {
		this.var = var;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		new InternalSystemClock().pauseFor(var);

	}

	public static Wait waitClass(int var) {
		return instrumented(Wait.class, var);

	}
}