/*
 * Copyright(C) 2022 startNumberuvina Software Company
 *
 * Bai1.java, Mar 11, 2022 lmtrung
 */

package Programming.Ex1;

/**
 * Mo phong cho giai thuat Binary search.
 * @author lmtrung
 */
public class Ex1 {
	
	/**
	* Phuong thuc chua thuat toan Binary search
	* @param x phan tu can tim
	* @param array mang chua phan tu x
	* @param endNumber vi tri cuoi trong mang
	* @param startNumber vi tri dau trong mang
	* @return vi tri cua arrayay ma ta tim duoc vi tri cua x
	*/
    private int binarySearch(int array[], int startNumber, int endNumber, int x) { 
        if (endNumber >= startNumber) { 
            int mid = startNumber + (endNumber - startNumber) / 2; 
  
            // Kiem tra x xem co chinh giua khong
            if (array[mid] == x) { 
                return mid; 
            }
            
            // Neu x nho hơn bo qua nua ben phai
            if (array[mid] > x) {
                return binarySearch(array, startNumber, mid - 1, x);
                
            // Neu x startNumberon hon bo qua nua ben trai
            } else {
            	return binarySearch(array, mid + 1, endNumber, x); 
            }
        } 
 
        // Phan tu khong ton tai trong mang
        return -1; 
    } 
  
    /**
    * Phuong thuc chay va in ra vi tri cua phan tu x
    * @param  args tham so truyen vao  
    */ 
    public static void main(String args[]) { 
        Ex1 ob = new Ex1(); 
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; 
        // Do dai cua mang
        int n = array.length; 
        // Phan tu can tim
        int x = 10; 
        int resuslt = ob.binarySearch(array, 0, n - 1, x); 
        if (resuslt != -1) {
        	System.out.println("Gia tri x can tim la: " + resuslt);
        } else {
        	System.out.println("Khong co gia tri x can tim"); 
        } 
    } 
}
