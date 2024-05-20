package com.group1.eHealthCare.entity;

public class InputOutpatient {

	private int inputId;
	private String inputPatientName;
	private String inputPhoneNumber;
	private String inputEmail;
	private String inputDateOfAppointment;
	private String inputTimeSlot;
	private String inputDepartment;
	private String inputDisease;
	private String inputDoctorName;
	
	public InputOutpatient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputOutpatient(int inputId, String inputPatientName, String inputPhoneNumber, String inputEmail,
			String inputDateOfAppointment, String inputTimeSlot, String inputDepartment, String inputDisease,
			String inputDoctorName) {
		super();
		this.inputId = inputId;
		this.inputPatientName = inputPatientName;
		this.inputPhoneNumber = inputPhoneNumber;
		this.inputEmail = inputEmail;
		this.inputDateOfAppointment = inputDateOfAppointment;
		this.inputTimeSlot = inputTimeSlot;
		this.inputDepartment = inputDepartment;
		this.inputDisease = inputDisease;
		this.inputDoctorName = inputDoctorName;
	}
	public int getInputId() {
		return inputId;
	}
	public void setInputId(int inputId) {
		this.inputId = inputId;
	}
	public String getInputPatientName() {
		return inputPatientName;
	}
	public void setInputPatientName(String inputPatientName) {
		this.inputPatientName = inputPatientName;
	}
	public String getInputPhoneNumber() {
		return inputPhoneNumber;
	}
	public void setInputPhoneNumber(String inputPhoneNumber) {
		this.inputPhoneNumber = inputPhoneNumber;
	}
	public String getInputEmail() {
		return inputEmail;
	}
	public void setInputEmail(String inputEmail) {
		this.inputEmail = inputEmail;
	}
	public String getInputDateOfAppointment() {
		return inputDateOfAppointment;
	}
	public void setInputDateOfAppointment(String inputDateOfAppointment) {
		this.inputDateOfAppointment = inputDateOfAppointment;
	}
	public String getInputTimeSlot() {
		return inputTimeSlot;
	}
	public void setInputTimeSlot(String inputTimeSlot) {
		this.inputTimeSlot = inputTimeSlot;
	}
	public String getInputDepartment() {
		return inputDepartment;
	}
	public void setInputDepartment(String inputDepartment) {
		this.inputDepartment = inputDepartment;
	}
	public String getInputDisease() {
		return inputDisease;
	}
	public void setInputDisease(String inputDisease) {
		this.inputDisease = inputDisease;
	}
	public String getInputDoctorName() {
		return inputDoctorName;
	}
	public void setInputDoctorName(String inputDoctorName) {
		this.inputDoctorName = inputDoctorName;
	}
	
}
