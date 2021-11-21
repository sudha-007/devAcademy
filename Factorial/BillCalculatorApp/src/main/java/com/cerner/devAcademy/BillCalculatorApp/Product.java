package com.cerner.devAcademy.BillCalculatorApp;


import org.apache.log4j.Logger;



/**
 * @author Anuj Singh
 *
 */
public class Product {
	// properties
      static final Logger logger = Logger.getLogger(Product.class);
	  private String pname;
	  private int qty;
	  private double price;
	  private double totalPrice;
	  
	  // constructor
	  Product(String pname, int qty, 
	              double price, double totalPrice) {
	    this.pname = pname;
	    this.qty = qty;
	    this.price = price;
	    this.totalPrice = totalPrice;
	  }

	  // getter methods
	  public String getPname() {
	    return pname;
	  }
	  public int getQty() {
	    return qty;
	  }
	  public double getPrice() {
	    return price;
	  }
	  public double getTotalPrice() {
	    return totalPrice;
	  }

	  // display
	  public void display() {
	    logger.info(pname+"      "+ qty+ "      "+ price+ "      "+ totalPrice);
	  }
}
