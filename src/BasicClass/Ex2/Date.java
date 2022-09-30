/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * Date.java, Apr 8, 2022 lmtrung
 */

package BasicClass.Ex2;
import java.io.Serializable;

/**
 * 
 * @author lmtrung
 */
public class Date {
	private int date;
	private int month;
	private int year;
	/**
	 * @return the date
	 */
	public int getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(int date) {
		this.date = date;
	}
	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
}
