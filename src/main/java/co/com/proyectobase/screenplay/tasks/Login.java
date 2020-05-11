package co.com.proyectobase.screenplay.tasks;

import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.BUTTON_LOGIN;
import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.NUMDOCUMENT;
import static co.com.proyectobase.screenplay.userinterface.TalentSophosPage.PASSWORD;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.proyectobase.screenplay.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

	private List<User> data;
	WebDriver driver;

	public Login(List<User> data) {
		this.data = data;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		
//		actor.attemptsTo(Wait.waitClass(5000));
//		BrowseTheWeb.as(actor).getDriver().switchTo().frame(FRAME.resolveFor(actor));
//		BrowseTheWeb.as(actor).getDriver().switchTo().defaultContent(); // Salir del frame
//		System.out.println("Dato Usuario " + data.get(0).getNumdocument());

		actor.attemptsTo(Enter.theValue(data.get(0).getNumdocument()).into(NUMDOCUMENT));
		actor.attemptsTo(Enter.theValue(data.get(0).getPassword()).into(PASSWORD));
		actor.attemptsTo(Click.on(BUTTON_LOGIN));
		

	}

	public static Login conElDato(List<User> data) {
		return Tasks.instrumented(Login.class, data);
	}
}
