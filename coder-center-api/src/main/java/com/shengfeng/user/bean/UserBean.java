package com.shengfeng.user.bean;

import java.io.Serializable;

public class UserBean implements Serializable{

	private static final long serialVersionUID = -5621716534400078000L;
	
	private long id ;
	private String  username;//�û���
	private String password;//����
	private String level;//�ȼ�
	private int sex;//�Ա�
	private String mobilephone;//�ֻ���
	private String img;// ͷ��
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getMobilephone() {
		return mobilephone;
	}
	public void setMobilephone(String mobilephone) {
		this.mobilephone = mobilephone;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	
}
