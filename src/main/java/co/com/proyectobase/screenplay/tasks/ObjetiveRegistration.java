package co.com.proyectobase.screenplay.tasks;

import java.util.List;

import org.openqa.selenium.WebDriver;

import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.*;
import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ObjetiveRegistration implements Task {

	private List<User> data2;
	WebDriver driver;

	public ObjetiveRegistration(List<User> data2) {
		this.data2 = data2;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(Wait.waitClass(5000));
		actor.attemptsTo(Click.on(PERFORMANCE));
		actor.attemptsTo(Wait.waitClass(5000));
		actor.attemptsTo(Click.on(ADD_TARGET));
		actor.attemptsTo(Click.on(LIST));
		actor.attemptsTo(Click.on(OBJETIVE_LIST));

		actor.attemptsTo(Click.on(PERSPECTIVA));
		actor.attemptsTo(Wait.waitClass(7000));
		actor.attemptsTo(Click.on(FINANCIAL));

		actor.attemptsTo(Click.on(INDICADOR));
		actor.attemptsTo(Wait.waitClass(7000));
		actor.attemptsTo(Click.on(INDICADOR2));

//		System.out.println("Dato USuario " + data2.get(0).getDescription_objetives());

		actor.attemptsTo(Click.on(DESCRIPTION_OBJETIVE));
		actor.attemptsTo(Enter.theValue(data2.get(0).getDescription_objetives()).into(DESCRIPTION_OBJETIVE));
		actor.attemptsTo(Enter.theValue(data2.get(0).getMeasurement_criteria()).into(MEASUREMENT_CRITERIA));
		actor.attemptsTo(Enter.theValue(data2.get(0).getMinimum_acceptable()).into(MINIMUM_ACCEPTABLE));
		actor.attemptsTo(Enter.theValue(data2.get(0).getGoal()).into(GOAL));
		actor.attemptsTo(Enter.theValue(data2.get(0).getExcellence()).into(EXCELLENCE));
		actor.attemptsTo(Click.on(CREATE_OBJECTIVES));
		actor.attemptsTo(Wait.waitClass(1500));

	}

	public static ObjetiveRegistration withTheData(List<User> data2) {
		return Tasks.instrumented(ObjetiveRegistration.class, data2);
	}
}