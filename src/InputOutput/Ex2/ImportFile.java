/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * ImportFile.java, Mar 28, 2022 lmtrung
 */

package InputOutput.Ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Nhap vao ten mot file nguon va ten thu muc chua file đich
 * @author lmtrung
 */
public class ImportFile {
	
	/**
     * Phuong thuc chay va in ra ham main
     * @param args tham so truyen vao
     * @param sourceFile file nguon
     * @param destinationFolder folder dich
     */ 
	public static void main(String[] args) throws IOException {

		// File nguồn (Source file).
		File sourceFile = new File("D:\\Ky_20212\\Thuc tap Luvina Software\\file\\file nguon\\Sourcefile.txt");

		// Folder đích (Destination folder).
		File destinationFolder = new File("D:\\Ky_20212\\Thuc tap Luvina Software\\file\\file dich");
		
		//goi phuong thuc de copy file
		try {
			copyFile(sourceFile, destinationFolder);
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	/**
	 * Phuong thuc copy file nguon vao thu muc dich
	 * @param scanner doc du lieu dau vao la email
	 * @param input du lieu file nguon
	 * @param output du lieu thu muc dich
	 * @param maxlength do dai toi da tren moi dong
	 * @param linelength do dai tren moi dong
	 */
	 private static void copyFile(File sourceFile, File destinationFolder)  throws IOException {
		if (!sourceFile.exists()) { // kiem tra ton tai cua file
			System.out.println("Source File khong ton tai");
			return;
		} else if (!destinationFolder.isDirectory()) { 
					destinationFolder.mkdirs(); //tao duong dan den thu muc
					System.out.println("thu muc da duoc dao!\n" + destinationFolder );
				// copy file tu thuc muc nguon den thu muc dich
				 	
	            InputStream input = null;
	            OutputStream output = null;
	            try {
	            	input = new FileInputStream(sourceFile); //doc du lieu tu file nguon.
	            	output = new FileOutputStream(destinationFolder); //ghi du lieu vao thu muc dich.
	                byte[] maxlength= new byte[1024]; //do dai toi da tren moi dong
	                int linelength;
	                while ((linelength = input.read(maxlength)) > 0) {
	                    output.write(maxlength, 0, linelength);
	                }
	                System.out.println("File copy " + destinationFolder);
	            } finally {
	                input.close();
	                output.close();
	            }
				}
	 }
}
	


