/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Customer.java, Apr 4, 2022 lmtrung
 */

package JavaBean;

import java.io.Serializable;

/**
 * class been ten la Customer duoc implements tu Serializable
 * @author lmtrung
 */
public class Customer implements Serializable {
	private long iD;
	private String name;
	/**
	 * @return the iD
	 */
	public long getiD() {
		return iD;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setiD(long iD) {
		this.iD = iD;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Phuong thuc tra ve file in ra
	 * @returrn toString cac doi tuong nhap vao
	 */
    public String toString() {
        return "Customer{" + "iD='" + iD + '\'' + ", name=" + name  + '}';
    }
}

