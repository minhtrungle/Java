/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * GuessingGame.java, Mar 22, 2022 lmtrung
 */

package BasicClass.Ex1;

import java.util.Vector;

/**
 * Lop GuesssingGame
 * @author lmtrung
 */
public class GuessingGame {
	static int target;
	Vector<Integer> guesses = new Vector<Integer>();
	
	/**
	    * Ham constructor lay tham so int
	    * @param  target kieu int
	    * @param  guesses kieu vector
	    */ 
    void constructor (int target) {
    	guesses.add(100, 25); //capacity = 100, capacity increment = 25
    	System.out.println("Capacity ban dau: " +guesses.capacity()); 
    }
    
    /**
     * Phuong thuc sinh ngau nhien mot gia tri tu 1 den 100
     * @param min gia tri nho nhat
     * @param max gia tri lon nhat
     * @param i so ngau nhien tu 1 den 100
     */ 
    public void startGuessing() {
    	int min = 1, max = 100;
    	while (min < max) {
    		int i = (int)Math.random() * ( max - min + 1 ) + min;
    		if (i == target) {
    			break;
    		} else {
    			guesses.addElement(i); // them gia tri 
    		}
    	}
    }
    
    /**
     * Phuong thuc in tat ca phan tu co trong guesses
     * @param guesses.elementAt(i) Truy luc phan tu duoc cap phat tai muc duoc chi dinh
     * @param guesses.capacity() so cac phan tu trong gueses
     */ 
    public void printGuesses() {
    	for (int i = 0; i <= guesses.size(); i++ ) {
    	      System.out.println(guesses.elementAt(i) + ",");  //tai vi tri i
    	}
        System.out.println("Do lon cua guesses la:" + guesses.capacity()); 
    }
    
    /**
     * Phuong thuc chay ham main
     * @param args tham so truyen vao 
     * @param temp mot bien tam de phan tich gia tri nguyen cua tham so dau vao
     */ 
    public static void main(String args[]) { 
    	int temp = Integer.parseInt("args");
    	target = temp;
    	GuessingGame Game = new GuessingGame();
    	Game.startGuessing();
    	Game.printGuesses();
    }
}     
