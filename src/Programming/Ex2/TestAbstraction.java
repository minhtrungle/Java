/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * TestAbstraction.java, Mar 18, 2022 lmtrung
 */

package Programming.Ex2;

//import KyNangLapTrinhJava.Car;
//import KyNangLapTrinhJava.Vehicle;

/**
 * class TestAbstraction
 * @author lmtrung
 */
class TestAbstraction{
	  /**
	    * Phuong thuc chay va in ra ham main
	    * @param  args tham so truyen vao  
	    */
	public static void main(String args[]) {  
		//Vehicle a = new Car();	
		//int m = 0, n = 0;
		//a.setSize(m, n);  
		//a.setColor();
	} 
}
/* Trả lời câu hỏi
 1. Với câu khai báo sau
	Vehicle v = new Ferrary();
	lệnh đúng là lệnh: v.setSize(50, 80);
	
 2. Khai báo sau không hợp lệ vì hàm class Boat không kế thừa từ class Car
	Car c = new Boat();
	
 3. Với khai báo sau:

		Car c = new Ferrary();
	Lệnh sau sẽ in nội dung: Method [move] from class [Ferrary]
		setSize(10, 10);
*/
