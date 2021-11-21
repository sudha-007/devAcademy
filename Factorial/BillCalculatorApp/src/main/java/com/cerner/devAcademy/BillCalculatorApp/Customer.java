package com.cerner.devAcademy.BillCalculatorApp;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;





/**
 * @author Anuj Singh
 *
 */
public class Customer {
	
	// variables
    String productName = null;
    int quantity = 0;
    double price = 0.0;
    double totalPrice = 0.0;
    double overAllPrice = 0.0;
    char choice = '\0';

    // create Scanner class object
    Scanner scan = new Scanner(System.in);
	//static final Logger logger = Logger.getLogger(App.class);

	public double calculateBill(){
		

    ArrayList<Product> product = new ArrayList<Product>();

    do {
      // read input values
      //logger.info("Enter product details,");
      //logger.info("Name: ");
      productName = scan.nextLine();
      //logger.info("Quantity: ");
      quantity = scan.nextInt();
      //logger.info("Price (per item): ");
      price = scan.nextDouble();

      // calculate total price for that product
      totalPrice = price * quantity;

      // calculate overall price
      overAllPrice += totalPrice;

      // create Product class object and add it to the list
      product.add( new Product(
          productName, quantity, price, totalPrice) );

      // ask for continue?
      //logger.info("Want to add more item? (y or n): ");
      choice = scan.next().charAt(0);

      // read remaining characters, don't store (no use)
      scan.nextLine();
    } while (choice == 'y' || choice == 'Y');

    // display all product with its properties
    for (Product p : product) {
      p.display();
    }

    // close Scanner
    scan.close();
    //logger.info("Bill generated at:" + timer());
    return overAllPrice;
  }
	public String timer() {
		LocalDateTime object = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:MM");
		return object.format(formatter);
	}

}
