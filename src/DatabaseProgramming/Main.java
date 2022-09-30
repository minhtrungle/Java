/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Main.java, Apr 25, 2022 lmtrung
 */

package DatabaseProgramming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.List;

import DatabaseProgramming.CDDatabase;
/**
 * Chạy chương trình
 * @author lmtrung
 */
public class Main {
	
	/**
	 * Phuong thuc testInsertDB
	 * @param   
	 */ 
	static void testInsertDB() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập id:");
		int id = scanner.nextInt();
		System.out.println("Nhập artist");
		String artist = scanner.nextLine();
		System.out.println("Nhập title:");
		String title = scanner.nextLine();
		
		MusicInfor music = new MusicInfor();
		CDDatabase.insertCD(music);
	}
	
	/**
	 * Phuong thuc testDeleteDB
	 * @param   
	 */
	static void testDeleteDB() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập artist cần xóa: ");
    	String artist = scanner.nextLine();
        
        CDDatabase.removeCD(artist);
    }
	
	/**
	 * Phuong thuc testFindByTitle
	 * @param   
	 */
	static void testFindByTitle() throws Exception {
        List<MusicInfor> CD = CDDatabase.findByTitle(null);
        
        CD.forEach((music) -> {
            System.out.println(music);
        });
    }
    
	/**
	 * Phuong thuc chay va in ra ham main
	 * @param  args tham so truyen vao  
	 */ 
	public static void main(String[] args) throws Exception {
		try {
			testInsertDB();
			testDeleteDB();
			testFindByTitle();
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		
	}
}