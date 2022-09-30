/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * ThrowEx.java, Mar 15, 2022 lmtrung
 */

package Exception;

/**
 * Định nghĩa một Exception và sử dụng với khai báo throw
 * @author lmtrung
 */
public class ThrowEx {
	
	/**
	 * Ham testThrow() khai bao throw
	 * 
	 */ 
	static void testThrow() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Trong testThrow()");
            throw e; // Nem lai ngoai le
        }
    }
	
	/**
	 * Phuong thuc chay va in ra trong ham main
	 * @param  args tham so truyen vao  
	 */ 
    public static void main(String args[]) {
        try {
        	testThrow();
        } catch (NullPointerException e) {
            System.out.println("Trong main.");
        }
    }
}
