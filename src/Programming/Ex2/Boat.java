/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Boat.java, Mar 18, 2022 lmtrung
 */

package Programming.Ex2;


/**
 * class Boat ke thua Vehicle
 * @author lmtrung
 */
public class Boat extends Vehicle {
	/**
	* Phuong thuc move
	* @param m phan tu thu nhat
	* @param n phan tu thu hai
	*/
	void move(int m, int n) {
		System.out.println("Method [move] from class [Boat]");
	}
	void setSize(int m, int n) {
		System.out.println("Method [setSize] from class [Boat]");
	}
	void setColor() {
		System.out.println("Method [setColor] from class [Boat]");
	}
	
}