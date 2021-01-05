/* Alexis Arellano Saturday October 10/2020 */

package ca.senecacollege.ict;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	

	public CommissionEmployee(String fName, String lName, String ssn, double sales, double commission) {
		super(fName, lName, ssn);
		// TODO Auto-generated constructor stub
		try {
			setGrossSales(sales);
			setCommissionRate(commission);
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
		}

	}


	public double getGrossSales() throws Exception {
		
		if (grossSales <= 0.0) {
			throw new Exception("ERROR: Gross Sales cannot be zero or negative.");
		} 
		else {
			return grossSales;
		}
		
	}


	public void setGrossSales(double grossSales) throws Exception {
		if(grossSales <= 0.0) {
			throw new Exception ("ERROR: Gross Sales cannot be zero or negative.");
		}
		else {
			this.grossSales = grossSales;
		}
	}


	public double getCommissionRate() throws Exception {
		if (commissionRate < 0.0 || commissionRate > 1.0) {
			throw new Exception("Commission Rate must be between 0.0 and 1.0.");
		} 
		else {
			return commissionRate;
		}
	}


	public void setCommissionRate(double commissionRate) throws Exception{
		if (commissionRate < 0.0 || commissionRate > 1.0) {
			throw new Exception("Commission Rate must be between 0.0 and 1.0.");
		}
		else {
			this.commissionRate = commissionRate;
		}
	}


	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		try {
			return (getCommissionRate() * getGrossSales());
		}
		catch (Exception exc) {
			System.out.println(exc.getMessage());
			return 0;
		}
		
	}


	@Override
	public String toString() {
		try {
		return super.toString() + "Commission { Gross Sales: " + getGrossSales() + "; Commission Rate: " + getCommissionRate() + "} ";
	
		}
		catch (Exception exc) {
			return exc.getMessage();
		}
	}
}
