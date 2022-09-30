/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Calculate.java, Apr 5, 2022 lmtrung
 */

package JavaSwing;

import javax.swing.*;
import java.awt .event. *;
import java.awt.*; 

/**
 * Chuong trinh mo phong may tinh đien tu, nhap vao 2 so
 * @author lmtrung
 */
public class Calculator extends JFrame implements ActionListener { 
	
	private Container cont; /*Dùng để nhận tầng ContentPane của JFrame*/
	private JLabel label1, label2, result; /*Dùng để lưu nhập số và kết quả*/
	private JTextField textfield1, textfield2; /*Dùng để chứa 2 số và 1 kết quả*/
	private JButton add, sub, mul, div; /*Dùng để biểu diễn 4 nút của 4 phép toán +, -, x, /  */
	
	/**
	 * Phuong thuc giao dien
	 * @param cont nhan tàn ContentPane cua Jframe
	 * @param label1 nhap so thu nhat
	 * @param label2 nhap so thu hai
	 * @param textfield1 o chua so thu nhat
	 * @param textfield2 o chua so thu hai
	 * @param add, sub, mul, div result lan luot la cong, tru , nhan , chia va ket qua
	 */
	public Calculator(String s) {
		super(s);
	    setTitle(" Simple Calculator "); 
	    setSize(300,300);
	    setLocationRelativeTo(null);
	    setDefaultCloseOperation(EXIT_ON_CLOSE);
	    
	    /*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/
	    cont = getContentPane();
	    cont.setLayout(null);
	    
	    /*Tạo các thành phần trên giao diện*/
	    label1 = new JLabel("Enter first number:");
	    label1.setBounds(10,20,120,20);
	    cont.add(label1);
	    
	    textfield1 = new JTextField(); 
	    textfield1.setBounds(120, 20, 100, 20);
	    cont.add(textfield1);
	    
	    label2 = new JLabel("Enter second number:");
	    label2.setBounds(230,20,120,20);
	    cont.add(label2);
	   
	    textfield2 = new JTextField(); 
	    textfield2.setBounds(370, 20, 100, 20);
	    cont.add(textfield2);
	    
	    /*Tao 4 nút biểu diễn 4 phép toán*/
	    add = new JButton("+");
	    add.setBounds(10,80,50,30);
	    cont.add(add) ;
	    
	    sub = new JButton("-");
	    sub.setBounds (70,80,50,30);
	    cont.add(sub);
	    
	    mul =new JButton("x");
	    mul.setBounds (130,80,50,30) ;
	    cont.add(mul);
	    
	    div = new JButton("/");
	    div.setBounds (190,80,50,30);
	    cont.add(div) ;
	    
	    result = new JLabel("Resul: ");
	    result.setBounds(10, 120, 150, 20);
	    cont.add(result);
	    
	    add.addActionListener(this);
	    sub.addActionListener(this);
	    mul.addActionListener(this);
	    div.addActionListener(this);
	    
	    /*Thiết lập kích thước hiển thị*/
	    setVisible(true);
	}
	/**
	 * Phuong thuc thuc hien tinh toan
	 * @param a so thu nhat
	 * @param b so thu hai
	 * @param c ket qua
	 */
	public void actionPerformed(ActionEvent e) {
		try {
		/*Định nghĩa hàm cộng*/	
		if (e.getSource() == add) {
			int a = Integer.parseInt (textfield1.getText());
	       	int b = Integer.parseInt (textfield2.getText());
	       	int c = a + b;
	       	result.setText("Result: " + c);
		}
		/*Định nghĩa hàm trừ*/
		if (e.getSource() == sub) {
			int a = Integer.parseInt (textfield1.getText());
			int b = Integer.parseInt (textfield2.getText());
	       	int c = a - b;
	       	result.setText("Result: " + c);
		}
		/*Định nghĩa hàm nhân*/
		if (e.getSource() == mul) {
			int a = Integer.parseInt(textfield1.getText());
			int b = Integer.parseInt(textfield2.getText());
			int c = a * b;
			result.setText("Result: " + c);
	    }
		/*Định nghĩa hàm chia*/
		if (e.getSource() ==div) {
			int a = Integer.parseInt(textfield1.getText ());
	    	int b = Integer.parseInt(textfield2.getText ());
	    	int c = a / b;
	    	result.setText("Result:" + c);
	    }
		
		} catch(NumberFormatException message) {
			result.setText(" Hay nhap so nguyen "); /*Nếu nhập số k phải số nguyên*/
		} catch(ArithmeticException message) {
			result.setText (" Khong chia het cho 0 "); /*Nếu chia số thứ 2 là số 0*/
		}
	}

	/**
	    * Phuong thuc chay va in ra ham main
	    * @param  args tham so truyen vao  
	    */ 
	public static void main(String args[])
	{
		/*Tạo giao diện chương trình*/
		Calculator calculator = new Calculator(" Simple Calculator ");
		calculator.setLocationRelativeTo(null);
	}
}