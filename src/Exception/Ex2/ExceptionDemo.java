/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * ExceptionDemo.java, Mar 25, 2022 lmtrung
 */

package Exception.Ex2;

/**
 * 
 * @author lmtrung
 */
public class ExceptionDemo {
	/**
	 * Ham phepChia() khai bao throw MyException
	 * @param a tu so
	 * @param b mau so
	 * @param result ket qua
	 */
    static void phepChia(int a, int b) throws MyException {
        try {
        	int result = a / b;
        	System.out.println("Ket qua phep chia" + result);
        } catch (Exception message) {
        	throw new MyException("Khong chia het cho 0");
        }
    
    }
    /**
     * Phuong thuc chay va in ra ham main
     * @param args tham so truyen vao  
     * @param message thong bao Exception
     */ 
    public static void main(String args[]) {
    	try {
    	  phepChia(9, 0);
        } catch (Exception message) {
            System.out.println("Exception is: " + message);
        }
    }
}
