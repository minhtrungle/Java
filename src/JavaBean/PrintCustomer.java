/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * PrintCustomer.java, Apr 4, 2022 lmtrung
 */

package JavaBean;

import java.io.IOException;

/**
 * Đoi tượng PrintCustomer bao gom cac thong tin: iD, name
 */
public class PrintCustomer {
	
	/**
	 * Phuong thuc set vao bean Customer iD =1 và name = Luvina sau do in cac gia tri nay tu bean Customer
	 * @param customer mot customer tu bean Customer
	 * @param iD id cua customer
	 * @param name ten cua customer
	 */
	public static void printCustomer() throws IOException {
		try {
		Customer customer = new Customer();
		customer.setiD(1);// set vao bean Customer
		customer.setName("Luvina");
		
		System.out.println(customer);
		
		} catch (Exception e) {
			System.out.println(e);
	    }
	}
	
	/**
	    * Phuong thuc chay va in ra ham main
	    * @param  args tham so truyen vao  
	    */ 
	public static void main(String[] args) throws IOException {
		printCustomer();
	}
}
