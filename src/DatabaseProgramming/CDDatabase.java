/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * CDDatabase.java, Apr 25, 2022 lmtrung
 */

package DatabaseProgramming;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import DatabaseProgramming.MusicInfor;
/**
 * 
 * @author lmtrung
 */
public class CDDatabase {
	// Link kết nối đến database
	static String url = "jdbc:mysql://127.0.0.1:3306/cds";
	static String username = "root";
	static String password = "210599";
	
	/**
	 * Phương thức kết nối đến database 
	 * @return connection đối tượng kết nối
	 */
	public static Connection getConnection() throws SQLException {// connection function
		Connection connection = null;
		try {
			// Nạp Driver
			Class.forName("com.mysql.jdbc.Driver");
			// Tạo kết nối đến CSDL
			connection = DriverManager.getConnection (url, username, password);
				
		} catch (SQLException e) {
			System.out.println("Lỗi không kết női được MYSQL" + e.getMessage());
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy driver của MYSQL" + e.getMessage());
		}
		return connection;
	}
	                                                 
	/**
	 * Phương thức insert vào database 
	 * @param CD đối tượng của class MusicInfor
	 */
	public static void insertCD(MusicInfor CD) throws SQLException { 
		Connection connection = null;
		PreparedStatement prestatement = null;

		try {
			// Mở kết nối
			connection = getConnection();
			// Tạo câu truy vấn Insert dữ liệu vào table
			String insert = "INSERT INTO tbl_CDs" + "(id, artist, title)" + "VALUES(?, ?, ?)";
			// Gán dữ liệu cho câu truy vấn
			prestatement = connection.prepareStatement(insert);
			
			prestatement.setInt(1, CD.getId());
			prestatement.setString(2, CD.getArtist());
			prestatement.setString(3, CD.getTitle());
			
			// Thực thi câu truy vấn trả về kết quả.
			prestatement.execute(insert);
			
			System.out.println("Insert Successfull");
			
			// Sau khi insert, query lại để kiểm tra kết quả
            String select = "SELECT id, artist, title FROM tbl_cds";
            ResultSet result = prestatement.executeQuery(select);
            while(result.next()){
                // Lấy theo tên cột
                int id  = result.getInt("id");
                String artist = result.getString("artist");
                String title = result.getString("title");
                // Hiển thị giá trị trong bảng
                System.out.print("ID: " + id);
                System.out.print(", Artist: " + artist);
                System.out.print(", Title: " + title + "\n");
            }
			} catch (SQLException e) {
				System.out.println("CDDatabase InsertCD " + e.getMessage()); 
				throw e; 
			// Đóng kết nối
			} finally {
				if (prestatement != null) {
					prestatement.close();
				} if (connection != null) {
					  connection.close();
				}
			}
		}
	
	/**
	 * Phương thức delete ra khỏi database 
	 * @param CD đối tượng của class MusicInfor
	 */
	public static void removeCD(MusicInfor CD) throws SQLException { 
		Connection connection = null;
		PreparedStatement prestatement = null;
		try {
			// Mở kết nối
			connection = getConnection();
			// Tạo câu truy vấn delete dữ liệu ra khỏi database
			String delete = "DELETE FROM tbl_CDs WHERE artist = ?";
			// Gán dữ liệu cho câu truy vấn
			prestatement = connection.prepareStatement(delete);
			prestatement.setString(2, CD.getArtist());
			
			// Thực thi câu truy vấn trả về kết quả.
			prestatement.executeUpdate(delete);
			
			System.out.println("Delete Successfull");
			
			// Sau khi delete, query lại để kiểm tra kết quả
            String select = "SELECT id, artist, title FROM tbl_cds";
            ResultSet result = prestatement.executeQuery(select);
            while(result.next()){
                // Lấy theo tên cột
                int id  = result.getInt("id");
                String artist = result.getString("artist");
                String title = result.getString("title");
                // Hiển thị giá trị trong bảng
                System.out.print("ID: " + id);
                System.out.print(", Artist: " + artist);
                System.out.print(", Title: " + title + "\n");
            }
			} catch (SQLException e) {
				System.out.println("CDDatabase RemoveCD " + e.getMessage()); 
				throw e; 
			// Đóng kết nối
			} finally {
				if (prestatement != null) {
					prestatement.close();
				} if (connection != null) {
					  connection.close();
				}
			}
		}
	/**
	 * Phương thức tìm kiếm theo title
	 * @param title title của danh sách âm nhạc
	 * @return CD mảng các đối tượng CD của class MusicInfor
	 */
	public static List<MusicInfor> findByTitle(String title) throws Exception {
		// Tạo một đối tượng CD
		List<MusicInfor> CD = new ArrayList<>();
		Connection connection = null;
		PreparedStatement prestatement = null;
		ResultSet result = null;
	
		try{
			// Mở kết nối
			connection = getConnection();
			// Tạo câu truy vấn Lấy dữ liệu title
            String select = "SELECT title FROM tbl_cds WHERE title = ?" ;
            // Gán dữ liệu cho câu truy vấn
         	prestatement = connection.prepareStatement(select);
         	// Thực thi câu truy vấn trả về kết quả.
            result = prestatement.executeQuery(select);
            while(result.next()){
            	MusicInfor music = new MusicInfor();
            	music.setId(result.getInt(1));
            	music.setArtist(result.getString(2));
            	music.setTitle(result.getString(3));
            	// Thêm vào danh sách
            	CD.add(music);
            }
			} catch (SQLException e) {
				System.out.println("CDDatabase findByTitle " + e.getMessage()); 
				throw e; 
			// Đóng kết nối
			} finally {
				if (prestatement != null) {
					prestatement.close();
				} if (connection != null) {
					  connection.close();
				}
			}
			return CD;	
		}
}

