/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * ReadFile.java, Mar 28, 2022 lmtrung
 */

package InputOutput.Ex1;

import java.io. BufferedReader;
import java.io.File;
import java.nio.charset. StandardCharsets;
import java.nio.file.Files;
import java.io.IOException;
/**
 * Doc noi dung file van ban
 * @author lmtrung
 */
public class ReadFile {
	public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';
    
    /**
     * Phuong thuc doc file
     * @param line dong trong file
     * @param br ep kieu toPath
     * throws IOException
     */ 
    public static void readFile() throws IOException {
    	//tao file dan toi duong dan .txt
    	File file = new File("..\\..\\..\\..\\..\\..\\file.txt"); 
        try {
        	//ep kieu toPath, bang ma chuan UTF8
            BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8); 
            String line = null;
            while(true) {
            	line = br.readLine();
            	
            	if(line == null) {
            		break;
            	} else {
            		System.out.println(line);
            	}
            }
        } catch (Exception e) {
        	System.out.println(e);
        }
    }
    
    /**
     * Phuong thuc dem so dong
     * @param line dong trong file
     * @param br ep kieu toPath
     * @param numberlines so dong
     * throws IOException
     */ 
    public static int numberLines() throws IOException {
    	//dem so ky tu
    	File file = new File("..\\..\\..\\..\\..\\..\\file.txt"); 
    	int numberlines = 1; //dong dau tien
        try {
        	//ep kieu toPath, bang ma chuan UTF8
            BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8); 
            String line = br.readLine();
          
            for (int i = 0; i < line.length(); i++) {
            	if (line.charAt(i) == TAB) { 
                	numberlines ++;
                }
            }
           
        } catch (Exception e) {
        	System.out.println(e);
        }
        return numberlines;
    }

    /**
     * Phuong thuc dem so ky tu
     * @param line dong trong file
     * @param br ep kieu toPath
     * @param numberchars so ky tu
     * throws IOException
     */ 
    public static int numberChars() throws IOException {
    	//dem so ky tu
    	File file = new File("..\\..\\..\\..\\..\\..\\file.txt"); 
    	int numberchars = 0;
        try {
        	//ep kieu toPath, bang ma chuan UTF8
            BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8); 
            String line = br.readLine();
          
            for (int i = 0; i < line.length(); i++) {
            	String chars = line.toLowerCase(); //chuyen doi chu hoa sang chu thuong
                if (chars.charAt(i) >= 'a' && chars.charAt(i) <= 'z' ) {
                  numberchars ++;
                }
            }
        	
        } catch (Exception e) {
        	System.out.println(e);
        }
        return numberchars;
    }
    
    /**
     * Phuong thuc dem so ky tu
     * @param line dong trong file
     * @param br ep kieu toPath
     * @param numberwords so tu
     * throws IOException
     */ 
    public static int numberWords() throws IOException {
    	 //dem so tu
    	File file = new File("..\\..\\..\\..\\..\\..\\file.txt"); 
    	int numberwords = 1;// bat dau tu dau tien
        try {
        	//ep kieu toPath, bang ma chuan UTF8
            BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8); 
            String line = br.readLine();
            
            for (int i = 0; i < line.length(); i++) {
            	// moi lan co dau cach hay xuong dong là co mot tu
                if (line.charAt(i) == SPACE || line.charAt(i) == TAB || line.charAt(i) == BREAK_LINE) { 
                	numberwords ++;
                }
            }
        	System.out.println("file co so tu la:" + numberwords);
        } catch (Exception e) {
        	System.out.println(e);
        }
        return numberwords;
    }
    
    /**
     * Phuong thuc chay va in ra ham main
     * @param args tham so truyen vao
     * @throws IOException
     */ 
    public static void main(String [] args) throws IOException {
    	readFile();
    	System.out.println("file co so dong la:" + numberLines());
    	System.out.println("file co so ky tu la:" + numberChars());
    	System.out.println("file co so tu la:" + numberWords());
    }
}