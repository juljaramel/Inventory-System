package finalProjecct;
import java.util.ArrayList;

public class User {
	public static ArrayList<User> Admin = new ArrayList<User>();
	public static ArrayList<User> Cashier = new ArrayList<User>();
	
	private String username;
	private String password;
	private int usertype;
	
	public void setUsername(String name) {
		this.username = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setUserType(int userclass) {
		this.usertype = userclass;
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	public int getUserType() {
		return this.usertype;
	}
}
