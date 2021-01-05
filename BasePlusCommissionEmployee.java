/* Alexis Arellano Saturday October 10/2020 */

package ca.senecacollege.ict;

public class BasePlusCommissionEmployee extends CommissionEmployee {
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String fName, String lName, String ssn, double sales, double commission, double baseSalary) {
		super(fName, lName, ssn, sales, commission);
		// TODO Auto-generated constructor stub
		
		try {
			setBaseSalary(baseSalary);
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
		}
	}

	public double getBaseSalary() throws Exception {
		if (baseSalary <= 0) {
			throw new Exception("ERROR: Base salary cannot be zero or negative.");
		}
		else {
			return baseSalary;
		}
	}

	public void setBaseSalary(double baseSalary) throws Exception {
		if (baseSalary <= 0) {
			throw new Exception("ERROR: Base salary cannot be zero or negative.");
		}
		else {
			this.baseSalary = baseSalary;
		}
		
	}
	
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		try {
			return super.getPaymentAmount() + getBaseSalary();
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
			return 0;
		}
		
	}

	@Override
	public String toString() {
		try {
			return super.toString() + "{Base Salary: " + baseSalary + " }";
		}
		catch (Exception exc) {
			return exc.getMessage();
		}
		
	}

}
