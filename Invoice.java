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

public class Invoice implements Payable{

	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	public Invoice (String partNum, String partDesc, int quant, int price) {
		setPartNumber(partNum);
		setPartDescription(partDesc);
		setQuantity(quant);
		setPricePerItem(price);
	}
	
	
	
	public String getPartNumber() {
		return partNumber;
	}



	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}



	public String getPartDescription() {
		return partDescription;
	}



	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getPricePerItem() {
		return pricePerItem;
	}



	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override
	public String toString() {
		return "Invoice: { Part Number: " + getPartNumber() + 
				"; Part Description: " + getPartDescription() + 
				"; Quantity: " + getQuantity() + "; Price per Item: " + getPricePerItem();
	}

	@Override
	public double getPaymentAmount() {
		double invoiceAmount = getQuantity() * getPricePerItem();
		return invoiceAmount;
	}

}
