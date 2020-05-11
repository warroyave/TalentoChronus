package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.VALIDATION_MESSAGE;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.interactions.Wait;
import co.com.proyectobase.screenplay.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class ValidationMessage implements Task {

	private List<User> data3;
	WebDriver driver;

	public ValidationMessage(List<User> data3) {
		this.data3 = data3;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
		actor.attemptsTo(Wait.waitClass(1000));
		System.out.println("Validación de Usuario " + data3.get(0).getMessage_validation());

		actor.attemptsTo(Enter.theValue(data3.get(0).getMessage_validation()).into(VALIDATION_MESSAGE));

	}

	public static ValidationMessage withTheData(List<User> data3) {
		return Tasks.instrumented(ValidationMessage.class, data3);
	}

}
