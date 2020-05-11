package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://sophos.talento.cloud/talento.sophos/")

public class TalentSophosPage extends PageObject {

	// LOGIN

	public static final Target NUMDOCUMENT = Target.the("field to enter the document").located(By.id("ext-gen42"));
	public static final Target PASSWORD = Target.the("field to enter the password").located(By.id("ext-gen46"));
	public static final Target BUTTON_LOGIN = Target.the("field to enter the document").located(By.id("ext-gen245"));

	// DESEMPEÑO
	public static final Target PERFORMANCE = Target.the("entrance to performance")
			.located(By.xpath("/html/body/div[1]/div/div/div/div/div/div[1]/div/div/div[1]/ul/li[5]/div[1]"));

	public static final Target FRAME = Target.the("Frame content validatiob").located(By.id("ext-gen117"));

	// MESSAGE VALIDATION
	// public static final Target VALIDATION_MESSAGE = Target.the("message to
	// validate the
	// login").located(By.xpath("//span[contains(@style,'color:#00a0e9;font-weight:none;font-size:14px')]"));

	public static final Target ADD_TARGET = Target.the("option to add objectives").located(By.id("ext-gen989"));

	public static final Target LIST = Target.the("objetives List").located(By.xpath("//*[@id=\"ext-gen1096\"]"));

	public static final Target OBJETIVE_LIST = Target.the("objetives").located(By.className("x-combo-list-item"));

	public static final Target PERSPECTIVA = Target.the("objetives").located(By.xpath(
			"/html/body/div[1]/div/div/div/div/div/div[2]/div/div[1]/div[3]/div/div/div/div[2]/div/div/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div/div[2]/div[1]/div/div/div/form/fieldset[1]/div/div[1]/div[7]/div[1]/div[1]/input"));
	public static final Target FINANCIAL = Target.the("objetives")
			.located(By.xpath("//div[contains(text(),'Financiera')]"));

	public static final Target INDICADOR = Target.the("indicador").located(By.id("ext-gen1128"));
	public static final Target INDICADOR2 = Target.the("indicador2").located(By.className("objetivoIndicador"));

	public static final Target DESCRIPTION_OBJETIVE = Target.the("description of objectives")
			.located(By.id("ext-gen1160"));
	public static final Target MEASUREMENT_CRITERIA = Target.the("Measurement Criteria").located(By.id("ext-gen1176"));
	public static final Target MINIMUM_ACCEPTABLE = Target.the("Minimum Aceptable").located(By.id("ext-gen1190"));
	public static final Target GOAL = Target.the("Goal or Achievement").located(By.id("ext-gen1198"));
	public static final Target EXCELLENCE = Target.the("EXCELLENCE").located(By.id("ext-gen1206"));
	public static final Target CREATE_OBJECTIVES = Target.the("Create the Objetive")
			.located(By.xpath("//button[contains(text(),'Crear')]"));

	// QUESTION OBJETIVOS

	public static final Target VALIDATION_MESSAGE = Target.the("goal created")
			.located(By.xpath(" //span[contains(text(),'La temporada')]"));
}
