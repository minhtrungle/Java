/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * ThrowsEx.java, Mar 15, 2022 lmtrung
 */

package Exception;

/**
 * Định nghĩa một Exception và sử dụng với khai báo throws
 * @author lmtrung
 */
public class ThrowsEx {
	
	/**
	 * Ham testThrows() khai bao throws
	 * 
	 */ 
	static void testThrows() throws IllegalAccessException {
        System.out.println("Trong testThrows(). ");
        throw new IllegalAccessException("demo");
    }
	
	/**
	 * Phuong thuc chay va in ra trong ham main
	 * @param  args tham so truyen vao  
	 */ 
    public static void main(String args[]) {
        try {
        	testThrows();
        } catch (IllegalAccessException e) {
            System.out.println("Trong main.");
        }
    }
}
