/* Alexis Arellano Saturday October 10/2020 */

package ca.senecacollege.ict;

public class SalariedEmployee extends Employee{

	private double weeklySalary;
	
	public SalariedEmployee(String fName, String lName, String ssn, double weeklySalary) {
		super(fName, lName, ssn);
		// TODO Auto-generated constructor stub
		
		try {
			setWeeklySalary(weeklySalary);
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}

	public double getWeeklySalary() throws Exception {
		if (weeklySalary <= 0) {
			throw new Exception ("ERROR: Weekly salary cannot be zero or negative.");
		}
		else {
			return weeklySalary;
		}
	}

	public void setWeeklySalary(double weeklySalary) throws Exception {
		if(weeklySalary <= 0) {
			throw new Exception("ERROR: Weekly salary cannot be zero or negative.");
		}
		else {
			this.weeklySalary = weeklySalary;
		}
	}

	@Override
	public double getPaymentAmount() {
		try {
			return getWeeklySalary();
		}
		catch(Exception exc) {
			System.out.println(exc.getMessage());
			return 0;
		}
	}

	@Override
	public String toString() {
		try {
			return super.toString() + "Salary { Weekly Salary:" + getWeeklySalary() + "}";
		} 
		catch (Exception exc) {
			return exc.getMessage();
		}
		
	}

}
