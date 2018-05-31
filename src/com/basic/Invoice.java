package com.basic;

public class Invoice {
	String partNumber;
	String partDescripton;
	int quantity;
	double price;
	
	
	
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescripton() {
		return partDescripton;
	}
	public void setPartDescripton(String partDescripton) {
		this.partDescripton = partDescripton;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		if(quantity<0) {
			this.quantity=0;
		}
		else {
			this.quantity=quantity;
			
		}
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price<0) {
			this.price=0.0;
		}
		else
		{
			this.price=price;}
			
		
		

	}
	
public double getInvoiceAmount(){
	return quantity*price;
}
			public static void main(String[]args)
	{
		Invoice invoice1=new Invoice();
		
				invoice1.setQuantity(10);
				invoice1.setPrice(1000);
				invoice1.setPartDescripton("nut");
				System.out.println(invoice1.getQuantity());
				System.out.println(invoice1.getInvoiceAmount());
	}
				
				
				
		
	
	

}
