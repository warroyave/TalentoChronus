package co.com.proyectobase.screenplay.model;

public class User {

	public String numdocument;
	public String password;
	public String message_validation;
	public String description_objetives;
	public String measurement_criteria;
	public String minimum_acceptable;
	public String goal;
	public String excellence;
	
	
	public String getDescription_objetives() {
		return description_objetives;
	}

	public void setDescription_objetives(String description_objetives) {
		this.description_objetives = description_objetives;
	}

	public String getMeasurement_criteria() {
		return measurement_criteria;
	}

	public void setMeasurement_criteria(String measurement_criteria) {
		this.measurement_criteria = measurement_criteria;
	}

	public String getMinimum_acceptable() {
		return minimum_acceptable;
	}

	public void setMinimum_acceptable(String minimum_acceptable) {
		this.minimum_acceptable = minimum_acceptable;
	}

	public String getGoal() {
		return goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getExcellence() {
		return excellence;
	}

	public void setExcellence(String excellence) {
		this.excellence = excellence;
	}

	public String getMessage_validation() {
		return message_validation;
	}

	public void setMessage_validation(String message_validation) {
		this.message_validation = message_validation;
	}

	public String getNumdocument() {
		return numdocument;
	}

	public void setNumdocument(String numdocument) {
		this.numdocument = numdocument;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}