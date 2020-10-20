package finalProjecct;

import java.util.Scanner;
import java.util.ArrayList;
public class Administrator {
	Scanner sc = new Scanner(System.in);
	int choice = 0;
	public void adminMenu() {
	System.out.print(Constants.LINE);
	do {
	System.out.print(Constants.ADMINMENU);
	choice = sc.nextInt();
	switch(choice) {
		case 1: {
			Item newItem = new Item();
			setItemData(newItem);
			break;
		}
		case 2:{
			Item i = new Item();
			System.out.println(Constants.LINE);
			System.out.println(Constants.ENTERITEMTOBEDELETED);
			i.setItemNuber(sc.nextInt());
			Item.ItemList.remove(i.getItemNumber());
			System.out.println(Constants.LINE);
			break;
		}
		case 3:{//generate reports insert heading
			//for(Item items: Item.ItemList) {
				for(int x=0; x<Item.ItemList.size(); x++)
				System.out.println("["+x+"] "+Item.ItemList.get(x).toString());
			//}
			break;
		} 
		case 4:{
			User newUser = new User();
			addAccountData(newUser);
			break;
		}
		case 5:{
			System.out.println(Constants.LINE);
			System.out.println(Constants.LOGOUTSUCCESS);
			System.out.println(Constants.LINE);
			
			Rename z = new Rename();
			User newLogin = new User();
			z.userLogin(newLogin);
			break;
		}
		case 6:{ //Just to View Registered Accounts
			for(User i: User.Admin) {
				System.out.println(i.getUsername());
				System.out.println(i.getPassword());
			}
			for(User z: User.Cashier) {
				System.out.println(z.getUsername());
				System.out.println(z.getPassword());
			}
			break;
		}
		default:
			System.out.println(Constants.INVALIDINPUT);
	}
		}while(choice < 5);
	
	}
	public void addAccountData(User i) {	
		System.out.println(Constants.LINE);
		System.out.println(Constants.ADMINADDUSER);
		System.out.print(Constants.SELECTUSERTPYE);
		i.setUserType(sc.nextInt());
		switch(i.getUserType()) {
		
		case 1:{
			System.out.println(Constants.LINE);
			System.out.println(Constants.ADDADMIN);
			System.out.print(Constants.ENTERUSERNAME);
			i.setUsername(sc.next());
			System.out.print(Constants.ENTERPASSWORD);
			i.setPassword(sc.next());
			for(User a: User.Admin) 
				if(i.getUsername().equalsIgnoreCase(a.getUsername())) {
					System.out.println(Constants.USERNAMEEXISTS);
					addAccountData(i);
				}
			User.Admin.add(i);
			System.out.println(Constants.LINE);
			System.out.println(Constants.USERUCCESSMESSAGE);
			System.out.println(Constants.LINE);
			break;
		}
		case 2:{
			System.out.println(Constants.LINE);
			System.out.println(Constants.ADDCASHIER);
			System.out.print(Constants.ENTERUSERNAME);
			i.setUsername(sc.next());
			System.out.print(Constants.ENTERPASSWORD);
			i.setPassword(sc.next());
			for(User a: User.Cashier) 
				if(i.getUsername().equalsIgnoreCase(a.getUsername())) {
					System.out.println(Constants.USERNAMEEXISTS);
					addAccountData(i);
				}
			User.Cashier.add(i);
			System.out.println(Constants.LINE);
			System.out.println(Constants.USERUCCESSMESSAGE);
			System.out.println(Constants.LINE);
			break;
			}
		}
	}
	public void setItemData(Item newItem) {
		System.out.println(Constants.LINE);
		System.out.print(Constants.ENTERITEMCODE);
		newItem.setItemCode(sc.next());
		for(Item x: Item.ItemList) 
			if(newItem.getItemCode().equals(x.getItemCode())) {
				System.out.println(Constants.ITEMEXSITS);
				setItemData(newItem);
			}
		System.out.print(Constants.ENTERITEMNAME);
		newItem.setItemName(sc.next());
		for(Item x: Item.ItemList) 
			if(newItem.getItemName().equals(x.getItemName())) {
				System.out.println(Constants.ITEMEXSITS);
				setItemData(newItem);
			}
		System.out.print(Constants.ENTERITEMQUANTITY);
		newItem.setItemQuantity(sc.nextInt());
		System.out.print(Constants.ENTERITEMPRICE);
		newItem.setItemPrice(sc.nextDouble());	
		System.out.println(Constants.ITEMSUCCESSMESSAGE);
		Item.ItemList.add(newItem);
		System.out.print(Constants.LINE);
	}
	
}

