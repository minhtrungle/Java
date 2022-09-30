/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Bai1.java, Mar 21, 2022 lmtrung
 */

package Exception.Ex1;

/**
 * 
 * @author lmtrung
 */
/*Root class of exception hierachy                                    Exception
 
 *Attemp to access ‘null’ object member             => Exception: java.lang.NullPointerException
                                                       Nếu chúng ta có bất kỳ biến nào có giá trị null, 
                                                       thực hiện bất kỳ hoạt động nào bởi biến đó sẽ xảy 
                                                       ra ngoại lệ NullPointerException.

 *Unable to load class                              => Exception: java.lang.NoClassDefFoundError
 *                                                     Khi phiên chuyển đổi Java JAR không thành công
 
 *Array size greater than 0, or greater than        => Exception: java.lang.ArrayIndexOutOfBoundsException
                                                       Kích thước mảng vượt quá kích thước khởi tạo
 
 *Invalid conversion of string to a numeric float   => Nhận được một java.lang.NullPointerException nếu đối số Chuỗi là null, 
                                                       nếu truyền một Chuỗi không thể phân tích cú pháp, 
                                                       sẽ nhận được java.lang.NumberFormatException
 
 *Inability to locate a file                        => java.io.FileNotFoundException
                                                       Do không định vị được tệp
 
 *A requested method does not exist                 => java.lang.IllegalArgumentException
  													   Phương thức đã được cung cấp một đối số hợp lệ, 
                                                       nó chỉ không tồn tại trong cơ sở dữ liệu  */