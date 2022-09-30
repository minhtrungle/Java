/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Tester.java, Apr 1, 2022 lmtrung
 */

package InputOutput.Ex3;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author lmtrung
 */

import java.io.*;
public class Tester {
	public static void main(String[] args) {
		InputStream istream;
		OutputStream ostream=null;
		int c;
		final int EOF = -1;
		istream = System.in;
		File outFile =  new File("Data.txt");		 
		System.out.println("Type characters to write in File � Press Ctrl+z to end ");
		try {
			ostream = new FileOutputStream(outFile);
			while ((c = istream.read()) != EOF)
				ostream.write(c);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				istream.close();
				ostream.close();
			} catch (IOException e) {
				System.out.println("File did not close");
			}
		}
	}
}