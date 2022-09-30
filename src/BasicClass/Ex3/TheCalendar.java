/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * theCalendar.java, Mar 22, 2022 lmtrung
 */

package BasicClass.Ex3;
import java.util.Date;
import java.util.Scanner;
import java.util.Calendar;
import java.text.*;

/**
 * 3 truong du lieu (day, month, year),
 * @author lmtrung
 */
public class TheCalendar {
	
	/**
	 * Phuong thuc tinh khoang cach thoi gian
	 * @param start thoi gian luc dau
	 * @param end thoi gian luc sau
	 * @param result hieu thoi gian
	 */ 
	public void partCalendar() {	
		// tinh khoang cach thoi gian
		long start = System.currentTimeMillis( );
		
		System.out.println("\nThoi gian luc dau: " +  Calendar.getInstance());
		
		System.out.println("\nThoi gian luc sau: " +  Calendar.getInstance());
		
		long end = System.currentTimeMillis( );
		
		long result = end - start;
		
		System.out.println("Hieu thoi gian la: " + result);
	   }
	
	/**
	 * Phuong thuc nhap ngay thang va thơi gian he thong 
	 * @param calendarinput thoi gian nhap vao
	 * @param currcalendar thoi gian cua he thong
	 * 
	 */ 
	public static void writecalendar() throws ParseException {	
		try {
		   Calendar calendar =  Calendar.getInstance(); // khoi tao mot doi tuong calendar
	       Calendar currentcalendar =  Calendar.getInstance();
		   Scanner scanner = new Scanner(System.in);// tạo đối tượng Scanner để lấy dữ liệu từ bàn phím

		   System.out.println("Nhap ngay, thang, nam: ");// nhập ngày, tháng , năm
		   calendar.set(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
		
		  
		   SimpleDateFormat currcalendar = new SimpleDateFormat (" yy.MM.dd ");// chuyển mốc thời gian ve đinh dang dd.MM.yyyy
	       
	       String calendarinput = String.valueOf(calendar.getTime()) + "." + String.valueOf(calendar.getTime()) + "." + String.valueOf(calendar.getTime());
	       String showtime = currcalendar.format(currentcalendar);
		   // in thi gian vừa nhập và thời gian thực tế
	       System.out.println("Thoi gian nhap vao: " + calendarinput);
		   System.out.println("Thoi gian hien tai : " + showtime);
		
		   //so sánh
		   
		   Date calendar1 = currcalendar.parse(calendarinput);
		   Date calendar2 = currcalendar.parse(showtime);
		   float comparecalendar = calendar1.compareTo(calendar2);
		   
		   if(comparecalendar > 0) { // nếu comparecalendar > 0 thì calendarl > calendar2
			    System.out.println(calendarinput +" sau ngay "+ showtime);
		   } else if(comparecalendar < 0) { //ngược lại
			    System.out.println(calendarinput +" truoc ngay "+ showtime);
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
		writecalendar();
		Calendar hieu = Calendar.getInstance();
		// tinh khoang cach
		hieu.partCalendar();
	}
}

	