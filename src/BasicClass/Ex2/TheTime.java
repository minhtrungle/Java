/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * theTime.java, Mar 22, 2022 lmtrung
 */

package BasicClass.Ex2;

import java.util.Date;
import java.text.*; 
import java.util.Scanner;
/**
 * 3 truong du lieu (day, month, year),
 * @author lmtrung
 */
public class TheTime {
	
	/**
	 * Phuong thuc tinh khoang cach thoi gian
	 * @param start thoi gian luc dau
	 * @param end thoi gian luc sau
	 * @param result hieu thoi gian
	 */ 
	public void partDate() {	
		// tinh khoang cach thoi gian
		long start = System.currentTimeMillis( );
		
		System.out.println("\nThoi gian luc dau: " + new Date());
		
		System.out.println("\nThoi gian luc sau: " + new Date());
		
		long end = System.currentTimeMillis( );
		
		long result = end - start;
		
		System.out.println("Hieu thoi gian la: " + result);
	   }
	
	/**
	 * Phuong thuc nhap ngay thang va thơi gian he thong 
	 * @param dateinput thoi gian nhap vao
	 * @param currDate thoi gian cua he thong
	 * 
	 */ 
	public static void writeDate() throws ParseException {	
		try {
		   Date date = new Date(); // khoi tao mot doi tuong Date
	       Date currentDate = new Date();
		   Scanner scanner = new Scanner(System.in);// tạo đối tượng Scanner để lấy dữ liệu từ bàn phím

		   System.out.println("Nhap ngay: ");// nhập ngày
		   date.setDate(scanner.nextInt());
		
		   System.out.println("Nhap thang:");// nhập tháng
		   date.setMonth(scanner.nextInt());
		   
		   System.out.println("Nhap nam:");// nhập năm
		   date.setYear(scanner.nextInt());
		   
		   SimpleDateFormat currDate = new SimpleDateFormat (" yy.MM.dd ");// chuyển mốc thời gian ve đinh dang dd.MM.yyyy
	       
	       String dateinput = String.valueOf(date.getDay()) + "." + String.valueOf(date.getMonth()) + "." + String.valueOf(date.getYear());
	       String showtime = currDate.format(currentDate);
		   // in thi gian vừa nhập và thời gian thực tế
	       System.out.println("Thoi gian nhap vao: " + dateinput);
		   System.out.println("Thoi gian hien tai : " + showtime);
		
		   //so sánh
		   Date date1 = currDate.parse(dateinput);
		   Date date2 = currDate.parse(showtime);
		   float compareDate = date1.compareTo(date2);
		   
		   if(compareDate > 0) { // nếu compareDate > 0 thì datel > date2
			    System.out.println(dateinput +" sau ngay "+ showtime);
		   } else if(compareDate < 0) { //ngược lại
			    System.out.println(dateinput +" truoc ngay "+ showtime);
		   }  else { 
			    System.out.println("trung nhau");
		   }
		} catch (ParseException e) {
			  e.printStackTrace();
		}
	}
	 
	/**
	 * Phuong thuc chay va in ra ham main
	 * @param  args tham so truyen vao  
	 */ 
	public static void main(String args[]) throws ParseException {
		writeDate();
		TheTime hieu = new TheTime();
		// tinh khoang cach
		hieu.partDate();
	}
}
