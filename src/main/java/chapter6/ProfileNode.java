package chapter6;

public class ProfileNode {

	private String name;
	private String phone;
	private String email;
	public ProfileNode link;
	
	public ProfileNode() {
		this.name = null;
		this.phone = null;
		this.email = null;
		this.link = null;
	}
	
	public ProfileNode(String name, String phone, String email) {
		this.name = name;
		this.phone = phone;
		this.email = email;
	} // 생성자
	
	public ProfileNode(String name, String phone, 
							String email, ProfileNode link) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.link = link;
	}
	
	
	public String getName() {
		return this.name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public String getEmail() {
		return this.email;
	}
} //end class
