package com.example.demo.form;

public class RegisterForm {
	
	/**ログインネーム*/
	private String name;
	
	/**メールアドレス*/
	private String email;
	
	/**パスワード*/
	private String password;

	public RegisterForm(String name, String email, String password) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public RegisterForm() {
		super();
	}

	@Override
	public String toString() {
		return "RegisterForm [name=" + name + ", email=" + email + ", password=" + password + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
