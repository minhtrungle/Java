/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * SubjectUser.java, Mar 29, 2022 lmtrung
 */

package InputOutput.Ex3;

import java.io.FileWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

import InputOutput.Ex3.*;

/**
 * Đoi tượng user bao gom cac thong tin: username, age, address, score.
 * @author lmtrung
 */
public class SubjectUser {
	
	/**
	 * Phuong thuc ghi file
	 * @param user doi tuong in ra
	 * @param fileoutput ghi file vao
	 * @param objectoutput ghi cac kieu du lieu vao fileoutput
	 */
	public static void writeFile() throws IOException {
		// dien cac doi tuong vao User
		User user1 = new User();
    	user1.setUserName("Le Minh A");
    	user1.setAge(20);
    	user1.setAddress("Ha Noi");
    	user1.setScore(7);
    	
    	User user2 = new User();
    	user2.setUserName("Le Minh B");
    	user2.setAge(21);
    	user2.setAddress("Thanh Hoa");
    	user2.setScore(8);
    	
    	User user3 = new User();
    	user3.setUserName("Le Minh C");
    	user3.setAge(22);
    	user3.setAddress("Nghe An");
    	user3.setScore(9);
    	
    	User user4 = new User();
    	user4.setUserName("Le Minh D");
    	user4.setAge(23);
    	user4.setAddress("Ha Tinh");
    	user4.setScore(10);
    	
    	User user5 = new User();
    	user5.setUserName("Le Minh E");
    	user5.setAge(24);
    	user5.setAddress("Hue");
    	user5.setScore(11);
    	
        //ghi file
        try {
            FileOutputStream fileoutput = new FileOutputStream("User.txt"); // tao fileoutput de ghi file vao
            ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);//tao objectoutput để ghi các kiểu 
            																	//dữ liệu nguyên thuỷ và các đối tượng Java vào một outputstream
            //ghi cac user vào file
            objectoutput.writeObject(user1);
            objectoutput.writeObject(user2);
            objectoutput.writeObject(user3);
            objectoutput.writeObject(user4);
            objectoutput.writeObject(user5);
            
            objectoutput.close();
            fileoutput.close();
            
        } catch (Exception e) {
        	System.out.println(e);
        }

    }
	
	/**
	 * Phuong thuc doc file
	 * @param user doi tuong in ra
	 * @param fileinput ghi file vao
	 * @param objectinput ghi cac kieu du lieu vao fileinput
	 * @param sum tong cac score
	 */
	public static void readFile() throws IOException {
		//doc file
        try {
            FileInputStream fileinput = new FileInputStream("User.txt");
            ObjectInputStream objectinput = new ObjectInputStream(fileinput);
            
            //doc doi tuong ra va in tong Score
            int sum = 0;
            while(fileinput.available() > 0){
            User user = (User) objectinput.readObject();
            System.out.println (user);
            
            sum += user.getScore();
            System.out.println ("tong cua score la: " + sum);
            }
            
            objectinput.close();
            fileinput.close();
             

        } catch (Exception e) {
        	System.out.println(e);
        }
	}
	
	/**
	    * Phuong thuc chay va in ra ham main
	    * @param  args tham so truyen vao  
	    */ 
    public static void main(String[] args) throws IOException {
    	writeFile();
    	readFile();
    }
}