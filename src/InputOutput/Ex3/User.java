/*
 * Copyright(C) 2022 Luvina Software Company
 *
 * User.java, Mar 29, 2022 lmtrung
 */

package InputOutput.Ex3;

import java.io.Serializable;

/**
 * class been ten la User duoc implements tu Serializable
 * @author lmtrung
 */
public class User implements Serializable {
    private String userName;
	private int age;
    private String address;
    private int score;

    /**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	@Override
    /**
	 * Phuong thuc tra ve file in ra
	 * @returrn toString cac doi tuong nhap vao
	 */
    public String toString() {
        return "User{" + "UserName='" + userName + '\'' + ", Age=" + age + ", Address=" + address + ", Score='" + score + '\'' + '}';
    }
}