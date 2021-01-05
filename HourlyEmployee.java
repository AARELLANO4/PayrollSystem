/**********************************************
 * Workshop 3 
 * Course: JAC444 - WINTER 2020
 * Last Name: Arellano
 * First Name: Alexis
 * ID: 155816184
 * Section: NDD
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 *  - AA
 * Date: Saturday October 10/2020
 * **********************************************/

package ca.senecacollege.ict;

public class HourlyEmployee extends Employee {

	private double wage;
	private double hours;
	
	public HourlyEmployee(String fName, String lName, String ssn, double wage, double hours) {
		super(fName, lName, ssn);
		// TODO Auto-generated constructor stub
		try {
			setWage(wage);
			setHours(hours);
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}

	public double getWage() throws Exception {
		if (wage <= 0.0){
			throw new Exception("ERROR: Wage cannot be zero or negative.");
		}
		else {
			return wage;
		}
	}


	public void setWage(double wage) throws Exception {
		if (wage <= 0.0){
			throw new Exception("ERROR: Wage cannot be zero or negative.");
		}
		else {
			this.wage = wage;
		}
		
	}

	public double getHours() throws Exception{
		if (hours < 0 || hours > 168.0) {
			throw new Exception("ERROR: Hours must be between 0.0 and 168.0");
		}
		else {
			return hours;
		}
		
	}

	public void setHours(double hours) throws Exception{
		if (hours < 0 || hours > 168.0) {
			throw new Exception("ERROR: Hours must be between 0.0 and 168.0");
		}
		else {
			this.hours = hours;
		}
	}

	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		
		try {
			if (getHours() > 40) {
				double payOut = (getHours() - 40) * (1.5 * getWage()) + (40 * getWage());
				return payOut; 
			}
			else {
				double payOut = getHours() * getWage();
				return payOut;
			}
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
			double payOut = 0;
			return payOut;
		}
		
	}
	
	@Override
	public String toString() {
		try {
		return super.toString() + "Hourly Employee { Wage:" + getWage() + "; Hours:" + getHours() + "}";
	
		}
		catch (Exception exc) {
			return exc.getMessage();
		}
	}
}
