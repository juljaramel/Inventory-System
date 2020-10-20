package finalProjecct;
import java.util.Scanner;

public class Rename {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args) {
	User i = new User();
	userLogin(i);
	}
		public static void userLogin(User i) {
		Administrator z = new Administrator();
		Cashier zz = new Cashier();
		System.out.println(Constants.MAINHEADER);
		System.out.print(Constants.ENTERUSERNAME);
		i.setUsername(sc.next());
		System.out.print(Constants.ENTERPASSWORD);
		i.setPassword(sc.next());
		if(i.getUsername().equals(Constants.DEFAULTUSERNAME)) {
			if(i.getPassword().equals(Constants.DEFAULTPASSWORD))
				z.adminMenu();
				else if(!i.getPassword().equals(Constants.DEFAULTPASSWORD)) {
					System.out.println(Constants.INVALIDPASSWORD);
					userLogin(i);
				}
				else if(!i.getUsername().equals(Constants.DEFAULTUSERNAME)){
					System.out.println(Constants.INVALIDUSERNAME);
					userLogin(i);
			}
		}
		for(User a: User.Admin) {
			if(i.getUsername().equals(a.getUsername())) {
				if(i.getPassword().equals(a.getPassword())) {
					z.adminMenu();
			}
				else if(!i.getPassword().equals(a.getPassword())) {
					System.out.println(Constants.INVALIDPASSWORD);
					userLogin(i);
				}
			}
		}
		for(User c: User.Cashier){
			if(i.getUsername().equals(c.getUsername())) {
				if(i.getPassword().equals(c.getPassword())) {
					zz.cashierMenu();
			}
				else if(!i.getPassword().equals(c.getPassword())) {
					System.out.println(Constants.INVALIDPASSWORD);
					userLogin(i);
			}
				else if(!i.getUsername().equals(c.getUsername())) {
					System.out.println(Constants.INVALIDUSERNAME);
					userLogin(i);
				}
			}
		}		
		for(User b: User.Admin) {
		if(!i.getUsername().equals(b.getUsername())) {
			System.out.println(Constants.INVALIDUSERNAME);
			userLogin(i);
			}
		}
	}
}
