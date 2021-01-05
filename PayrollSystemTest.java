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

public class PayrollSystemTest {
	public static void main (String[] args) {
		BasePlusCommissionEmployee emp1 = new BasePlusCommissionEmployee("John","Dee","111-111-111", 500.00,0.20,25000.00);
		CommissionEmployee emp2 = new CommissionEmployee("Jack","Barney", "222-222-222", 25000, 0.12);
		HourlyEmployee emp3 = new HourlyEmployee("Tom","Zegas","333-333-333",14.00,40.00);
		SalariedEmployee emp4 = new SalariedEmployee("Laura","Ingam","444-444-444",500);
	
		System.out.println("===== PAYROLL SYSTEM =====\n");
		System.out.printf("%s\n%s $%.2f\n\n", emp1, " earned: ", emp1.getPaymentAmount());
		System.out.printf("%s\n%s $%.2f\n\n", emp2, " earned: ", emp2.getPaymentAmount());
		System.out.printf("%s\n%s $%.2f\n\n", emp3, " earned: ", emp3.getPaymentAmount());
		System.out.printf("%s\n%s $%.2f\n\n", emp4, " earned: ", emp4.getPaymentAmount());
	
		
		Employee[] employeeArray = new Employee[4];
		employeeArray[0] = emp1;
		employeeArray[1] = emp2;
		employeeArray[2] = emp3;
		employeeArray[3] = emp4;
		
		System.out.println("===== POLYMORPHIC DISPLAY =====\n");
		
		for (Employee e : employeeArray) {
			System.out.printf("%s\n%s $%.2f\n\n", e, " earned: ", e.getPaymentAmount());
		}
		
		System.out.println("===== Employee SubClass =====\n");
		for (Employee e : employeeArray) {
			if (e instanceof BasePlusCommissionEmployee) {
				System.out.println((BasePlusCommissionEmployee)e);
				System.out.println(e.getFirstName() + " is a Base + Commission Employee.\n");
			}	
		}
		
		System.out.println("===== Finding Specific Class =====\n");
		for (Employee e : employeeArray) {
			System.out.println("Employee: " + e.getFirstName() + " " + e.getLastName() 
				+ " is of " + e.getClass());
			System.out.println();
		}	
		
	}
}
