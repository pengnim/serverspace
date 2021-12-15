package ch11_el;

import java.io.Serializable;

//Serializable : 원격지 컴에 객체 전송시 사용 
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;
	private String passwd;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
