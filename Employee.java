/* Alexis Arellano Saturday October 10/2020 */

package ca.senecacollege.ict;

abstract class Employee implements Payable {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee(String fName, String lName, String ssn) {
		setFirstName(fName);
		setLastName(lName);
		setSocialSecurityNumber(ssn);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public String toString() {
		return "Employee: " + getFirstName() + " " + getLastName() + "; SSN: " + getSocialSecurityNumber() + "; ";
	}	
	
	
}
