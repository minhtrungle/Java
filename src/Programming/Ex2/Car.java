/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Car.java, Mar 18, 2022 lmtrung
 */

package Programming.Ex2;

/**
 * class Car ke thua Vehicle
 * @author lmtrung
 */
class Car extends Vehicle {
	/**
	* Phuong thuc setSize
	* @param m phan tu thu nhat
	* @param n phan tu thu hai
	*/
	void move(int m , int n ) {
	}
	void setSize(int m, int n) {
		System.out.println("Method [setSize] from class [Car]");
	}
	/**
	* Phuong thuc setColor
	*/
	void setColor() {
		System.out.println("Method [setColor] from class [Car]");
	} 
}