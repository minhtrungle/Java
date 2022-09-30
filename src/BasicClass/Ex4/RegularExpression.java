/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * regularExpression.java, Mar 23, 2022 lmtrung
 */

package BasicClass.Ex4;

import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Chuong trinh nhap va validate (su dung Regular Expression)
 * @author lmtrung
 */
public class RegularExpression {

	/**
	 * Phuong thuc nhap so dien thoai
	 * @param scanner doc du lieu dau vao la so dien thoai
	 * @param phone so dien thoai nhap vao
	 * @param p so dien thoai
	 */
    public static String getPhone() {
        Scanner scanner = new Scanner(System.in);//doi tuong goi tu java.util.Scanner;
        String phone = "";
        while (true) {
            System.out.print("Nhap so dien thoai: ");
            phone = scanner.nextLine(); //nhan gia tri tu ban phim
            
            // Dang XXXX-XXXX-XXXX)
            Pattern p = Pattern.compile("^[0-9]{4}-[0-9]{4}-[0-9]{4}");//Pattern xac đinh mot mau cho bo may regex.

            //matches()�?ể kiem tra tinh hop le dua tren chuoi mau cua mot Matcher tao ra tu Pattern.
            if (p.matcher(phone).find()) {
            	System.out.println("So dien thoai dung");
                break;
            } else {
                System.out.println("So dien thoai khong dung");
            }
        }
        
        return phone;
    }
    
    /**
	 * Phuong thuc nhap email
	 * @param scanner doc du lieu dau vao la email
	 * @param email dia chi email nhap vao
	 * @param e email
	 */
    public static String getEmail() {
        Scanner scanner = new Scanner(System.in);
        String email = "";
        while (true) {
            System.out.print("Nhap email: ");
            email = scanner.nextLine();
            Pattern e = Pattern.compile("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z]+(.[a-zA-Z]+)+"); // + viet duoc nhieu ky tu

            if (e.matcher(email).find()) {
            	System.out.println("Dia chi email dung");
                break;
            } else {
                System.out.println("Dia chi email khong dung");
            }
        }
        
        return email;
    }
    
    /**
     * Phuong thuc chay va in ra so dien thoai va email
     * @param  args tham so truyen vao  
     */ 
    public static void main(String[] args) {
        String phone = getPhone();
        String email = getEmail();
        System.out.println("So dien thoai la: " + phone);
        System.out.println("Dia chi email la: " + email);
        
    }
}
