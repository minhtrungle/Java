/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Ferrary.java, Mar 18, 2022 lmtrung
 */

package Programming.Ex2;


/**
 * class Ferrary ke thua Car
 * @author lmtrung
 */
class Ferrary extends Car {
	void move(int m, int n) {
		System.out.println("Method [move] from class [Ferrary]");
	}
	void setSize(int m, int n) {
		System.out.println("Method [setSize] from class [Ferrary]");
	}
	void moveRelative(int m, int n) {
		System.out.println("Method [moveRelative] from class [Ferrary]");
	}
}